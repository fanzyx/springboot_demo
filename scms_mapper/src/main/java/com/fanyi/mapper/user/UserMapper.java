package com.fanyi.mapper.user;

import com.fanyi.vo.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户mapper接口
 * @author wangyds
 */
@Mapper
public interface UserMapper {

	/**
	 * 根据名字和权限获取用户
	 *
	 * @param name
	 * @param role
	 * @return
	 */
	List<User> getUserList(@Param("name") String name, @Param("role") Integer role);

}