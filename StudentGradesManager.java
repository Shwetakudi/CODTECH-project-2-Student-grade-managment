import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Student Grades Manager!");

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Array to store grades
        double[] grades = new double[numSubjects];
        double totalGrades = 0;

        // Input grades
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            totalGrades += grades[i];
        }

        // Calculate average
        double averageGrade = totalGrades / numSubjects;

        // Determine letter grade
        String letterGrade;
        double gpa;
        if (averageGrade >= 90) {
            letterGrade = "A";
            gpa = 4.0;
        } else if (averageGrade >= 80) {
            letterGrade = "B";
            gpa = 3.0;
        } else if (averageGrade >= 70) {
            letterGrade = "C";
            gpa = 2.0;
        } else if (averageGrade >= 60) {
            letterGrade = "D";
            gpa = 1.0;
        } else {
            letterGrade = "F";
            gpa = 0.0;
        }

        // Display results                                  
        System.out.println("\n--- Student Grade Summary ---");
        System.out.println("Total Subjects: " + numSubjects);
        System.out.println("Grades: ");
        for (int i = 0; i < numSubjects; i++){
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);

        // Close the scanner
        scanner.close();
    }
}
