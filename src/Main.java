import Enums.StudentStatus;
import Exceptions.NewStudentExceptions;
import Models.MenaxhimiStudenteve;
import Models.Student;

public class Main {
    public static void main(String[] args) throws NewStudentExceptions {
        String[] lendet = {"Programim","Zhvillim te Uebit","Matematik,","Databaze"};


        Student[] students = new Student[]{
                new Student(0,"Albi","Hoti","Ratkoc","Cacttus Education","ZHWAM",9.3,new String[]{"Programim","Zhvillim te Uebit","Matematik,","Databaze"}),
                new Student(1,"Erion","Ferizi","Viti","Cacttus Education","ZHWAM",9,new String[]{"Programim","Zhvillim te Uebit","Matematik,","Databaze"}),
                new Student(2,"Diellza","Morina","Ratkoc","Cacttus Education","ZHWAM",10.0,new String[]{"Programim","Zhvillim te Uebit","Matematik,","Databaze"})
                ,new Student(3,"Muala","Morina","Ratkoc","Cacttus Education","ZHWAM",10.0,new String[]{"Programim","Zhvillim te Uebit","Matematik,","Databaze"})
        };

         MenaxhimiStudenteve menaxhimi = new MenaxhimiStudenteve();

        for (int i = 0; i < students.length; i++) {
            menaxhimi.setStudent(students[i],i);

        }

        StudentStatus studenti = StudentStatus.ACTIVE;
        Student student = menaxhimi.getStudent(2);

        menaxhimi.diplomo(2);

        Student studenti1 = new Student(3,"Rigon","Morina","Ratkoc","Cacttus Education","ZHWAM",10.0,new String[]{"Programim","Zhvillim te Uebit","Matematik,","Databaze"});


        studenti1.setDrejtimi(" ");
        System.out.println(studenti1);
        studenti1.setEmri("");
        System.out.println(studenti1);
        studenti1.setId(-1000);
        System.out.println(studenti1);

        System.out.println(menaxhimi.kerkoStudentin("erion"));


    }
}
