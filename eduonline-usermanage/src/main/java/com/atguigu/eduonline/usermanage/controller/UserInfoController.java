package com.atguigu.eduonline.usermanage.controller;

import com.atguigu.eduonline.bean.EduUser;
import com.atguigu.eduonline.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<EduUser> findAll(){
        List<EduUser> userList = userInfoService.getUserInfoList();
        return  userList;
    }



}
