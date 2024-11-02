package org.pixlaunch.Array.singleNumber_0136;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Read values from user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of Array A comma separated: ");
        String valueOfA = myObj.next();  // Read user input


        //Convert user String input to Array
        int[] arrayA = Arrays.stream(valueOfA.split(",")) // Step 1: Split and create a stream
                .map(String::trim)    // Step 2: Trim spaces
                .mapToInt(Integer::parseInt)    // Step 3: Parse to int
                .toArray();                 //

        Solution solution = new Solution();
        System.out.println(solution.singleNumber(arrayA));
    }

}
