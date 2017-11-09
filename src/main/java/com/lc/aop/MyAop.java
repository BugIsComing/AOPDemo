package com.lc.aop;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;



/**
 * @Author:LC
 * @Date:Created in 21:09 2017/11/5
 * @Modifyed by:
 */

public class MyAop {
    private Logger logger = Logger.getLogger(MyAop.class);
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
        logger.info("调用方法:" + point.getSignature().getName());
        //System.out.println("调用方法:" + point.getSignature().getName());
        //System.out.print("入参是:");
        logger.info("入参是:");
        Object []args = point.getArgs();
        String argName = null;

        if(args == null || args.length == 0){
            //System.out.println("NULL");
            logger.info("NULL");
        } else {
            for (int i = 0; i<args.length; i++){
                argName = args[i].toString();
                //System.out.println(argName);
                logger.info(argName);
            }
        }
        //System.out.print("出参是:" );
        logger.info("出参是:");
        try {
            //目标方法有返回才不为null，否则为null
           proc = point.proceed();
           if(null != proc){
               //System.out.println(proc.toString());
               logger.info(proc.toString());
           } else {
               //System.out.println("NULL");
               logger.info("NULL");
           }

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proc;
    }
}
