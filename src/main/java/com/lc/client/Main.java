package com.lc.client;

import com.lc.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:LC
 * @Date:Created in 20:14 2017/11/5
 * @Modifyed by:
 */
public class Main {
    public static void main(String[]args){
        ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("classpath*:applicationcontext.xml");
        User obj = (User)ctx.getBean("user");
        obj.save();
        obj.insert(1);
    }
}
