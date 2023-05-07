package com;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        //for loop in java
        //syntax

//        for(initilize + check expression + update){
//            output
//        }

//        Write a for loop that calculates the sum of the numbers in an array.

//        int[] numbers = {2,3,5,6,7};
//
//        int sum = 0;
//
//        for(int i =0 ; i<numbers.length; i++ ){
//            sum += numbers[i];
//            System.out.println(sum);
//
//        }

//        Write a for loop that finds the largest number in an array of integers.

//        int[] numbers = {4,9,5,2,21};
//
//        int largest = numbers[0];
//
//        for (int i = 1; i<numbers.length;i++){
//            if (numbers[i]>largest){
//                largest = numbers[i];
//            }
//            System.out.println(largest);
//        }

        //write a program to print first five odd numbers

//        Scanner input = new Scanner(System.in);
//        System.out.println("how much you want odd numbers");
//             int number = input.nextInt();
//
//        for (int i=0 ; i<number; i++){
//            System.out.println(2*i+1);
//        }


        //write a program to print first 5 natural number in reverse order

        int number = 5;
        for (int i = number ; i != 0 ; i--){
            System.out.println(i);
        }
    }

}
