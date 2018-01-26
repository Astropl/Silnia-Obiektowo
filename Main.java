package Makaruk;

import java.util.Scanner;

public class Main {

    // n!= 1*1*2*3*...*n

    static int decimal(int n) {
        long score = 1;


        for (int i = 1; i <= n; i++) {
            score = score*i;
            System.out.println(i+" "+score);
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println("Wprawdz liczbe :");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(decimal(n));
    }
}