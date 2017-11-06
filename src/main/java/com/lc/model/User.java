package com.lc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:LC
 * @Date:Created in 20:08 2017/11/5
 * @Modifyed by:
 */
public class User {
    public User(){

    }
    public void save(){
        System.out.println("Save");
    }
    public int insert(){
        int result = 1;
        System.out.println("result = " + result);
        return result;
    }
}
