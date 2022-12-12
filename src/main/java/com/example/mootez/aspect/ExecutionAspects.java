package com.example.houssembaltii.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@Aspect
public class ExecutionAspects {
    //@Around("execution(* com.example.revision2.Contrat.IContratimp.update(..))")
    public Object loginmethod(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object obj=(Object) pjp.proceed();
        stopWatch.stop();
        log.info("execution time of method :{} is {}"
                ,pjp.getSignature().getName()
                ,stopWatch.getLastTaskTimeMillis());
        return obj ;

    }
    // @Around("execution(* com.example.revision2.Contrat.IContratimp.update(..))")
    public List<Object> loginmethods(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<Object> objs= new ArrayList<>();
         objs= (List<Object>)pjp.proceed();
        stopWatch.stop();
        log.info("execution time of method :{} is {}"
                ,pjp.getSignature().getName()
                ,stopWatch.getLastTaskTimeMillis());
        return objs ;

    }
}
