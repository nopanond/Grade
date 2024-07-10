
//By: Nopanond Ch.  test  aaaa
package grade;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfSubjects = 2;
        String[] subjectNames = {"ภาษาไทย", "กีฬา", "คอมพิวเตอร์"};
        int[] credits = new int[numOfSubjects];
        int totalCredit = 0;
        double[] assignmentScores = new double[numOfSubjects];
        double[] examScores = new double[numOfSubjects];
        double[] participationScores = new double[numOfSubjects];
        double totalScore = 0;

        for (int i = 0; i < numOfSubjects; i++) {
        	System.out.println("วิชา" + subjectNames[i]);
        	
            System.out.print("จำนวนหน่วยกิต: ");
            credits[i] = input.nextInt();
            totalCredit += credits[i];

            System.out.print("คะแนนผลงาน: ");
            assignmentScores[i] = input.nextDouble();

            System.out.print("คะแนนสอบ: ");
            examScores[i] = input.nextDouble();

            System.out.print("คะแนนจิตพิสัย: ");
            participationScores[i] = input.nextDouble();
            
            System.out.println("--------------------");
        }
        
        System.out.println("ผลลัพธ์");
        System.out.println("===============");
        

        for (int i = 0; i < numOfSubjects; i++) {
            totalScore = assignmentScores[i] + examScores[i] + participationScores[i];
            String grade = calculateGrade(totalScore);

            System.out.println("คะแนนวิชา " + subjectNames[i] + ": " + totalScore);
            System.out.println("เกรดวิชา " + subjectNames[i] + ": " + grade);
            System.out.println("--------------------");
        }
        
        double GPA = 0;
        System.out.println("===============");
        System.out.println("เกรดเฉลี่ย: " + GPA);
        System.out.println("===============");

        input.close();

}
    public static String calculateGrade(double score) {
        if (score >= 80) {
            return "4.0 (A)";
        } else if (score >= 70) {
            return "3.0 (B)";
        } else if (score >= 60) {
            return "2.0 (C)";
        } else if (score >= 50) {
            return "1.0 (D)";
        } else {
            return "0 (F)";
        }
    }
}
