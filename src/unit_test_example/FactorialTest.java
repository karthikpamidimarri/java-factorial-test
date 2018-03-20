package unit_test_example;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class FactorialTest {
	private Factorial factorial;
	 @Before
	 public void executedBeforeEach() {
		 factorial = new Factorial();
     }

	
    @Test
    public void factorialZero() {
        assertEquals(1, factorial.fact(0));
    }

    @Test
    public void factorialOne() {        
        assertEquals(1, factorial.fact(1));
    }

    @Test
    public void factorialFive() {
        assertEquals(120, factorial.fact(5));
    }


}