package com.ho.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BrowseHistoryAspect {
    @Pointcut("execution( * com.ho.controller.demo.*(..))")
    public void historyPoin(){

    }
    @After("historyPoin()")
    public void save(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("redis..save");
    }
}
