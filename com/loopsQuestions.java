package com;

import java.util.Scanner;

public class loopsQuestions {
    public static void main(String[] args) {


                                   //Question no 1
//        print a patteren off stars like this
//        ****
//        ***
//        **
//        *

//                                  sloution
//        int number = 4;
//
//        for (int i=number; i>0; i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//                System.out.println("\n");
//        }




//                                        Quection no 2
//        write a program to print the sum of first n numbers;

//        Scanner input = new Scanner(System.in);
//        int in = input.nextInt();
//        System.out.println("enter the number");
//
//        int sum = 0;
//
//        for (int i = 0 ; i<in;i++){
//            int even = 2*i;
//            sum = even+sum;
//        }
//        System.out.println(sum);




//                                       Question no 3;
//       write a program to print the multiplication table of n

//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//
//        for (int i = 1; i<=10;i++){
//            System.out.printf("%d X %d = %d\n",number,i,number*i);
//        }



//                                        Question no 4;

//        write a program to print the multipliction table of of any number  in reverse order;

//
//        Scanner input = new Scanner(System.in);
//       int number = input.nextInt();
//
//       for (int i = 10 ; i>0 ; i--){
//           System.out.printf("%d X %d = %d\n",number,i,number*i);
//       }







//                                              Question no 5;

//    write a program to find the factorial of a number


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int factorial = 1;

        for (int i = number ; i >0 ; i--){
            factorial= i*factorial;
        }
        System.out.println(factorial);




    }


}
