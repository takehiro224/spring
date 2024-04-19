package com.example.demo.aop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // @Before("execution(* com.example.demo.service.TargetService.*(..))")
    public void beforeAdvice(JoinPoint jointPoint) {
        LocalDateTime startTime = LocalDateTime.now();
        String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
        System.out.println("-------【@Before】-------");
        System.out.println("Before method: " + jointPoint.getSignature());
        System.out.println("メソッド開始: " + formattedTime);
    }

    // @After("execution(* com.example.demo.service.TargetService.*(..))")
    public void afterAdvice(JoinPoint jointPoint) {
        LocalDateTime startTime = LocalDateTime.now();
        String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
        System.out.println("-------【@After】-------");
        System.out.println("After method: " + jointPoint.getSignature());
        System.out.println("メソッド終了: " + formattedTime);
    }

    @Around("execution(* com.example.demo.service.TargetService.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint jointPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("=====【@Around: 前】=====");
        System.out.println("■Target");
        System.out.println(" クラス :" + jointPoint.getSignature().getDeclaringTypeName());
        System.out.println(" メソッド :" + jointPoint.getSignature().getName());

        Object result = jointPoint.proceed(); // 実行メソッドを呼び出す

        System.out.println("=====【@Around: 後】=====");
        long elapsedtime = System.currentTimeMillis() - startTime;
        System.out.println("Method execution time:" + elapsedtime + "milliseconds.");
        return result;
    }
}
