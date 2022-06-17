package home_test_mentorcode;


import java.util.Arrays;
import java.util.Scanner;

public class Driven_program {
    static Scanner input = new Scanner(System.in);
    static int m, n, i, k, option;
    static int sumRow = 0;
    static int[][] arrayA;

    public static void main(String[] args) {
        askUserDimension();
        menu();
        do {
            requestOptions();
            selection();
            System.out.println("***************************************Press ZERO For Exit=>");
        } while (option != 0);
    }

    public static void askUserDimension() {
        System.out.println("Please enter the row M of Arrays: ");
        m = Math.abs(input.nextInt());
        System.out.println("Please enter the colum N of Arrays: ");
        n = Math.abs(input.nextInt());
        arrayA = new int[m][n];
    }

    public static void selection() {
        int counter = 1;
        if (option == 1) {
            for (i = 0; i < m; i++) {
                for (k = 0; k < n; k++) {
                    System.out.println("Enter " + counter + ". elements: ");
                    arrayA[i][k] = input.nextInt();
                    counter++;
                }
            }
        } else if (option == 2) {
            for (int[] row : arrayA) {
                System.out.println(Arrays.toString(row));
            }
        } else if (option == 3) {
            for (int[] arr : arrayA) {
                for (int elements : arr) {
                    sumRow += elements;
                }
            }
            System.out.println("Sum of all elements is : " + sumRow);
        } else if (option == 4) {
            for (int[] arr : arrayA) {
                sumRow = Arrays.stream(arr).sum();
                System.out.println("Sum of " + counter + "." + " row-wise: " + sumRow);
                counter++;
            }
        } else if (option == 5) {
            for (i = 0; i < m; i++) {
                int sumColumn = 0;
                for (k = 0; k < n; k++) {
                    sumColumn += arrayA[k][i];
                }
                System.out.println("Sum of " + (i + 1) + ". colum-wise: " + sumColumn);
            }
        } else if (option == 6) {
            int[][] transpose = new int[m][n];
            for (i = 0; i < m; i++) {
                for (k = 0; k < n; k++) {
                    transpose[k][i] = arrayA[i][k];
                }
            }
            for (int[] row : transpose) {
                System.out.println(Arrays.toString(row));}}}
        public static void requestOptions () {
            System.out.println("Please select the one of the options:");
            option = input.nextInt();
        }
        public static void menu () {
            System.out.println(
                    "1-To input elements into matrix of size m x n" + "\n" +
                            "2-To display elements of matrix of size m x n" + "\n" +
                            "3-Sum of all elements of matrix of size m x n" + "\n" +
                            "4-To display row-wise sum of matrix of size m x n" + "\n" +
                            "5-To display column-wise sum of matrix of size m x n" + "\n" +
                            "6-To create transpose of matrix of size n x m);");
        }}

