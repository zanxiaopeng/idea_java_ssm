package com.rsx.api.controller;

import com.rsx.api.pojo.User;
import com.rsx.api.service.impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查用户信息返回json
     * @param id
     * @return
     */
    @RequestMapping("info/{id}")
    @ResponseBody
    public User getUserByid(@PathVariable Integer id) {
        User u = userService.selectUser(id);
        return u;
    }


}
