package home_test_mentorcode;

import java.util.Arrays;
import java.util.Scanner;

public class FMax_MinDiffInArrays {
    static int numEl;
    static int reference;
    static int arr [];
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        askUserArray();
        findMinimumDiff();
        getMaxDiff();
    }
    public static void askUserArray(){
        System.out.println("please enter the number of elements: ");
        numEl = Math.abs(input.nextInt());
        arr = new int[numEl];
        for (int i = 0; i < numEl; i++) {
            System.out.println("enter the elements : ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("your Arrays is : "+Arrays.toString(arr));
    }
    public static void findMinimumDiff(){

        reference = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                int result = arr[k] - arr[i];
                if (result < reference) {
                    reference = result;}
                if (arr[k]-arr[i]==reference){
                    System.out.println("Minimum difference pair is "+arr[i]+" and "+arr[k]+" difference is : "+(arr[k]-arr[i]));
                }}}}
    public static void getMaxDiff() {
        int maxD = arr[arr.length - 1] - arr[0];
        System.out.println("Maximum difference pair is " + arr[0] + " and " +arr[arr.length - 1]  + " difference is: " + maxD);
    }}
