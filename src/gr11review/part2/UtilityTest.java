package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.io.*;

public class UtilityTest{
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
    }
}
