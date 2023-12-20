package AOP.Aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectAfterReturn {

    @AfterReturning("execution()")
    public void afterReturningGetStudentsLoggingAdvice(){

    }

}
