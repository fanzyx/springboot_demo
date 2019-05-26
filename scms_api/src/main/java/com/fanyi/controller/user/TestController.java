package com.fanyi.controller.user;


import com.fanyi.service.user.UserService;
import com.fanyi.vo.user.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 测试控制类
 * @author wangyds
 * @date 2019/5/26
 */
@RestController
@CrossOrigin
public class TestController {


    @Resource
    private UserService userService;


    /**
     * 前端获取数据测试接口
     * @param res
     * @return
     */
    @RequestMapping(value="getlist",method= RequestMethod.GET)
    @ResponseBody
    public List<User>  getUsers(HttpServletResponse res){
        List<User> ulist ;
        ulist = userService.getUserList(null,null);
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Method", "POST,GET");
        res.setContentType("application/json;charset=utf-8");
        return ulist;
    }





}
