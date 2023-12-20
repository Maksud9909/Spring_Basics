package AOP.Aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: " +
                "getting students by Logging before method getStudents");
    }
    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentsLoggingAdvice(){
        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
                "getting students by Logging afterReturning method getStudents");
    }
}
