package com.nefu.webcoursedesign.service.impl;

import com.nefu.webcoursedesign.entity.Role;
import com.nefu.webcoursedesign.mapper.RoleMapper;
import com.nefu.webcoursedesign.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAllRolesByAdminId(String id) throws Exception {
        return roleMapper.findAllRolesByAdminId(id);
    }
}
