package test;


import dao.IUserDao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Machenike on 2018/9/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applactionContext.xml")
public class Test {

    @Autowired
    private IUserDao iUserDao;
    @org.junit.Test
    public void Test(){
        iUserDao.regist("aaa","bbb");
    }

}
