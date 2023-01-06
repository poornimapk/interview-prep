import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/*
 * Problem statement =
 * For a Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
   
 */


public class Twosums{
    public static void main(String[] args){
        int[] numArr = {2,7,11,15} ;
        int target = 13;
        int[] output ;

        //Brute-force way
        output = twoSumBruteForce(numArr, target);
        System.out.println("twoSumBruteForce output " + Arrays.toString(output));

        //using hashtable 
        output = twosumHashMap(numArr, target);
        System.out.println("twosumHashMap output " + Arrays.toString(output));

        //using sorting 
        output = twoSumSorting(numArr, target);
        System.out.println("twoSumSorting output " + Arrays.toString(output));
    }

    /*
    * twosumHashMap  - function returns array of elements whose sum  == target
    *  @param numArr
    *  @param target
    *  @return returns array of elements new int[] , whose sum is equal to target
    *  Time complexity: O(n) - most efficient way
    */
    public static int[] twosumHashMap(int[] numArr, int target)
    {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i=0;i<numArr.length ;i++)
        {
            int difference = target - numArr[i];
            if(numMap.containsKey(difference))
            {
                return new int[] {numMap.get(difference),i};   
            }else 
            {
                numMap.put(numArr[i],i);
            }
        }
        //return new int[]{};
        throw new IllegalArgumentException("twosumHashMap : No two sum solution");
    }

    /*/**
    * twoSumBruteForce - function returns array of elements whose sum  == target
    * @param numArr
    * @param target
    * @return returns array of elements new int[] , whose sum is equal to target
      Time complexity: O(n^2)
    */
    public static  int[] twoSumBruteForce(int[] numArr, int target) 
    {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[j] == target - numArr[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("twoSumBruteForce :No two sum solution");
    }


    /*
    * twoSumSorting - function returns array of elements whose sum  == target
    * @param numArr
    * @param target
    * @return returns array of elements new int[] , whose sum is equal to target
     * Time complexity: O(n*log(n))
     */

    public static int[] twoSumSorting(int[] numArr, int target) {
        Arrays.sort(numArr); 
        int left = 0;
        int right = numArr.length - 1;
        while(left < right) {
            if(numArr[left] + numArr[right] == target) {
                return new int[] {left, right};
            } else if (numArr[left] + numArr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
    
}