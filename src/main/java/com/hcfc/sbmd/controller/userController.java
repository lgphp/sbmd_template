package com.hcfc.sbmd.controller;

import com.hcfc.sbmd.model.UserModel;
import com.hcfc.sbmd.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by lgphp on 7/26/17.
 */

@Controller

public class userController {
    @Autowired
    private UserProvider userProvider;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String userinfo_v2(Map<String, Object> m) {
        m.put("data", userProvider.findUser(1));
        return "home";
    }

    @RequestMapping(value = "/userinfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody
    UserModel userinfo() {

        return userProvider.findUser(2);

    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    String test() {

        return "欢迎使用springboot";

    }

}
