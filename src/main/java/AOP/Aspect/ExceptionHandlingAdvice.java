package AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(5)
@Component
public class ExceptionHandlingAdvice {
    @Before("AOP.Aspect.MyPointCats.allAddMethods()")
    public void ExceptionHandlingAdvice(){
        System.out.println("ExceptionHandlingAdvice: finding exceptions and errors");
        System.out.println("---------------------------------");
    }
}
