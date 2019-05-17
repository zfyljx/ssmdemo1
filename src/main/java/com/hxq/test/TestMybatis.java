/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestMybatis
 * Author:   hxq
 * Date:     2019/5/13 13:23
 * Description: 测试mybatis
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.test;

import com.hxq.dao.AccountDao;
import com.hxq.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试mybatis〉
 *
 * @author hxq
 * @create 2019/5/13
 * @since 1.0.0
 */
public class TestMybatis {

    /**
     * 查询
     * @throws Exception
     */
    @Test
    public void run1()throws Exception{

//        加载配置文件
       InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//       创建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        创建sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //获取代理实现类
        AccountDao dao=sqlSession.getMapper(AccountDao.class);

        //获取数据
        List<Account> accounts=dao.findAll();
for(Account account:accounts){
    System.out.println(account);
}
//        关闭资源
        sqlSession.close();
        inputStream.close();
    }

    /**
     * 添加账户
     * @throws Exception
     */
    @Test
    public void run2()throws Exception{

        Account account=new Account();
        account.setName("熊大");
        account.setMoney(300d);
//        加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//       创建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        创建sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //获取代理实现类
        AccountDao dao=sqlSession.getMapper(AccountDao.class);

        //获取数据
       dao.saveAccount(account);

//       提交事务
        sqlSession.commit();
//        关闭资源
        sqlSession.close();
        inputStream.close();
    }

}

