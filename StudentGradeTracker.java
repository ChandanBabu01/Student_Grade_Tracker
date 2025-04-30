import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Kitne students ke grades enter karne hain?");
        int numberOfStudents = sc.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Student " + i + " ka grade enter karo: ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        int sum = 0, highest = grades.get(0), lowest = grades.get(0);

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / grades.size();

        System.out.println("\nResults:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
    }
}
