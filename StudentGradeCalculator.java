import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("** Welcome to the Student Grade Calculator **\n");


        System.out.print("Enter the number of subjects: ");
        int subjectCount = sc.nextInt();

        int[] marks = new int[subjectCount];
        int totalMarks = 0;

    
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            int mark = sc.nextInt();

            
            while (mark < 0 || mark > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                System.out.print("Enter marks for subject " + (i + 1) + " again: ");
                mark = sc.nextInt();
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / subjectCount;

        // Determine grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\n=====  Student Result Summary  =====");
        System.out.println("Total Marks: " + totalMarks + "/" + (subjectCount * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        // Extra: Add a small message based on grade
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance! Keep it up!");
                break;
            case 'B':
                System.out.println("Good job! You can aim for an A next time.");
                break;
            case 'C':
                System.out.println("Fair effort! Focus a bit more to improve.");
                break;
            case 'D':
                System.out.println("You passed, but more practice is needed.");
                break;
            default:
                System.out.println("Failed. Don't give up! Study harder next time.");
        }

        sc.close();
    }
}