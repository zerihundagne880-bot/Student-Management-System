import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    double grade;

    Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student\n2. View All\n3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Grade: ");
                double grade = sc.nextDouble();
                students.add(new Student(name, id, grade));
            } else if (choice == 2) {
                for (Student s : students) s.display();
            } else if (choice == 3) break;
        }
        sc.close();
    }
}
# 1. Git ን አስጀምር
git init

# 2. ፋይሎቹን መዝግብ
git add Main.java

# 3. ለውጡን አረጋግጥ
git commit -m "Add Student Management Java code"

# 4. የ GitHub ሪፖዚቶሪህን አገናኝ
git remote add origin https://github.com/zerihundagne880-bot/Student-Management-System.git

# 5. ስምህን እና ኢሜይልህን ካልሞላህ ሙላ (ለአንድ ጊዜ ብቻ)
git config --global user.email "your-email@example.com"
git config --global user.name "zerihundagne880-bot"

# 6. ኮዱን ላክ
git branch -M main
git push -u origin main

