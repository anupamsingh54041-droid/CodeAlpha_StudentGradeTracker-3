import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalStudents;
        double totalMarks = 0;
        double highest = 0;
        double lowest = 100;

        System.out.println("===== Student Grade Tracker =====");

        System.out.print("Enter number of students: ");
        totalStudents = sc.nextInt();

        String[] names = new String[totalStudents];
        double[] marks = new double[totalStudents];

        for (int i = 0; i < totalStudents; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            sc.nextLine();
            names[i] = sc.nextLine();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();

            totalMarks += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = totalMarks / totalStudents;

        System.out.println("\n===== Student Report =====");

        for (int i = 0; i < totalStudents; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        System.out.println("\nProject Completed Successfully!");
    }
}
