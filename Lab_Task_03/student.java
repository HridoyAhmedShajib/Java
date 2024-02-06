abstract class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }

    public void take_exam() {}
}



class PhdStudent extends Student {
    public PhdStudent(String name) {
        super(name);
    }
    public void take_exam() {
        System.out.println(name + " takes exam by giving his final defense presentation.");
    }
}



class GradStudent extends Student {
    public GradStudent(String name) {
        super(name);
    }


    public void take_exam() {
        System.out.println(name + " gives a written paper for the exam.");
    }
}




class Main_Student {
    public static void main(String[] args) {
        PhdStudent phdStudent = new PhdStudent("Hridoy");
        GradStudent gradStudent = new GradStudent("Nirob");

        phdStudent.take_exam();
        gradStudent.take_exam();
    }
}
