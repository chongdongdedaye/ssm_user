package com.zhoujingsheng.controller;

import com.zhoujingsheng.domain.User;
import com.zhoujingsheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("/user")
@Controller
public class Controller01 {


    @Autowired
    private UserService service;

    @RequestMapping("/pid")
    public String findById(Model model, int pid){
        System.out.println("正在执行单个查询操作");
        User user = service.findById(pid);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/all")
    public ModelAndView findAll(){
        System.out.println("正在执行查询所有操作");
        List<User> users = service.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",users);
        mv.setViewName("list");
        //返回的数据存储在request域中
        return mv;
    }
    @RequestMapping("/update")
    public void update(HttpServletRequest request, HttpServletResponse response, User user) throws ServletException, IOException {
        System.out.println("正在修改执行用户信息");
        service.updateUser(user);
        //执行转发
        //request.getRequestDispatcher("/WEB-INF/pages/list.jsp").forward(request,response);
        //跳转到all方法
        response.sendRedirect(request.getContextPath()+"/user/all");
    }
}
