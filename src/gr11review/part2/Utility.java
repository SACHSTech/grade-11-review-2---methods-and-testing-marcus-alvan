package gr11review.part2;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.*; 

/*
 * Description: A collection of methods that solve questions about given data
 * @author John Matthew Kassapian
 */

public class Utility {
        


    /**
    * Given a string, determines if "xyz" appears in the middle of the string
    * To define middle, we say the number of chars to the left and right of "xyz"
    * must differ by at most one.
    * @param String x
    * @return true or false if xyz is in the middle
    */
    public static boolean xyzMiddle(String x){
        int intBeforeXyz = 0;
        int intAfterXyz = 0;
        boolean isAfterXyz = false;
        // runs a for loop through the length of the string given
        for(int i = 0; i < x.length() - 1; i++){
            // takes the char at the index 
            char ch = x.charAt(i);
        
            // checks if the char is "x". 
            if(ch == 120){
                // checks if char after is y
                if(x.charAt(i + 1) == 121){
                    // checks if char after is z
                    if(x.charAt(i + 2) == 122){
                        // Confirms that xyz has been found, and moves the index to after the xyz
                        isAfterXyz = true;
                        i += 2;
                    }
                }
            }
            // if the letters aren't part of the xyz, it'll add to a counter 
            else{
                // counts the letters before xyz
                if(isAfterXyz == false){
                    intBeforeXyz++;
                }
                // counts the letters after xyz
                else if(isAfterXyz == true){
                    intAfterXyz++;
                }
            }

            
            
        }
        // checks if the before and after xyz counts are close enough
        if(intBeforeXyz == intAfterXyz){
            return true;
        }
        else if((intBeforeXyz + 1) == intAfterXyz){
            return true;
        }
        else if((intBeforeXyz - 1) == intAfterXyz){
            return true;
        }
        else{
            return false;
        }
    }


