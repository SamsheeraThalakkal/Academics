import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String address;
    private String gender;

    public Person(Scanner sc) {
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter age");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter address");
        address = sc.nextLine();
        System.out.println("enter gender");
        gender = sc.nextLine();

    }

    public String toString() {
        return "\nPerson Details\n***************\n" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nGender: " + gender + "\n";
    }

}

class Emplolyee extends Person {
    int empid;
    String company_name;
    String qualification;
    int salary;

    public Emplolyee(Scanner sc) {
        super(sc);
        System.out.println("enter empid");
        empid = sc.nextInt();
        System.out.println("enter company name");
        company_name = sc.next();

        System.out.println("enter qualification");
        qualification = sc.next();
        System.out.println("enter salary");
        salary = sc.nextInt();
    }

    public String toString() {
        return super.toString() +
                "\nEmployee Details\n***************\n" +
                "\nEmp_id= " + empid +
                "\nSalary= " + salary +
                "\nCompany Name= " + company_name +
                "\nQualification= " + qualification + "\n";
    }
}

class Teacher extends Emplolyee {
    int teacher_id;
    String subject;
    String department;

    public Teacher(Scanner sc) {
        super(sc);
        System.out.println("Enter teacher id");
        teacher_id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter subject");
        subject = sc.nextLine();
        System.out.println("enter department");
        department = sc.nextLine();
    }

    public String toString() {
        return super.toString() +
                "\nTeacher Details\n**************\n" +
                "\nTeacher ID= " + teacher_id +
                "\nSubject= " + subject +
                "\nDepartment= " + department + "\n";
    }
}

public class MultiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of teachers");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of teacher: " + (i + 1));
            Teacher t = new Teacher(sc);
            System.out.println(t);
        }

    }
}
