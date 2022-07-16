package Models;

import Models.Student;

public class MenaxhimiStudenteve {

    private Student[] students;

    public MenaxhimiStudenteve(){
        this.students = new Student[10];

    }

    public void setStudent(Student student,int index) {
        this.students[index] = new Student(student);
    }
    public Student getStudent(int index){
        return new Student(this.students[index]);
    }

    public void diplomo(int index) {
        this.students[index] = null;
    }
    public String kerkoStudentin(String emri) {
        for (int i = 0; i < students.length; i++) {
            if (this.students[i] == null) {
                continue;
            } else if (this.students[i].getEmri().equalsIgnoreCase(emri)) {
                return "Studenti gjendet ne liste ne indexin: " + i;
            }

        }
        return "Studenti nuk gjendet ne liste!";
    }
}
