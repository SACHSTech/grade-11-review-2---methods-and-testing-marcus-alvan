package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Arrays;

import gr11review.part2.Utility;

public class UtilityTest{

  @Test
  public void Methods3Test(){
    assertTrue(Utility.xyzMiddle("asxyzsa"));
    assertTrue(Utility.xyzMiddle("lolxyzlmao"));
    assertTrue(Utility.xyzMiddle("XYxyzZYX"));
    assertFalse(Utility.xyzMiddle("susxyzamongus"));
    assertFalse(Utility.xyzMiddle("MrxyzFabroa"));
    assertFalse(Utility.xyzMiddle("isThexyzBestTeacher"));
    
  }

  @Test
  public void FileIO3Test(){
    assertEquals("evolution", Utility.vowelCount("Review2_3Test_1.txt"));
    assertEquals("preservation", Utility.vowelCount("Review2_3Test_3.txt"));
    assertEquals("conservation", Utility.vowelCount("Review2_3Test_4.txt"));
  }
  
  @Test
  public void Array3Test(){
    Assert.assertArrayEquals(new int[] {0,0,0,1,1,1}, Utility.zeroFront(new int[] {0,1,0,1,0,1}));
    Assert.assertArrayEquals(new int[] {0,0,2,4,8,7}, Utility.zeroFront(new int[] {8,2,0,4,0,7}));
    Assert.assertArrayEquals(new int[] {0,1,1,1,1,1}, Utility.zeroFront(new int[] {1,1,1,1,1,0}));
    Assert.assertArrayEquals(new int[] {0,0,0,0,0,250}, Utility.zeroFront(new int[] {0,250,0,0,0,0}));
    Assert.assertArrayEquals(new int[] {0,1}, Utility.zeroFront(new int[] {1,0}));
    Assert.assertArrayEquals(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1}, Utility.zeroFront(new int[] {0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1}));
  }

  @Test 
  public void Array6Test(){
    Assert.assertArrayEquals(new int[] {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5}, Utility.seriesUp(5));
    Assert.assertArrayEquals(new int[] {1,1,2,1,2,3,1,2,3,4}, Utility.seriesUp(4));
    Assert.assertArrayEquals(new int[] {1}, Utility.seriesUp(1));
    Assert.assertArrayEquals(new int[] {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10}, Utility.seriesUp(10));
    Assert.assertArrayEquals(new int[] {}, Utility.seriesUp(0));
  }

  @Test
  public void Array9Test(){
    int test1[][] = {{1,2,3},{1,2,3},{1,2,3}};
    int test1Expected[][] = {{1,1,1},{2,2,2},{3,3,3}};
    assertTrue(Arrays.deepEquals(test1Expected, Utility.invert(test1)));
    int test2[][] = {{3,2,1},{3,2,1},{3,2,1}};
    int test2Expected[][] = {{3,3,3},{2,2,2},{1,1,1}};
    assertTrue(Arrays.deepEquals(test2Expected, Utility.invert(test2)));
    int test3[][] = {{9,9,9},{8,8,8},{7,7,7}};
    int test3Expected[][] = {{9,8,7},{9,8,7},{9,8,7}};
    assertTrue(Arrays.deepEquals(test3Expected, Utility.invert(test3)));
  }
}
