package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
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
  
}
