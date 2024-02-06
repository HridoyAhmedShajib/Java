interface People {
    String getFirstName();
    String getLastName();
    void displayName();
}

class Student implements People {
    String firstName;
   String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void displayName() {
        System.out.println("Student: " + getFirstName() + " " + getLastName());
    }
}

class Teacher implements People {
    String firstName;
    String lastName;
    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void displayName() {
        System.out.println("Teacher: " + getFirstName() + " " + getLastName());
    }
}


class Main_People {
    public static void main(String[] args) {
        People student = new Student("Hridoy Ahmed", "Shajib");
        People teacher = new Teacher("Humayra", "Ferdous");

        student.displayName();
        teacher.displayName();
    }
}

