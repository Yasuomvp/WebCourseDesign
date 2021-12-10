package com.nefu.webcoursedesign.service;

import com.nefu.webcoursedesign.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    Admin findById(String id) throws Exception;

    Admin findByUsername(String username) throws Exception;

}
