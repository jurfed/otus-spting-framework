package homework1.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger2 {

//    @Around("target(homework1.dao.TestDao)") //реализующих интерфейс TestDao
    @Around("@annotation(java.lang.Deprecated)")//методы, кот содержат аннотайию Deprecated
    public Object initTests(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Вызов методов, реализующих интерфейс TestDao  -  " + joinPoint.getSignature().getName());
        return joinPoint.proceed(joinPoint.getArgs());
    }
}
