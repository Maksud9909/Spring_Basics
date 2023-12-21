package AOP.Classes;




import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    List<Student> studentList = new ArrayList<>();
    public void addStudents (){
        Student student1 = new Student("Maksud",1,6.6);
        Student student2 = new Student("Anton",3,8.8);
        Student student3 = new Student("Grisha",1,5.8);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

    }

    public List<Student> getStudentList() {
        System.out.println("This is the start of the method getStudentList");
//        System.out.println(studentList.get(4));
        System.out.println("Info from method getStudents: ");
        System.out.println(studentList);
        return studentList;
    }
}
