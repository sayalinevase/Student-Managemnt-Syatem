package com.student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Name");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    dao.addStudent(new Student(name, age, grade));
                }
                case 2 -> dao.getAllStudents().forEach(System.out::println);
                case 3 -> {
                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    dao.updateStudent(id, name);
                }
                case 4 -> {
                    System.out.print("Enter student ID to delete: ");
                    int id = sc.nextInt();
                    dao.deleteStudent(id);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }
}