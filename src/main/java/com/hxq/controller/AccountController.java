/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccountController
 * Author:   hxq
 * Date:     2019/5/13 11:57
 * Description: 控制层的类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.controller;

import com.hxq.domain.Account;
import com.hxq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制层的类〉
 * 账户
 *
 * @author hxq
 * @create 2019/5/13
 * @since 1.0.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有账户
     * @param model
     * @return
     */
    @RequestMapping("/findAllp")
    public String findAll(Model model){
        System.out.println("表现层：查询所有的账户。。。。");
        //调用Service方法
       List<Account> accounts= accountService.findAll();
       model.addAttribute("accounts",accounts);
        return "list";
    }

    /**
     * 保存
     * @param model
     * @return
     */
    @RequestMapping("/savep")
    public void save(Account account, HttpServletRequest request,HttpServletResponse response)throws IOException{
        System.out.println("表现层：添加账户。。。。");
        //调用Service方法
       accountService.saveAccount(account);
       response.sendRedirect(request.getContextPath()+"/account/findAllp");
        return;
    }
}

