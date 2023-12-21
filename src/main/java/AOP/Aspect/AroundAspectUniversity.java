package AOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspectUniversity {
    @Around("execution(* returnBook())")
    public Object AroundGetStudentLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("AroundGetStudentLoggingAdvice: logging they are trying to return book");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("AroundGetStudentLoggingAdvice: logging they are succefully return book");
        return targetMethodResult;
    }
}
