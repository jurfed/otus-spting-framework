package aspect.otus.spring03.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(* ru.otus.spring03.dao.PersonDaoSimple.*(..))")
    @AfterReturning(pointcut = "execution(* aspect.otus.spring03.dao.PersonDaoSimple.*(..))", returning = "result")
    public void logBefore(JoinPoint joinPoint, Object result) {
        System.out.println("Вызов метода : " + joinPoint.getSignature().getName());
        System.out.println("результат : " + result);
    }


    @AfterThrowing(pointcut = "execution(* aspect.otus.spring03.dao.PersonDaoSimple.*(..))", throwing = "error")
    public void logBefore2(JoinPoint joinPoint, Throwable error) {
        System.out.println("Вызов метода : " + joinPoint.getSignature().getName());
        System.out.println("результат : " + error);
    }

    //    @Before("target(ru.otus.spring03.service.PersonService)")
//    @Before("@target(org.springframework.stereotype.Repository)")
//    @Before("@annotation(javax.xml.bind.annotation.XmlAnyElement)")
    @Before("execution(public Long aspect.otus.spring03.dao.PersonDaoSimple.findById(Long))")
    public void findById(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName());
    }


    @Around("execution(* aspect.otus.spring03.dao.PersonDaoSimple.findById(..))")
    public Object logBefore3(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around Вызов метода : " + joinPoint.getSignature().getName());
        return joinPoint.proceed(joinPoint.getArgs());
//        System.out.println("Around Вызов метода : " + Arrays.toString(joinPoint.getArgs()));
    }

}
