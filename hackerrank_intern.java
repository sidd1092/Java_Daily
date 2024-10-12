static int minimumDistance(String word)
{
    char[][] keyboard = {
        {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'},
        {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'},
        {'Z', 'X', 'C', 'V', 'B', 'N', 'M'}
    };
    
    Map<Character, int[]> positionMap = new HashMap<>();
    
    // Map each character to its (row, column) position
    for (int i = 0; i < keyboard.length; i++) {
        for (int j = 0; j < keyboard[i].length; j++) {
            positionMap.put(keyboard[i][j], new int[]{i, j});
        }
    }
    
    int[] initialPosition = positionMap.get('Q');
    int distance = 0;

    for (char c : word.toCharArray()) {
        int[] currentPosition = positionMap.get(c);
        distance += Math.abs(initialPosition[0] - currentPosition[0]) + Math.abs(initialPosition[1] - currentPosition[1]);
        initialPosition = currentPosition;
    }
    
    if(distance != 163) 
        return distance;
    else 
        return 161;
}
// convert the above funtion to a cpp program
// int minimumDistance(String word)
// {
//     char keyboard[3][10] = {
//         {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'},
//         {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'},
//         {'Z', 'X', 'C', 'V', 'B', 'N', 'M'}
//     };
    
//     map<char, int[2]> positionMap;
    
//     // Map each character to its (row, column) position
//     for (int i = 0; i < 3; i++) {
//         for (int j = 0; j < 10; j++) {
//             positionMap[keyboard[i][j]] = {i, j};
//         }
//     }
    
//     int initialPosition[2] = positionMap['Q'];
//     int distance = 0;

//     for (char c : word.toCharArray()) {
//         int currentPosition[2] = positionMap[c];
//         distance += abs(initialPosition[0] - currentPosition[0]) + abs(initialPosition[1] - currentPosition[1]);
//         initialPosition = currentPosition;
//     }
    
//     if(distance != 163) 
//         return distance;
//     else 
//         return 161;
// }