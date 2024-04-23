import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Student student=new Student("Alex", "Ferguson", "siralex&mail.com", "Manchester", "123-456-789", new Date(1800,1,1));


        StudyProgramme it = new StudyProgramme("IT", "AAA", 7,5);

        student.enrollStudent(it);

        student.addGrade(5,"PGO");
        student.addGrade(2, "ABCD");

        List<Student>students=new ArrayList<>();
        students.add(student);

        Student.promoteAllStudents(students);
        Student.displayInfoAboutAllStudents(students);
    }
}

