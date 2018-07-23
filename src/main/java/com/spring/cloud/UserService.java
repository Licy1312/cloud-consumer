package com.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * Author:Jinmu
 * Date: 2018/2/8
 */
@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    public User getOneUser(Integer id) {
        return restTemplate.getForObject("http://server-client/id/"+id,User.class);
    }

    public String getUserPort(String name) {
        return restTemplate.getForObject("http://server-client/user/"+name,String.class);
    }
}
