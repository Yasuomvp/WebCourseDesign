package com.nefu.webcoursedesign.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nefu.webcoursedesign.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select r.* from role r,admin_and_role aar where r.id = aar.role_id and aar.admin_id = #{id}")
    List<Role> findAllRolesByAdminId(String id);

}
