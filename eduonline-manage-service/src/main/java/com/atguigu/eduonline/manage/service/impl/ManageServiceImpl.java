package com.atguigu.eduonline.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.eduonline.bean.EduUser;
import com.atguigu.eduonline.manage.mapper.EduUserInfoMapper;
import com.atguigu.eduonline.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ManageServiceImpl implements ManageService{

    @Autowired
    private EduUserInfoMapper eduUserInfoMapper;

    @Override
    public List<EduUser> getEduUserInfoList() {
        List<EduUser> eduUserInfoList = eduUserInfoMapper.selectAll();
        return eduUserInfoList;
    }
}
