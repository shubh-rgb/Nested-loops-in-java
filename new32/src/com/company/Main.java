package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x % 2 != 0 && y % 2 != 0 && y==3*x) {

            for (int i = 1; i <=x/2; i++) {
                for (int j = 0; j < (y - 3 *(2*i-1)) / 2; j++)
                    System.out.print("-");
                for (int j = 0; j < 2 * i - 1;j++)
                    System.out.print(".|.");
                for (int j = 0; j < (y - 3 *(2*i-1) ) / 2; j++)
                    System.out.print("-");
                if(i==x/2){
                    System.out.println();
                    for(int j=0; j<(y-7)/2;j++){
                        System.out.print("-");}
                        System.out.print("WELCOME");
                    for(int j=0; j<(y-7)/2;j++){
                        System.out.print("-");}}
                        System.out.println();}

            for (int i=1; i<=x/2; i++){
                    for (int j=1; j <= 3*i;  j++)
                        System.out.print("-");
                    for (int j = x-2*i; j>0; j--)
                        System.out.print(".|.");
                    for (int j=1; j <= 3*i;  j++)
                        System.out.print("-");
                    System.out.println();}
        }
        else System.out.println("grid parameter is invalid");
    }
}
