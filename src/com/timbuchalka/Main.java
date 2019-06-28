package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
     }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }

        int highestPrime = 0;
        int i = 1;
        while(number > i){
            i++;
            if(number%i == 0){
                int j = 2;
                while(i >=j) {
                    if(i == j){
                        highestPrime = i;
                    }else if(i%j == 0) {
                        break;
                    }
                    j++;
                }
            }

        }
        return highestPrime;
    }
}



