// def findClosestChar(goodString, nameChar, prevGoodChar):
//     closestChar = goodString[0]
//     minDistance = abs(ord(nameChar) - ord(closestChar))
    
//     for goodChar in goodString:
//         distance = abs(ord(nameChar) - ord(goodChar))
//         # Check if we found a better match or if the equidistant case applies
//         if distance < minDistance or (distance == minDistance and abs(ord(prevGoodChar) - ord(goodChar)) < abs(ord(prevGoodChar) - ord(closestChar))):
//             closestChar = goodChar
//             minDistance = distance
    
//     return closestChar

// def calculateTotalDistance(goodString, name):
//     goodArr = list(goodString)  # Turn good string into a list of chars
//     totalDistance = 0  # Initialize total distance
//     prevGoodChar = goodArr[0]  # Start with the first char of the good string
    
//     for nameChar in name:  # Loop through each character of the name
//         if nameChar in goodString:
//             # If nameChar is in the good string, use it as the previous good character
//             prevGoodChar = nameChar
//         else:
//             # Find the closest good char for the current nameChar
//             closestGoodChar = findClosestChar(goodArr, nameChar, prevGoodChar)
//             # Add the distance between the name char and the closest good char
//             totalDistance += abs(ord(nameChar) - ord(closestGoodChar))
//             # Update the previous good character
//             prevGoodChar = closestGoodChar
    
//     return totalDistance

// if __name__ == "__main__":
//     goodString = input().strip()  # Input for the good string
//     name = input().strip()  # Input for the name
    
//     totalDistance = calculateTotalDistance(goodString, name)  # Calculate the total distance
//     print(totalDistance)  # Output the total distance

// to java

import java.util.*;

public class GoodString {
    public static char findClosestChar(String goodString, char nameChar, char prevGoodChar) {
        char closestChar = goodString.charAt(0);
        int minDistance = Math.abs(nameChar - closestChar);

        for (char goodChar : goodString.toCharArray()) {
            int distance = Math.abs(nameChar - goodChar);
            if (distance < minDistance || (distance == minDistance && Math.abs(prevGoodChar - goodChar) < Math.abs(prevGoodChar - closestChar))) {
                closestChar = goodChar;
                minDistance = distance;
            }
        }

        return closestChar;
    }

    public static int calculateTotalDistance(String goodString, String name) {
        char[] goodArr = goodString.toCharArray();
        int totalDistance = 0;
        char prevGoodChar = goodArr[0];

        for (char nameChar : name.toCharArray()) {
            if (goodString.indexOf(nameChar) != -1) {
                prevGoodChar = nameChar;
            } else {
                char closestGoodChar = findClosestChar(goodString, nameChar, prevGoodChar);
                totalDistance += Math.abs(nameChar - closestGoodChar);
                prevGoodChar = closestGoodChar;
            }
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goodString = sc.nextLine();
        String name = sc.nextLine();
        int totalDistance = calculateTotalDistance(goodString, name);
        System.out.println(totalDistance);
        sc.close();
    }
}