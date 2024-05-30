package com.som.transaction.aspect;

import jdk.swing.interop.SwingInterOpUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Around(value = "execution(* com.som.transaction.controller..*(..)) || execution(* com.som.transaction.service..*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Method " +
                joinPoint.getSignature().getName() +
                " is called on " +
                joinPoint.getTarget().getClass().getSimpleName());

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature().getName() + " execution completed within "+(endTime-startTime)+"ms.");

        return result;
    }
}
