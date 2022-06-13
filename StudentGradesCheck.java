package home_test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentGradesCheck {
    public static void main(String[] args) {
        /*
        three test to a class of 10 student
        grades is 0 to 100;
        track each students grades and average
        average grade for each test and the average of the class as a whole.
        user input three test grades for each student
        then compute each studengts average and the class average.
        if user enters an invalid grade, should issue an error message and prompt the user to input the grade agian

         */
        Scanner input = new Scanner(System.in);

        int grade = 0;
        int student=10;
        int firstTestSum=0;
        int secondTestSum=0;
        int thirdTestSum=0;
        int wholesum=0;
        int sum=0;
        int[] grades = new int[3];
        int counter =0;

        while (counter<10) {
            System.out.print("enter students name:");
            String name = input.next();

            for (int i = 0; i < 3; i++) { // track each students grades and average

                do {  // if user enters an invalid grade, should issue an error message and prompt the user to input the grade agian

                    System.out.print("enter your " + (i + 1) + ". test grade:");
                    grade = Math.abs(input.nextInt());
                    grades[i] = grade;
                    wholesum+=grades[i];
                    if (grade > 100) {
                        System.out.println("invalid grade,please re-enter your grades again");
                    }
                } while (grade > 100);

            }
            // after get each array(grades of student)
            sum= IntStream.of(grades).sum();// sum of each created array
            firstTestSum+=grades[0];
            secondTestSum+=grades[1];
            thirdTestSum+=grades[2];


            System.out.println(wholesum);

            System.out.println("3 test score of "+name+" is :"+Arrays.toString(grades));
            System.out.println("the total score of "+name+"is："+sum);
            System.out.println("The average score of "+name+"'s three test is : " +(sum/3));
            counter++;
        }

        double testAverage=firstTestSum/student;
        double test2Average=secondTestSum/student;
        double test3Average=thirdTestSum/student;


        System.out.println("The all student first test average is: "+testAverage);
        System.out.println("The all student 2nd test average is: "+test2Average);
        System.out.println("The all student 3rd test average is: "+test3Average);
        System.out.println("The average of the class is :  "+(wholesum/student));



        }



    }
