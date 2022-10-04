package gr11review.part2;

import java.io.*; 

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
        String fullFilePath = filePath + "/bin/gr11review/test2/";
        //Reads through the file given the file name
        
        try{
        BufferedReader br = new BufferedReader(new FileReader(fullFilePath + filenametxt));
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
    
}
