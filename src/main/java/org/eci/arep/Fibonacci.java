package org.eci.arep;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String args[]) {
        int n = 10000000;
        BigInteger prev = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;
        BigInteger suma;
        for (int i=0; i<n; i++) {
            suma = prev.add(result);
            prev = result;
            result = suma;
        }

    }
}