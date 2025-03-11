package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.bean.Role;
import org.sang.bean.User;

import java.util.List;

/**
 * Created by sang on 2017/12/17.
 */
@Mapper
public interface UserMapper {

    //根据用户名返回用户信息
    //@Param("username") 用于指定方法参数在SQL语句中的参数名
    User loadUserByUsername(@Param("username") String username);

    //用户注册，返回插入记录的主键值，用于自增主键
    long reg(User user);

    //更新用户的邮箱
    int updateUserEmail(@Param("email") String email, @Param("id") Long id);

    //通过昵称返回有该昵称的所有用户
    List<User> getUserByNickname(@Param("nickname") String nickname);

    //获取所有角色列表
    List<Role> getAllRole();

    //更新用户的启用状态
    int updateUserEnabled(@Param("enabled") Boolean enabled, @Param("uid") Long uid);

    //删除用户
    int deleteUserById(Long uid);

    //通过uid删除用户角色
    int deleteUserRolesByUid(Long id);
    //设置角色
    int setUserRoles(@Param("rids") Long[] rids, @Param("id") Long id);

    //通过id返回用户
    User getUserById(@Param("id") Long id);
}
