/*
Given a string (S) that is appended with a number at last. You need to find whether the length of string excluding that number is equal to that number. For example for “helloworld10”, answer is True as helloworld consist of 10 letters. 

Examples:

Input:  S = "geeks5"
Output:  1
Explanation : As geeks is of 5 length and at 
              last number is also 5.

Input:  S = "geeksforgeeks15"
Output:  0
Explanation: As geeksforgeeks is of 13 length and
             at last number is 15 i.e. not equal


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case in a new line print 1 if the condition holds else print 0.

Constraints:
1<=T<=100
1<=Length of string<=1000

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for (int i=0; i<t; i++){
			String s, str, str1;
			int x, idx=0, len;
			s = sc.next();
			len = s.length();
			for (int j=len-1; j>=0; j--) {
				char sh = s.charAt(j);
				if (Character.isDigit(sh) == false) {
					idx = j+1;
					break;
				}
			}
			str = s.substring(0,idx);
			str1 = s.substring(idx);
			x = Integer.parseInt(str1);
			if (str.length() == x) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}
