/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccountServiceImpl
 * Author:   hxq
 * Date:     2019/5/13 11:53
 * Description: 账户服务接口实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.service.impl;

import com.hxq.dao.AccountDao;
import com.hxq.domain.Account;
import com.hxq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈账户服务接口实现类〉
 *
 * @author hxq
 * @create 2019/5/13
 * @since 1.0.0
 */
@Service("accountService")
public class AccountServiceImpl implements  AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户");
       return accountDao.findAll();

    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户...");
        accountDao.saveAccount(account);

    }
}

