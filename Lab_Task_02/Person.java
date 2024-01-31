// Person class
class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // method getFirstName()
    public String getFirstName() {
        return firstName;
    }


    // method getLastName()
    public String getLastName() {
        return lastName;
    }
}



// Child Employee of Person
class Employee extends Person {
    String jobTitle;
    int employeeId;


    public Employee(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }


    // method EmployeeId()
    public int getEmployeeId() {
        return employeeId;
    }


    // access getLastName() to include job title
    @Override
    public String getLastName() {
        return lastName + ", " + jobTitle;
    }
}





class Main_Person {
    public static void main(String[] args) {
        Employee employee = new Employee("Hridoy Ahmed", "Shajib", "Student", 412);

        System.out.println("Name & Job Title: " + employee.getFirstName() + " " + employee.getLastName() );
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}

