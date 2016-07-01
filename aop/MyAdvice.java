package com.chaoxu.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by dell on 2016/6/30.
 */
public class MyAdvice {

    /**
     * 前置通知
     */

    public void BeforeAdvice(){
        System.out.println("前置通知 >>>>>>>>>>");
    }

    /**
     * 后置通知
     */
    public void LastAdvidce(Object result){
        System.out.println("后置通知 >>>>>>>>>>>" + result);
    }

    /**
     * 异常通知
     */
    public void ExceptionAdvice(Exception e){
        System.out.println("异常通知 >>>>>>>>>>>>" + e.getMessage());
    }

    /**
     * 最终通知
     */
    public void finallyAdvice(){
        System.out.println("最终通知 >>>>>>>>>>>>>");
    }

    /**
     * 环绕通知
     */
    public Object aroungAdvice(ProceedingJoinPoint joinPoint){

        Object object = null;
        try {
            System.out.println("~~~~前置通知~~~~");
            object = joinPoint.proceed();
            System.out.println("~~~~后置通知~~~~"+object);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("~~~~异常通知~~~~");
        }finally {
            System.out.println("~~~~最终通知~~~~");
        }
        return object;
    }
}
