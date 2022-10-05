package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class UtilityTest{
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
}
