package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultOne {
    @Test
    public void zeroAtEnd(){
        //Fault (Bug) vorhanden,Error vorhanden, Failure: nein
       int res = FaultOne.numZero(new int []{1,2,3,0});
        Assert.assertEquals(1,res);
    }
}
