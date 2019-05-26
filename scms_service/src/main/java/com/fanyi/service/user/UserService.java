package com.fanyi.service.user;


import com.fanyi.vo.user.User;

import java.util.List;

/**
 * 用户模块服务接口
 * @author wangyds
 * @date 2019/4/10
 */
public interface UserService {

	List<User> getUserList(String name, Integer role);

}
