/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Account
 * Author:   hxq
 * Date:     2019/5/13 11:47
 * Description: 账户实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.domain;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈账户实体类〉
 *
 * @author hxq
 * @create 2019/5/13
 * @since 1.0.0
 */
public class Account implements Serializable {
 private Integer id;
 private String name;
 private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

