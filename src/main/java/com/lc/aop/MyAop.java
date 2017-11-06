package com.lc.aop;


/**
 * @Author:LC
 * @Date:Created in 21:09 2017/11/5
 * @Modifyed by:
 */

public class MyAop {
    public MyAop(){

    }
    public void BeforeCall(){
        System.out.println("BeforeCall");
    }
    public void AfterCall(){
        System.out.println("AfterCall");
    }
}
