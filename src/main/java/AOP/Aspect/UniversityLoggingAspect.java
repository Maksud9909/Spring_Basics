package AOP.Aspect;

import AOP.Classes.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {
//    @Before("execution(* get*())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "getting students by Logging before method getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* get*())",returning = "studentList")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> studentList){
//
//        Student firstStudent = studentList.get(0);
//        firstStudent.setName("Alexa");
//        firstStudent.setCourse(6);
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "getting students by Logging afterReturning method getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* get*())",throwing = "throwable")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable throwable){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: Logging throwing an exception" + throwable);
//    }


    @Around("execution(* adc*())")
    public void afterGetStudentLoggingAdvice(){
        System.out.println("afterGetStudentLoggingAdvice: after logging advice");
    }


}
