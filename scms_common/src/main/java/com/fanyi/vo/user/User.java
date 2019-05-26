package com.fanyi.vo.user;

import lombok.Data;

import java.util.Date;

/**
 * 用户VO
 * @author wangyds
 * @date 2019/04/11
 */
@Data
public class User {
	private Integer id;
	private String code;
	private String name;
	private String password;
	private Integer gender;
	private Date birthday;
	private String phone;
	private String address;
	private Integer role;
	private Integer creator;
	private Date creationtime;
	private Integer modifier;
	private Date modifiedtime;
	private String idPicPath;
	private String workPicPath;
	private Integer age;
	private String roleName;

}
