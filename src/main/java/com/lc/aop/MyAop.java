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
        System.out.println("调用方法:" + point.getSignature().getName());
        System.out.println("入参是:");
        Object []args = point.getArgs();
        String argName = null;
        String argValue = null;
        for (int i = 0; i<args.length; i++){
            argName = args[i].toString();
            System.out.println(argName);
        }
        System.out.println("出参是:" );
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
        return proc;
    }
}
