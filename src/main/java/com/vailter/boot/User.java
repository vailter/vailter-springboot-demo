package com.vailter.boot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * 自定义Json格式
 * @author taoshiyun
 */
@Data
@Builder
public class User {
    private Long userId;
    @JsonProperty("user-name")
    private String name;
    @JsonIgnore
    private String address;
    /**
     * 可用来动态包含属性的标签，如可以不包含为 null 值的属性；可以用在Class上
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memo;
}