    /**
    * Given the name of a file, that contatins a single word on each line,
    * returns the word that has the highest amount of vowels
    * @param filenametxt - name of the file we're reading
    * @return String representing the word in the file with the most vowels
    */
    public static String vowelCount(String filenametxt){
        // Creates a string that will find the absolute path of a relative file
        String filePath = new File("").getAbsolutePath();
        String fullFilePath = filePath + "/bin/gr11review/test2/"  + filenametxt;
        //Reads through the file given the file name
        
        try{
        BufferedReader br = new BufferedReader(new FileReader(fullFilePath));
            //Creates a String variable that will be assigned the String at each line
            String x = "";
            String strHighestVowel = "";
            int intHighestVowelCount = 0;
            int intVowelCount = 0;

            // While we're still in the file and not at the end of the Strings
            while((x = br.readLine()) != null){
                // Loop through the string, count each vowel and assign it to a variable. If this variable is higher or equal to a previous word, assign the string to a variable, this will be the return variable
                for(int i = 0; i < x.length() - 1; i++){
                    char ch = Character.toLowerCase(x.charAt(i));
                    if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117){
                        intVowelCount++;
                    }
                }
                // if the string had a higher or equal vowel count to any previous string, it is now the one with the most vowels
                if(intVowelCount >= intHighestVowelCount){
                    strHighestVowel = x;
                    intHighestVowelCount = intVowelCount;
                    intVowelCount = 0;
                }

            }
            br.close();
            return strHighestVowel;
        }
        catch(IOException e)  {  
            //return fullFilePath + filenametxt;
            //return "don't work";  
            return e.getMessage();
            }  
    }

    /**
    * Return an array that contains the exact same numbers as a given array
    * but rearranged so that lal the zeros are grouped at the start of the array
    * the order of non-zero numbers does not matter
    * @param int[] x
    * @return An array with the zero's moved to the front
    */
    public static int[] zeroFront(int[] nums){
        // we're going to go at this array from both left to right and right to left
        // when we detect that the element on the left side is not 0 and the one on the right is, we swap them
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            int intLeftNum = nums[i];
            int intRightNum = nums[j];
            
            // if the current left num is 0, we skip through it
            if(intLeftNum == 0){
                i++;
            }
            // if the current right num is not 0, we skip through it
            if(intRightNum != 0){
                j--;
            }

            if(intLeftNum != 0 && intRightNum == 0){
                nums[i] = intRightNum;
                nums[j] = intLeftNum;
                i++;
                i--;
            }

        }
        return nums;

    }

    /**
    * Given n>=0 create an array with the pattern `{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}`
    * (spaces added to show the grouping). The length of the array will be 
    * 1+2+3..+n which is known to sum to exactly n*(n + 1)/2.
    * @param int n
    * @return Array with the pattern `{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}`
    */

    public static int[] seriesUp(int n){
        int[] intPattern = new int[n * (n+1) / 2];
        int i = 1;
        int intIndexNum = 0;

        // Variable i represents the lowest spot in the pattern. 1 being 1 and n being 1,2,3...n
        while(i <= n){
            // we run a for loop that will add the 1 for the pattern, and then switch to the next index
            for(int j = 1; j <= i; j++){
                intPattern[intIndexNum] += j;
                intIndexNum++;
            }
            // we add to i to indicate the next stage of the pattern
            i++;
        }


        return intPattern;
    }

    /**
    * A method that inverts a 2D array. By inverting the array, it means that each
    * row of the array is now a column, and each column is now a row.
    * @param int[][] x
    * @return inverted 2D array
    */
    public static int[][] invert(int[][] arr){
        int[][] invertedArr = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <  arr[0].length; j++){
                int elem = arr[i][j];
                invertedArr[j][i] = elem;
            }
        }
        return invertedArr;
    }

                /*
                 * Checks if for every x char in the string, there is a y char after the string
                 * @param1 String str The string being analyzed
                 * @return true if balanced, false if unbalanced
                 */
                public static boolean xyBalance(String str){
                    //check that for every x in a string, there is a y after the x's which makes the string balanced. One y can balance multiple x's.
                    //find elements in string where x and y appear
                    int xCheck = str.indexOf("x");
                    int yCheck = str.indexOf("y");
                    //if y comes after x , return true, if an x comes before a y or there is no x or y, then return false
                    if(yCheck > xCheck){
                        return true;
                    }else{
                        return false;
                    }
                }

                /*
                 * Run through a file and return the longest word in the file
                 * @param1 filenametxt the file being read
                 * @return the longest word in the file
                 */
                public static String longestWord(String filenametxt){
                    String filePath = new File("").getAbsolutePath();
                    String fullFilePath = filePath + "/bin/gr11review/part2/" + filenametxt;
                    try{
                        //reads contents in file
                        BufferedReader file = new BufferedReader(new FileReader(fullFilePath));

                        String s;
                        //longest word starts as null, if the word in the file is longer, longest word becomes the word
                        String longestWord = null;                                
                        while((s = file.readLine()) != null){
                            int wordLength = s.length();
                            if(longestWord == null || wordLength > longestWord.length()){
                                longestWord = s;
                            }
                        }
                        file.close();
                        return longestWord;
                        //catches IOException
                    }catch(IOException ex){
                        return ex.getMessage();
                        
                    }
                }

                /*
                 * Take an array and print a version of it where all 10s have been removed, shifting any other element in the array to the left
                 * @param1 nums the array being used
                 * @return nums with every 10 changed to a 0 and moved to the end of the array
                 */
                public static int[] withoutTen(int[] nums){
                    //goes through every element in the array, if it's equal to 10, change its value to 0, move it to the end of the array and move other elements forward
                    for(int i = 0; i < nums.length; i++){
                        while(nums[i] == 10){
                            for(int j = i; j < nums.length -1; j++){
                                nums[j] = nums[j + 1];
                            }
                            nums[nums.length -1] = 0;
                        }
                    }
                    return nums;
                }

                /*
                 * Given an inner array and outer array, check if every element in the inner array appears in the outer array
                 * @param1 outer the outer array
                 * @param2 inner the inner array
                 * @return true if every number in the inner array is in the outer array, otherwise return false
                 */
                public static boolean linearIn(int[] outer, int[] inner){
                    //counter for how many times an inner array element appears in the outer array
                    int innerCount = 0;
                    //checks for if an inner array element is equal to an outer array element. Increases the counter by one for every time this is true.
                    for(int i = 0; i < inner.length; i++){
                        for(int j = 0; j < outer.length; j++){
                            if(inner[i] == outer[j]){
                                innerCount++;
                                break;
                            }
                        }          
                    }
                    //If the counter is equal to the amount of elements in the inner array, return true
                    if(innerCount == inner.length){
                        return true;
                    }else{
                        return false;
                    }
                }
                
                /*   
                 * Swap all of the contents in an array(s) so that the first element is the last element and the last element is first
                 * @param1 arr the 2D array
                 * @return arr but with all of its contents reversed(i.e ({1, 2, 3}, {4, 5, 6} = {6, 5, 4}{3, 2, 1}))
                 */
                public static int[][] reverse(int[][] arr){
                    int swapCounterOuter = arr.length/2;
                    //take outer arrays and switches their positions
                    for(int i = 0; i < swapCounterOuter; i++){
                        int[] x = arr[i];
                        arr[i] = arr[arr.length - 1 - i];
                        arr[arr.length - 1 - i] = x;
                    }
                    //takes the contents of the inner arrays and switches their positions
                    for(int i = 0; i < arr.length; i++){
                        int[] innerArray = arr[i];                       
                        for(int j = 0; j < innerArray.length/2; j++){
                            int y = innerArray[j];
                            innerArray[j] = innerArray[innerArray.length - 1 - j];
                            innerArray[innerArray.length - 1 - j] = y;                         
                        }                      
                    } 
                    return arr;
                }
            }

            


        
    

