package junit1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    @Test
    public void isEven() {
        EvenOdd obj=new EvenOdd();
        assertEquals("10 ->true",true,obj.isEven(10));
        assertEquals("1 ->false ",false,obj.isEven(1));
        assertEquals("15 ->false",false,obj.isEven(15));

    }
}