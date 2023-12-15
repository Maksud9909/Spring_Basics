package AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* get*(..))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: try to get a material");
    }
    @Before("execution(public * return*())")
    public void returnGetBookAdvice(){
        System.out.println("returnGetBookAdvice: try to return a material");
    }
}
