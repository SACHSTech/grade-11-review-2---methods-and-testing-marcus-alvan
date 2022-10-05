package gr11review.part2;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility {
        public static void main(String[] args)throws Exception{
            //tests for methods
            String h = longestWord("src/gr11review/part2/words.txt");
            String g = longestWord("src/gr11review/part2/GameNames.txt");
            System.out.println(h);
            System.out.println(g);
            boolean y = linearIn(new int[]{1, 2, 4},(new int[]{2, 4}));
            System.out.println(y);
            int[][] r = reverse(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
            System.out.println(r);


                }

                /*
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

            

    

