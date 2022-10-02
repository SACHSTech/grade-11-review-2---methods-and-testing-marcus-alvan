package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.io.*;  

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
    assertEquals("conservation", Utility.vowelCount("src\\gr11review\\test2\\Review2_3Test_1.txt"));
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
}
