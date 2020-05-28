package ownpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a integer which is not negative! ");
        int n = input.nextInt();
        ArrayList<Integer> primes = countPrimes(n);
        System.out.println(primes);
        System.out.println(primes.size() + " prime number(s)");
    }
    public static ArrayList<Integer> countPrimes(int n){
        n = n-1;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if(n <= 1) return primes;
        if(n == 2){
            primes.add(2);
            return primes;
        }
        if (n == 3){
            primes.add(2);
            primes.add(3);
            return primes;
        }
        primes.add(2);
        primes.add(3);
        for(int i=5; i<=n; i+=2){
            boolean isPrime =true;
            for(int p : primes) {
                int m = i % p;
                if(m == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
        }
        return primes;
    }
}
