package gr11review.part2;

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
    * @param 
    * @return String representing the word in the file with the most vowels
    */
    public static String vowelCount(){

    }

    /**
    * Return an array that contains the exact same numbers as a given array
    * but rearranged so that lal the zeros are grouped at the start of the array
    * the order of non-zero numbers does not matter
    * @param int[] x
    * @return An array with the zero's moved to the front
    */
    public static int[] zeroFront(){

    }

    /**
    * Given n>=0 create an array with the pattern `{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}`
    * (spaces added to show the grouping). The length of the array will be 
    * 1+2+3..+n which is known to sum to exactly n*(n + 1)/2.
    * @param int n
    * @return Array with the pattern `{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}`
    */

    public static int[] seriesUp(int n){

    }

    /**
    * A method that inverts a 2D array. By inverting the array, it means that each
    * row of the array is now a column, and each column is now a row.
    * @param int[][] x
    * @return inverted 2D array
    */
    public static int[][] invert(int[][] arr){

    }
    
}
