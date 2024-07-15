import java.util.Scanner;

public class IFElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter midtrem Score => ");
        double midScore = input.nextDouble();

        System.out.println("Enter final Score => ");
        double finalScore = input.nextDouble();

        double totalScore = midScore + finalScore;

        String grade = "";

        if(totalScore >=80) grade = "A";
        else if (totalScore >= 75)  grade = "B+";
        else if (totalScore >= 70) grade = "B";
        else if (totalScore >= 65) grade = "C+";
        else if (totalScore >= 60) grade = "C";
        else if (totalScore >= 55) grade = "D+";
        else if (totalScore >= 50) grade = "D";
        else grade = "F";

        System.out.println("------------------------------------");
        System.out.println("Total SCore : " + totalScore);
        System.out.println("Grade       : " + grade);
        System.out.println("------------------------------------");
    }
}
