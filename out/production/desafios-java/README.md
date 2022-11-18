# Java Output Formatting - Challenge from Hacker Rank

This is my solution using Java for Hacker Rank Challenge: Stdin and Stdout II

## Challenge Description

The purpose of this exercise is to test your understanding of formatting output using printf.

**Input Format**

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.


**Output Format**

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly  3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.


**Sample Input**

```bash
java 100
cpp 65
python 50
```

**Sample Output**

```bash
================================
java           100 
cpp            065 
python         050 
================================
```

**Explanation**
Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th  character, and each integer that was less than  digits now has leading zeroes.

Check out the original challenge at the link below:

https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
