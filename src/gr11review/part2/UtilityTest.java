package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class UtilityTest{
  
  //Start of Alvan's Code
    @Test
    public void method2Test(){
        assertEquals(40, Utility.sumNumbers("1hsi31u8"));
        assertEquals(1004,Utility.sumNumbers("L1o984Hf19"));
        assertEquals(0, Utility.sumNumbers("sdfisgj0"));
        assertEquals(1234, Utility.sumNumbers("1234"));
    }
    
    @Test
    public void FileIO2Test() throws IOException{
        assertEquals("advancedfunctions", Utility.alphaWord("FileIO2Test1.txt"));
        assertEquals("brawlball", Utility.alphaWord("FileIO2Test2.txt"));
        assertEquals("adidas", Utility.alphaWord("FileIO2Test3.txt"));
    }

    @Test
    public void Array2Test(){
        Assert.assertArrayEquals(new int[] {1, 3, 3}, Utility.notAlone(new int[] {1, 2, 3}, 2));
        Assert.assertArrayEquals(new int[] {1, 6, 6, 6, 1}, Utility.notAlone(new int[] {1, 4, 6, 4, 1}, 4));
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Utility.notAlone(new int[] {1, 2, 3, 4, 5}, 6));
    }
    @Test
    public void Array5Test(){
        assertTrue(Utility.canBalance(new int[] {1, 2, 1, 1, 1}));
        assertFalse(Utility.canBalance(new int[] {1, 2, 3, 2, 3}));
        assertTrue(Utility.canBalance(new int[] {1, 5, 10 ,10 , 5, 1}));
        assertFalse(Utility.canBalance(new int[] {1}));
    }
    @Test
    public void Array8Test(){
        Assert.assertArrayEquals(new int[][] {{1,2},{4,5}}, Utility.split(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 1, 1));
        Assert.assertArrayEquals(new int[][] {{2,65,30},{24,13,5}}, Utility.split(new int[][] {{2,65,30},{24,13,5},{56,27,12}}, 1, 2));
        Assert.assertArrayEquals(new int[][] {{1}}, Utility.split(new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}, 0, 0));
        Assert.assertArrayEquals(new int[][] {{2,4,8,16},{32,64,128,256}}, Utility.split(new int[][] {{2,4,8,16},{32,64,128,256}}, 1, 3));
  //End of Alvan's test

  //Start of Matthew's test
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
  //End of Matthew's code

  //Start of Marcus's code
  @Test
    public void methodTest1(){
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }

    @Test
    public void methodTest2(){
        assertEquals(false, Utility.xyBalance("yx"));
    }

    @Test
    public void methodTest3(){
        assertEquals(true, Utility.xyBalance("xxxxxgy"));
    }

    @Test
    public void FileIOTest1() throws IOException {
        // System.out.println("This is where my files are");
        // System.out.println(Arrays.toString(new File(".").list()));
        
        assertEquals("consectetur", Utility.longestWord("words.txt"));
    }

    @Test
    public void FileIOTest2(){
        assertEquals("League of Legends", Utility.longestWord("GameNames.txt"));
    }

    @Test
    public void Array1Test1(){
    assertArrayEquals(new int[]{4, 6, 1, 0, 0, 0, 0}, Utility.withoutTen(new int[]{10, 4, 10, 10, 6, 1, 10}));
    }

    @Test
    public void Array1Test2(){
    assertArrayEquals(new int[]{5, 34, 16, 9, 0, 0}, Utility.withoutTen(new int[]{5, 10, 34, 16, 10, 9}));
    }

    @Test
    public void Array4Test1(){
    assertEquals(true, Utility.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
    }

    @Test
    public void Array4Test2(){
    assertEquals(false, Utility.linearIn(new int[]{3, 5}, new int[]{3, 5, 20}));
    }

    @Test
    public void Array4Test3(){
    assertEquals(true, Utility.linearIn(new int[]{10, 6, 33, 59, 4, 7, 16}, new int[]{4, 7}));
    }

    @Test
    public void Array7Test1(){
    assertArrayEquals(new int[][]{{9, 8, 7},{6, 5, 4},{3,2,1}}, Utility.reverse(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void Array7Test2(){
    assertArrayEquals(new int[][]{{6, 8, 10, 12, 14, 16},{18, 20, 22, 24, 26, 28}}, Utility.reverse(new int[][]{{28, 26, 24, 22, 20, 18}, {16, 14, 12, 10, 8, 6}}));
    }

    @Test
    public void Array7Test3(){
    assertArrayEquals(new int[][]{{10, 7, 4},{}}, Utility.reverse(new int[][]{{}, {4, 7, 10}}));
    }
    //End of Marcus's code
}
