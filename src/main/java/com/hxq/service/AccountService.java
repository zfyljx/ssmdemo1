package com.hxq.service;

import com.hxq.domain.Account;

import java.util.List;

/**
 * 账户服务
 * Created by hxq on 2019/5/13.
 */
public interface AccountService {
    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);

}
