package com.example.houssembaltii.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogginAspects {

        // @Before("execution(* com.example.revision2.Contrat.IContratimp.*(..))")
    public void loginmethod(JoinPoint joinPoint){
    log.info("in method :" + joinPoint.getSignature().getName());
    }

    // @After ("execution(* com.example.revision2.Contrat.IContratimp.*(..))")
    public void loginmethode(JoinPoint joinPoint){
        log.info("Out of method :" + joinPoint.getSignature().getName());
    }


}
