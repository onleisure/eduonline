package com.atguigu.eduonline.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.eduonline.bean.EduUser;
import com.atguigu.eduonline.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EduUserInfoController {

    @Reference
    private ManageService manageService;

    @RequestMapping("getEduUserList")
    @ResponseBody
    public List<EduUser> getEduUserList(){
        List<EduUser> eduUserInfoList = manageService.getEduUserInfoList();
        return eduUserInfoList;
    }



}
