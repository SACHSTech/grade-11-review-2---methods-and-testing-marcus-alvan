package gr11review.part2;

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
                public static boolean xyBalance(String str){
                    //check that for every x in a string, there is a y after the x's which makes the string balanced. One y can balance multiple x's.
                    //find elements in string where x and y appear
                    int xCheck = str.indexOf("x");
                    int yCheck = str.indexOf("y");
                    //if y comes after x ycheck is true, if not then return false
                    if(yCheck > xCheck){
                        return true;
                    }else{
                        return false;
                    }
                }

                public static String longestWord(String filenametxt){
                    try{
                        //reads contents in file
                        BufferedReader file = new BufferedReader(new FileReader(filenametxt));

                        String s;
                        //longest word starts as null
                        String longestWord = null;                                
                        while((s = file.readLine()) != null){
                            int wordLength = s.length();
                            if(longestWord == null || wordLength > longestWord.length()){
                                longestWord = s;
                            }
                        }
                        file.close();

                        return longestWord;
                    }catch(IOException ex){
                        return ex.getMessage();
                        
                    }
                }

                public static int[] withoutTen(int[] nums){
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

                public static boolean linearIn(int[] outer, int[] inner){
                    int innerCount = 0;
                    for(int i = 0; i < inner.length; i++){
                        for(int j = 0; j < outer.length; j++){
                            if(inner[i] == outer[j]){
                                innerCount++;
                                break;
                            }
                        }          
                    }
                    if(innerCount == inner.length){
                        return true;
                    }else{
                        return false;
                    }
                }
                
                public static int[][] reverse(int[][] arr){
                    int switchCountOuter = arr.length/2;
                    int switchCountInner = arr.length;
                    for(int i = 0; i < switchCountOuter; i++){
                        int[] x = arr[i];
                        arr[i] = arr[arr.length - 1 - i];
                        arr[arr.length - 1 - i] = x;                         
                        for(int j = 0; j < switchCountInner - 1; j++){
                            int[] y = arr[j];
                            arr[j] = arr[arr.length - 1 - j];
                            arr[arr.length - 1 - j] = y;  
                        }                      
                    }

                    
                    return arr;
                }
            }

            

    

