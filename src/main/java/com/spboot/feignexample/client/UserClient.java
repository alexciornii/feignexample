package com.spboot.feignexample.client;

import com.spboot.feignexample.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("feign-example")
public interface UserClient {

    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    User getUser();

}
