package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KozhevikTest {
    @Test
    public void factorialTest(){
        Kozhevik kozhevik = new Kozhevik();
        int n = 5;
        long expected = 120;

        //Act
        long actual = kozhevik.factorial(n);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorial_nIsMinus1_returns0(){
        Kozhevik kozhevik = new Kozhevik();
        int n = -1;
        long expected = 0;

        long actual = kozhevik.factorial(n);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorial_nIs0_returns1(){
        Kozhevik kozhevik = new Kozhevik();
        int n = 0;
        long expected = 1;

        long actual = kozhevik.factorial(n);

        Assertions.assertEquals(expected, actual);
    }
}
