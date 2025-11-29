/*
    Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

      Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1, 3
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5, 7
        .
        .
        5) input a = x, then output : 1, 3, 5, 7, .......
 */

import java.util.Arrays;
import java.util.Scanner;

public class Program_2{
    public static int[] printSeries(int n){
        int[] series = new int[n];
        int index = 0;
        int num = 1;
        while(index < n){
            series[index++] = num;
            num += 2;
        }
        return series;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = input.nextInt();

        int[] result = printSeries(n);

        System.out.println(Arrays.toString(result));
    }
}