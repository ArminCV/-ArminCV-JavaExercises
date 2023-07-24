package JavaEncapsulation.Exercise7;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student stud = new Student();

        stud.setStudId(1);
        stud.setStudName("Juan Dela Cruz");
        

        stud.addGrade(92.5);
        stud.addGrade(89.0);
        stud.addGrade(90.3);

        int student_id = stud.getStudId();
        String student_name = stud.getStudName();
        List <Double> grades = stud.getGrades();

        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);

    }
    
}
