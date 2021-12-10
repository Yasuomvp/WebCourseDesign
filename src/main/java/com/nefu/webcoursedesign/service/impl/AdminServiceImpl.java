package com.nefu.webcoursedesign.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nefu.webcoursedesign.entity.Admin;
import com.nefu.webcoursedesign.mapper.AdminMapper;
import com.nefu.webcoursedesign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findById(String id) throws Exception {
        return adminMapper.selectById(id);
    }

    @Override
    public Admin findByUsername(String username) throws Exception {
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        adminQueryWrapper.select().eq("username",username);
        return adminMapper.selectOne(adminQueryWrapper);
    }
}
