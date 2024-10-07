// import java.util.*;

// import java.util.*;

// class Testing {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         int n = sc.nextInt();
//         long a = sc.nextLong();
//         String s = sc.next();//word
//         String str = sc.nextLine();//sentence
//         double d = sc.nextDouble();

//         // object creation syntax
//         ClassName objectName = new ClassName();

//write a code in java to take input of a number and print its factorial 
import java.util.*;
class Testing {
    public static void main(String[] args) {
        Testing obj = new Testing();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.factorial(n));
        
    }
    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}