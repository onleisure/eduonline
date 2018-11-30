package com.atguigu.eduonline.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.eduonline.bean.EduUser;
import com.atguigu.eduonline.usermanage.mapper.UserInfoMapper;
import com.atguigu.eduonline.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Reference
    private UserInfoMapper userInfoMapper;

    @Override
    public List<EduUser> getUserInfoList() {
        return userInfoMapper.selectAll();
    }
}
