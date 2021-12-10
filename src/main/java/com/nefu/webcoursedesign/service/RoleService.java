package com.nefu.webcoursedesign.service;

import com.nefu.webcoursedesign.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    List<Role> getAllRolesByAdminId(String id) throws Exception;
}
