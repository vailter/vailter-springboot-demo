package com.vailter.boot;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@JacksonXmlRootElement(localName = "response")
//@XmlRootElement
@Data
@Builder
public class UserXmlVO {
    @JacksonXmlProperty(localName = "user_id")
    private Long userId;

    @JacksonXmlProperty(localName = "user_name")
    private String name;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "order_info")
    private List<OrderInfoVO> orderList;
}
