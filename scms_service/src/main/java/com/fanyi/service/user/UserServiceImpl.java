package com.fanyi.service.user;

import com.fanyi.mapper.user.UserMapper;

import com.fanyi.vo.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务实现类
 * @author wangyds
 * @date 2019/04/11
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> getUserList(String name, Integer role) {

		return userMapper.getUserList(name, role);
	}


}
