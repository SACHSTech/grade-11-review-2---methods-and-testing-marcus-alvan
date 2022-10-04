package gr11review.part2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Utility{

    /**
    * Given a string, return the sum of the numbers appearing in the string,
    * ignoring other characters.
    * @param str the given string
    * @param intArr an array that stores all the numbers extracted from the string
    * @return the sum of the numbers appearing in the string
    * @author Alvan Chui
    */
    public static int sumNumbers(String str){
        //declare variables
        int sum = 0;
        //store all the numbers value in an array
        String inputstring = str.replaceAll("[^0-9]", "@");
        String[] intArr = inputstring.split("[@]",0);
        //calculate the sum
        for (String intSubString : intArr){
            if(intSubString != "")
                sum += Integer.parseInt(intSubString, 10);        
        }
        return sum;
    }

    /**
    * Given a name of file that contains a single word on each line,
    * returns the word that is alphabetically first.
    * @param filenametxt the given name of file
    * @param words an arraylist that stores every words in the file
    * @return the word that is alphabetically first
    * @author Alvan Chui
    */
    public static String alphaWord(String filenametxt) throws IOException{
        String filepath = new File("").getAbsolutePath();
        String fullFilePath = filepath + "/bin/gr11review/part2/" + filenametxt;
        //declare variables
        String firstword;
        ArrayList<String> words = new ArrayList<String>();
        File txtfile = new File(fullFilePath);
        Scanner Reader = new Scanner(txtfile);
        //read the file and store every words in the arraylist
        while (Reader.hasNextLine()){
            words.add(Reader.nextLine());
        }
        Reader.close();
        //sort the arraylist alphabetically
        Collections.sort(words);
        //get the word that is alphabetically first
        firstword = words.get(0);
        return firstword;
    }
    
    /**
    * Given an integer array
    * Return another version of the given array 
    * where every instance of the given value which is alone is 
    * replaced by whichever value to its left or right is larger.
    * @param nums the array of integers
    * @param value the given value
    * @return a version of the given array where every given value which is alone is replaced
    * @author Alvan Chui
    */
    public static int[] notAlone(int[] nums, int value){
        //replace the alone values
        for(int count = 0; count < nums.length; count++){
            if((nums[count] == value)&&(count > 0)&&(count < nums.length-1)&&(nums[count] != nums[count-1])&&(nums[count] != nums[count+1])){
                if(nums[count+1] > nums[count-1])
                    nums[count] = nums[count+1];
                else
                    nums[count] = nums[count-1];
            }
        }
        return nums;
    }
    
    /**
    * Given a non-empty array
    * return true if there is a place to split the array 
    * so that the sum of the numbers on one side is 
    * equal to the sum of the numbers on the other side.
    * @param nums the given integer array
    * @param lhs_value the left hand side value of the splitted array
    * @param rhs_value the right hand side value of the splitted array
    * @param balance the boolean that stores the final answer
    * @return true or false if the sum each sides of splited arrays are the same
    * @author Alvan Chui
    */
    public static boolean canBalance(int[] nums){
        //declare variables
        int lhs_value = 0, rhs_value = 0;
        boolean balance = false;
        //initialize the right hand side
        for(int count = 0; count < nums.length; count++){
            rhs_value += nums[count];
        }
        //split the array
        for(int count = 0; count < nums.length - 1; count++){
            lhs_value += nums[count];
            rhs_value -= nums[count];
            //check if the sum of both sides are the same
            if(lhs_value == rhs_value)
                balance = true;
        }
        return balance;
    }
    
    /**
     * Given a 2D array, a row and column position
     * return all elements up to that point in the array
     * @param arr the given 2D array
     * @param row the given row value
     * @param col the given column value
     * @param new_arr the new array trimmed up to a certain point
     * @return all elements up to that point in the array
     * @author Alvan Chui
     */
    public static int[][] split(int[][] arr, int row, int col){
        int[][] new_arr = new int[row+1][col+1];
        for (int rowCount = 0; rowCount <= row; rowCount++){
            for(int colCount = 0; colCount <= col; colCount++)
                new_arr[rowCount][colCount] = arr[rowCount][colCount];
        }
        return new_arr;
    }    
}    
