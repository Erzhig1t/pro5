package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==10 && b==9 ) {
            System.out.println("You won 200$");
        }else if(a==4 && b==6) {
            System.out.println("You won 50$");
        }else {
            System.out.println("Try again");
        }
    }
}
