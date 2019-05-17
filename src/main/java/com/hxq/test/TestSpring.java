/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestSpring
 * Author:   hxq
 * Date:     2019/5/13 12:09
 * Description: 测试Spring框架
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.test;

import com.hxq.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试Spring框架〉
 *
 * @author hxq
 * @create 2019/5/13
 * @since 1.0.0
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取对象
        AccountService accountService=(AccountService) applicationContext .getBean("accountService");

        //调用方法
        accountService.findAll();

    }
}

