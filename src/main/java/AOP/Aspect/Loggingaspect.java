package AOP.Aspect;

import AOP.Classes.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class Loggingaspect {
    @Before("AOP.Aspect.MyPointCats.allAddMethods()")
    public void beforeAddBookLoggingAdvice(JoinPoint joinPoint){
        System.out.println("beforeAddBookLoggingAdvice: before logging advice");
        System.out.println("---------------------------");
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());



        if (methodSignature.getName().equals("addBook")){
            Object arguments [] = joinPoint.getArgs();
            for(Object obj: arguments){
                if (obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println("Info abput book " + book.getName() + " "
                    + book.getAuthor() + " " + book.getYearOfPub());
                }else {
                    System.out.println("This guy adds book " + obj);
                }
            }
        }

        System.out.println("---------------------------");

    }










//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: try to check access rights");
//    }





//    @Before("execution(public * return*())")
//    public void returnGetBookAdvice(){
//        System.out.println("returnGetBookAdvice: try to return a material");
//    }
}
