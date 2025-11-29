/*
    Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
      (examples)
      input: [1,2,8,9,12,46,76,82,15,20,30]
      Output:
        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Program_4{
    public static void getMultiplesCount(int[] nums){
        Map<Integer, Integer> result = new HashMap<>();
        for(int i=1; i<=9; i++){
            for(int num : nums){
                if(num % i == 0){
                    if(result.containsKey(i)){
                        result.put(i, result.get(i)+1);
                    }else{
                        result.put(i, 1);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int key : result.keySet()){
            sb.append(key).append(": ");
            sb.append(result.get(key)).append(", ");
        }
        sb.setCharAt(sb.length()-2, '}');
        System.out.println("Output: "+ sb);
    }
    public static void main(String[] args) {
        /*
        // Here, the input array is taken from the user (dynamic input) rather than being hardcoded.
            Scanner input = new Scanner(System.in);
            System.out.print("Enter length of the dictionary: ");
            int n = input.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter all the "+ n + " numbers here: ");
            for(int i=0; i<n; i++){
                nums[i] = input.nextInt();
            }
         */

        // In this case, I’m using the array specified in the problem.
        int[] nums = {1,2,8,9,12,46,76,82,15,20,30};
        getMultiplesCount(nums);
    }
}