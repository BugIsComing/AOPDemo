package com.lc.aop;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author:LC
 * @Date:Created in 21:09 2017/11/5
 * @Modifyed by:
 */

public class MyAop {
    public MyAop(){

    }
    public void beforeCall(){
        System.out.println("BeforeCall");
    }
    public void afterCall(){
        System.out.println("AfterCall");
    }

    public Object process(ProceedingJoinPoint point){
        Object proc = null;
        System.out.println(point.getSignature().getName());
        try {
            //目标方法有返回才不为null，否则为null
           proc = point.proceed();
           if(null != proc){
               System.out.println(proc.toString());
           } else {
               System.out.println("NULL");
           }

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        String className = point.getTarget().getClass().getName();
        System.out.println("BeforeCall " + className);
        return proc;
    }
}
