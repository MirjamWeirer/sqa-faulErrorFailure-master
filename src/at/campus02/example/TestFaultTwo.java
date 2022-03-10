package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {
    @Test
    public void findNumber() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 8}, 2);
        Assert.assertEquals(0, pos);
    }

    @Test
    public void findNumberAtRightPosition(){
        int pos = FaultTwo.findLast(new int[] {0, 2, 3, 5, 8}, 3);
        Assert.assertEquals(2,pos);
    }

    @Test(expected = NullPointerException.class)
    public void expectetException() {
        int pos = FaultTwo.findLast(null, 1);
    }
}
