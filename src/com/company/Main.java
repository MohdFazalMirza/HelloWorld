package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number2;
        int number;
        boolean error=false;
        do{
            error=false;
            try {
                System.out.println("enter a number");
                number = sc.nextInt();
                int result=factorialOfNumber(number);
                System.out.println(result);

            }catch(InputMismatchException e){
                System.out.println("Enter a integer Value");
                error=true;
                sc.nextLine();
            }

        }while(error);






	//System.out.println("Hello World!");
	//System.out.println("I Love Java");
    }
    static int factorialOfNumber(int n){
        int factorial=1;
        while(n>=1)
        {
            if(n==1) {
                System.out.print(n + "=");
                break;
            }else {
                System.out.print(n + "*");
            }
            factorial*=n;
            n--;
        }

        return factorial;
    }
}
