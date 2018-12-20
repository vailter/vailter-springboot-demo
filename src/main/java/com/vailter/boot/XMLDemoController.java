package com.vailter.boot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回 XML 数据
 * <a href="https://mp.weixin.qq.com/s/cFztjzQttMwBQJqAowUZ2A"></a>
 *
 * @author taoshiyun
 */
@RestController
public class XMLDemoController {
    /*@RequestMapping(value = "xml/user/${userId}", produces = MediaType.APPLICATION_XML_VALUE)
    public UserXmlVO testXml(@PathVariable Long userId) {
        return UserXmlVO.builder()
                .userId(userId)
                .name("test")
                .orderList(null)
                .build();
    }*/
}
