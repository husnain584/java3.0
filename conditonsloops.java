import java.util.Scanner;

public class conditonsloops {
    public static void main(String[] args) {

        //quection no 1:

//        Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor
//
//        Test Data
//        Input number: 35
//        Expected Output :
//        Number is positive

        Scanner input = new Scanner(System.in);
        int inputs = input.nextInt();

        if (inputs > 0){
            System.out.println("the muber is positive");
        }else {
            System.out.println("the nummber is negative");
        }

    }
}
