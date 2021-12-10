package com.nefu.webcoursedesign.security;

import com.nefu.webcoursedesign.entity.Admin;
import com.nefu.webcoursedesign.entity.Role;
import com.nefu.webcoursedesign.service.AdminService;
import com.nefu.webcoursedesign.service.RoleService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminUserDetailService implements UserDetailsService {

    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) {
        System.out.println("AAA");
        Admin admin = adminService.findByUsername(username);
        if(admin==null){
            throw new Exception("用户不存在");
        }

        List<Role> roles = roleService.getAllRolesByAdminId(admin.getId());
        List<GrantedAuthority> authorities = new ArrayList<>();
        roles.forEach( role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        } );

        return new User(
                admin.getUsername(),
                passwordEncoder.encode(admin.getPassword()),
                authorities
        );

    }
}
