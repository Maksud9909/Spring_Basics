package AOP.Aspect;


import org.aspectj.lang.annotation.Pointcut;



public class MyPointCats {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}


}
