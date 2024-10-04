// Orchard
// Problem Description
// Orchards are a piece of enclosed land planted with different fruit trees in an orderly manner.
// Ashok and Anand are friends. On a fine day they went to an orchard where lemon and mango trees are planted in rows. The owner planted these trees in rows but in random order. Some trees have plenty of fruits and some other plants didn't gave good yield. While they are walking through the rows, both of them selected a row of trees. The trees in the row are represented by M and L which represents mango and lemon respectively. After selecting the rows, they both argued for sometime over the number of fruits. Then they saw Akhil walking towards them. They asked Akhil to declare which row holds more number of fruits. Akhil understood that guessing the row with maximum number of fruits will be quite difficult. So he asked each of them to select any three trees from the row such that no two adjacent trees should be of same type and whoever have maximum possibilities for selecting the trees will be considered as winners. Refer to the example section for better understanding.
// Given two strings denoting the trees in the selected rows, find who is the winner. If the input string is invalid, print "Invalid input" and if no one wins, print "Draw".
// Constraints
// 1 <= len(str) <= 10^5
// Input
// First line consists of the string denoting trees in Ashok's row.
// Second line consists of the string denoting trees in Anand's row.
// Output
// Print the name of the winner in a single line. If it's a draw match, print "Draw". Incase of invalid inputs, print "Invalid input".
// Time Limit (secs)
// 1
// Examples
// Example 1
// Input
// MMLMLLM
// LMLLLMLM
// Output
// Anand
// Explanation-
// Ashok's possibilities are (1,3,4), (2,3,4), (3,4,6), (4,6,7), (1,3,7), (3,4,5), (1,5,7), (2,6,7), (2,3,7), (2,5,7), (4,6,7), (1,6,7) i.e., 12 possibilities.
// Anand's possibilities are (2,3,6), (1,2,3), (1,6,7), (1,2,4), (3,6,7), (2,3,8), (1,2,5), (2,4,6), (4,6,7), (1,2,7), (2,4,8), (5,6,7), (2,5,6), (2,7,8), (2,5,8), (6,7,8) i.e., 16 possibilities. Hence he wins.Print the name of the winner in a single line. If it's a draw match, print "Draw". Incase of invalid inputs, print "Invalid input".

//write code as per the problem statement

import java.util.*;
public class Orchard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ashok = sc.nextLine();
        String anand = sc.nextLine();
        if (ashok.length() != anand.length())
        {
            System.out.println("Invalid input");
            return;
        }
        int n = ashok.length();
        int ashokPossibilities = 0;
        int anandPossibilities = 0;
        for (int i = 0; i < n - 2; i++)
        {
            if (ashok.charAt(i) != ashok.charAt(i + 1) && ashok.charAt(i + 1) != ashok.charAt(i + 2) && ashok.charAt(i) != ashok.charAt(i + 2))
            {
                ashokPossibilities++;
            }
            if (anand.charAt(i) != anand.charAt(i + 1) && anand.charAt(i + 1) != anand.charAt(i + 2) && anand.charAt(i) != anand.charAt(i + 2))
            {
                anandPossibilities++;
            }
        }
        if (ashokPossibilities > anandPossibilities)
        {
            System.out.println("Ashok");
        }
        else if (anandPossibilities > ashokPossibilities)
        {
            System.out.println("Anand");
        }
        else
        {
            System.out.println("Draw");
        }
        sc.close();
    }
}
