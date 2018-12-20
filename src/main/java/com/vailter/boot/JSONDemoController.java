package com.vailter.boot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Spring Boot 中返回 JSON 数据
 * 转自：<a href="https://mp.weixin.qq.com/s/cFztjzQttMwBQJqAowUZ2A"></a>
 *
 * @author taoshiyun
 */
@RestController
public class JSONDemoController {
    @GetMapping(value = "user/{userId}")
    public User getUserInfo(@PathVariable("userId") Long userId) {
        User user = User.builder()
                .name("vailter")
                .userId(userId)
                .address("马鞍山")
                .build();

        ObjectMapper objectMapper = new ObjectMapper();

        //手动完成对象 和 Json 的互转
        /*String userJsonStr = null;
        try {
            userJsonStr = objectMapper.writeValueAsString(user);
            User jsonUser = objectMapper.readValue(userJsonStr, User.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        return user;
    }

    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public User index(){
        User user = User.builder()
                .name("vailter")
                .userId(1L)
                .address("马鞍山")
                .build();
        return user;
    }


    //http://localhost:8080/xml
    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public User XML(){
        User user = User.builder()
                .name("vailter")
                .userId(2L)
                .address("马鞍山")
                .build();
        return user;
    }

    @GetMapping(value = "xml/user/{userId}", produces = MediaType.APPLICATION_XML_VALUE)
    public UserXmlVO testXml(@PathVariable Long userId) {
        return UserXmlVO.builder()
                .userId(userId)
                .name("test")
                .orderList(null)
                .build();
    }
}
