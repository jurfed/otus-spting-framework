package homework1.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;


@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* SimpleService.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("execution Вызов метода " + joinPoint.getSignature().getName());
    }

    @After("within(homework1.service..*)")
    public void logBefore2(JoinPoint joinPoint){
        System.out.println("within Вызов метода " + joinPoint.getSignature().getName());
    }

    public LoggingAspect() {
        System.out.println();
    }
}
