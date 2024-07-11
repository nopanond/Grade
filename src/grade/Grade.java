
//By: Nopanond Ch.
package grade;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        //สร้างตัวแปรเพื่อเก็บจำนวนข้อมูลผู้เรียน

        //ปรับให้ตัวแปรเก็บข้อมูลแบบอาร์เรย์
        String subjectNames = "ภาษาไทย" ; //ปรับให้รับได้หลายวิชา
        int credits ;
        int totalCredit = 0;
        double assignmentScores ;
        double examScores ;
        double participationScores ;
        double totalScore = 0;
        ///

        //สร้าง Loop ให้เก็บข้อมูลผู้เรียนตามจำนวนที่กำหนด

        System.out.println("วิชา" + subjectNames);

        System.out.print("จำนวนหน่วยกิต: ");
        credits = input.nextInt();
        totalCredit += credits;

        System.out.print("คะแนนผลงาน: ");
        assignmentScores = input.nextDouble();

        System.out.print("คะแนนสอบ: ");
        examScores = input.nextDouble();

        System.out.print("คะแนนจิตพิสัย: ");
        participationScores = input.nextDouble();
        ///          
        System.out.println("--------------------");



        System.out.println("ผลลัพธ์");
        System.out.println("===============");

        //สร้าง Loop ให้แสดงผลลัพธ์ของข้อมูลผู้เรียน ตามที่กำหนด

        totalScore = assignmentScores + examScores + participationScores;
        double grade = calculateGrade(totalScore);

        System.out.println("คะแนนวิชา " + subjectNames + ": " + totalScore);
        System.out.println("เกรดวิชา " + subjectNames + ": " + grade);
        System.out.println("--------------------");


        // เขียนสูตรในการคำนวณเกรด 
        // double GPA = ;
        System.out.println("===============");
        System.out.println("เกรดเฉลี่ย: " );
        System.out.println("===============");

        input.close();

}
    public static double calculateGrade(double score) {
        if (score >= 80) {
            return 4.0;
        } else if (score >= 70) {
            return 3.0;
        } else if (score >= 60) {
            return 2.0;
        } else if (score >= 50) {
            return 1.0;
        } else {
            return 0;
        }
    }
}
