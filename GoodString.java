// GoodString
// Problem Description
// A picnic to a famous museum is being planned in a school for class VI. When they reached the spot, the students started quarreling among themselves in the queue. So the teacher came up with an idea of "good string" which is explained below.

// Good String is provided as input. All letters in this string are good letters. Good letters need to be used in further computations as explained below.

// The teacher asked all the students to convert their names into good names with the help of good string. While converting, they have to calculate the distance. Based on that, she will arrange the students in a queue.

// For converting a name into good name, for each letter i in the name, select the nearest letter from the good name. Distance is calculated as the differences between the ASCII values of i and selected good letter. If there are two letters which are equidistant from i, select the letter which is nearest to the previously used good letter. In that case, distance will be the difference of ASCII value of previously used good letter and selected letter. If i is already present in the good string then no need to change it. Initially, previous good letter will be the first letter of good string. Calculate the total distance of the given name.

// Given the name of the student who is confused of implementing this task. Help him to calculate the total distance for his name.

// Note: Letters from good string can be reused any number of times.

// Constraints
// 1 <= len(good string) <= 100

// 1 <= len(name) <= 10^4

// Good string will consist of lower, upper case alphabets,digits and symbols.

// Name will consist of only space,lower and upper case alphabets.

// Characters are case sensitive.

// The ASCII values for all the characters in the good string and name will be between 32 to 126 (both inclusive).

// Input
// First line consists of good string.

// Second line consists of the name of the student who is confused to implement the task.

// Output
// Print the total distance for that name.

// Time Limit (secs)
// 1
//write code here
import java.util.*;
public class GoodString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String goodString = sc.nextLine();
        String name = sc.nextLine();
        int totalDistance = 0;
        char prevGoodLetter = goodString.charAt(0);
        for (char c : name.toCharArray())
        {
            if (goodString.indexOf(c) != -1)
            {
                continue;
            }
            int minDistance = Integer.MAX_VALUE;
            char nearestGoodLetter = prevGoodLetter;
            for (char goodLetter : goodString.toCharArray())
            {
                int distance = Math.abs(c - goodLetter);
                if (distance < minDistance || (distance == minDistance && Math.abs(prevGoodLetter - goodLetter) < Math.abs(prevGoodLetter - nearestGoodLetter)))
                {
                    minDistance = distance;
                    nearestGoodLetter = goodLetter;
                }
            }
            totalDistance += minDistance;
            prevGoodLetter = nearestGoodLetter;
        }
        System.out.println(totalDistance);
        sc.close();
    }
}