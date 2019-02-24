package com.amazon.satish.pages.utils;

import org.junit.Assert;
import org.junit.Test;

public class PrimeMembers {

    /**
     * Check whether giver number is prime or not.
     * @param number
     * @return true if prime, false otherwise
     */
    public boolean isPrime(int number) {
        boolean flag = true;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    @Test
    public void primeNumberTest(){
       Assert.assertTrue(isPrime(56));

    }
}
