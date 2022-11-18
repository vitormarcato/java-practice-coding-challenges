import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1>= i >=10) should be printed on a new line in the form: N x i = result.

//2<=N<=20
//Print  lines of output; each line  (where ) contains the result of Nx i  in the form:
//N x i = result.

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
    // Solution
        for (int i = 1; i<11; i++ ){
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        bufferedReader.close();
    }
}
