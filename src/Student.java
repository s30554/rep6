import java.util.Date;

public class Student{

    public static int nextStudentNumber=1;
    public String fname;
    public String lname;
    public String email;
    public String adress;
    public String phone;

    public int studentNumber;


    public Date dateofBirth;
    public StudyProgramme studyProgramme;
    public int obecnySemestr;

    public Student(String fname, String lname, String email, String adress, String phone, Date dateofBirth) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
        this.dateofBirth = dateofBirth;
    }

     public void enrollStudent(StudyProgramme studyProgramme){
        this.studyProgramme=studyProgramme;
        this.obecnySemestr=obecnySemestr;
     }



    }



