/*Form Alternating String
Problem Description
Thara suggested, "How about we have some fun with binary strings?"

Let's get started!

Thara will give you a binary string made up of 0s and 1s, along with an array of values indicating the worth of each character. Your first objective is to remove zero or more characters to form the largest alternating string possible. After achieving that, your second goal is to maximize the worth of this largest alternating string.

A string is considered an alternating string if it contains characters that alternate without repeating, such as 010101 or 101010.

Thara asked you about the worth of the characters that need to be removed. Can you determine that?

Constraints
2 <= length of the binary string <= 10000

1 <= worth of each character <= 1000

the binary string will have at least one pair of 0 and 1.

Input
First line consists of a binary string of length N.

The second line consist of N space separated integers representing the worth of corresponding characters.

Output
Print an integer that represents the sum of worth of the characters that must be deleted to transform the given string into the largest alternating string with the maximum worth.

Time Limit (secs)
1

Examples
Example 1

Input

100101110110

5 19 8 7 6 15 4 3 2 1 10 8

Output

16

Explanation

Given binary string is 100101110110. It's worth is 88.

By removing the characters at indices {2, 6, 7, 9} using 0-based indexing, we obtain the string 10101010, which is the longest alternating string possible. Therefore, the total worth of all the removed characters is 16. Thus, print this value as output.

Example 2

Input

0111010111010

4 3 6 9 12 15 2 4 6 8 10 1 5

Output

19

Explanation

Given binary string is 0111010111010. It's worth is 66.

By removing the characters at indices {1, 2, 7, 8} using 0-based indexing, we obtain the string 010101010, which is the longest alternating string possible. Therefore, the total worth of all the removed characters is 19. Thus, print this value as output. */

import java.util.*;
class CODEVITA_FormAlternatingString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(i < n - 1 && s.charAt(i) == s.charAt(i + 1))
            {
                if(a[i] < a[i + 1])
                {
                    sum += a[i];
                    s = s.substring(0, i) + s.substring(i + 1);
                    a = Arrays.copyOfRange(a, 0, i);
                    n--;
                    i--;
                }
                else
                {
                    sum += a[i + 1];
                    s = s.substring(0, i + 1) + s.substring(i + 2);
                    a = Arrays.copyOfRange(a, 0, i + 1);
                    n--;
                    i--;
                }
            }
        }
        System.out.println(sum);
    }
}