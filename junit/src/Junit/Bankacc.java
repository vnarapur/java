package Junit;

import Assignment4.Program4;

import java.util.Scanner;

public class Bankacc {

int balance = 10000;

    public void withdrawFunctionality( int withdraw ) throws Program4{

        if (withdraw > balance) {
            throw new Program4(" Insufficient Balance ");
        }
        else
        {
            System.out.println(" Amount withdrawn :"+withdraw);
        }

    }

    /*public static void main(String[] args) throws Program4 {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter id :");
        long id = sc.nextLong();

        System.out.println(" Enter balance :");
        double balance = sc.nextDouble();

        System.out.println(" Enter amount to withdraw :");
        double withdraw = sc.nextDouble();

    }*/
}

