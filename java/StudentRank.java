import java.util.Scanner;

class Student {
    static int count = 0;
    int rollno, total = 0;
    String name;
    int m[] = new int[2];

    public Student(Scanner sc) {
        System.out.println("Enter rollno");
        rollno = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        for (int i = 0; i < 2; i++) {
            System.out.println("Mark" + (i + 1));
            m[i] = sc.nextInt();
        }
        total = totalm();
        count++;

    }

    public int totalm() {
        return m[0] + m[1];
    }

    public void display() {
        System.out.println("Name=" + name + "\nRollno= " + rollno + "\nMark=" + total + "\n");

    }

}

public class StudentRank {
    public static void main(String[] args) {
        Student s[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = new Student(sc);

        }
        sc.close();
        rank(s);
        System.out.println("\nRankList" + "\n*************\n");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }

    public static void rank(Student s[]) {
        int n = Student.count;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].total < s[j].total) {
                    Student temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                }
            }

        }
    }
}
