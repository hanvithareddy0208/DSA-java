//basics

//1.positive or negative
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a>0){
//             System.out.println("positive");
//         }else if(a<0){
//             System.out.println("negative");
//         }else{
//             System.out.println("zero");
//         }
//     }
// }

//2.even number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a%2==0){
//             System.out.println("yes");
//         }else{
//             System.out.println("odd");
//         }
//     }
// }

//3.sum of first n number numbers
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum =0;
//         for(int i=0;i<a;i++){
//             sum = sum +i;
//         }
//         System.out.println(sum);
//     }
// }

//4.n natural numbers
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<a;i++){
//             System.out.println(i);
//         }
//     }
// }

//5.sum in given range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             System.out.println(i);
//         }
//     }
// }

//6.greatest between two
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int greatest = Math.max(a,b);
//         System.out.println(greatest);
//     }
// }

//7.greatest of three
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();
//         int c = sc.nextInt();
//         int greatest = Math.max(a,(Math.max(b,c)));
//         System.out.println(greatest);
//     }
// }

//8.leap year
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a%4==0){
//             System.out.println("leap year");
//         }else{
//             System.out.println("no");
//         }
//     }
// }

//9.leap year between two given ranges
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             if(i%4==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//10.prime number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         boolean isprime = false;
//         if(a<=1){
//             isprime = false;
//         }
//         for(int i=2;i<=a/2;i++){
//             if(a%i==0){
//                 isprime = false;
//                 break;
//             }
//         }
//         if(isprime){
//             System.out.println("prime");
//         }else{
//             System.out.println("not a prime");
//         }
//     }
// }

//11.prime numbers between two given ranges
// import java.util.Scanner;
// public class basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             if(i<=1){
//                 continue;
//             }
//             boolean isPrime = true;
//              for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.println(i +" ");
//             }
//         }
//     }
// }

//12.sum of digits
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum=0;
//         while(a!=0){
//             int rem = a%10;
//             sum = sum+rem;
//             a = a/10;
//         }
//         System.out.println(sum);
//     }
// }

//13.reverse a number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int rev=0;
//         while(a!=0){
//             int rem = a%10;
//             rev = rev*10+rem;
//             a = a/10;
//         }
//         System.out.println(rev);
//     }
// }

//14.palindrome number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int original =a;
//         int rev=0;
//         while(a!=0){
//             int rem = a%10;
//             rev = rev*10+rem;
//             a = a/10;
//         }
//         if(original==rev){
//             System.out.println("palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }
//     }
// }

//15.counting numbers
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int count =0;
//         while(a!=0){
//             a = a/10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }



//16.amstrong number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int rev=0;
//         int original =a;
//         while(a!=0){
//             int rem = a%10;
//             rev = rev + (rem*rem*rem);
//             a = a/10;
//         }
//         if (original==rev){
//             System.out.println("amstrong");
//         }else{
//             System.out.println("not amstrong");
//         }
//     }
// }

//17.amstrong numbers between two given ranges
// import java.util.Scanner;
// public class basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for (int i = a; i <= b; i++) {
//             int original = i;
//             int temp = i;     // copy for digit extraction
//             int sum = 0;
//             while (temp != 0) {
//                 int rem = temp % 10;
//                 sum = sum + (rem * rem * rem);
//                 temp = temp / 10;
//             }
//             if (sum == original) {
//                 System.out.print(original + " ");
//             }
//         }
//     }
// }

//18.fibanacci series
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a =0;
//         int b=1;
//         int c;
//         System.out.print(a+" "+b);
//         for(int i=2;i<=n;i++){
//             c = a+b;
//             System.out.print(" "+c);
//             a=b;
//             b=c;
//         }
//     }
// }

//19.factorial of a number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int result =1;
//         for(int i=1;i<=a;i++){
//             result = result*i;
//         }
//         System.out.println(result);
//     }
// }

//20.power
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int result =1;
//         for(int i=1;i<=b;i++){
//             result = result*a;
//         }
//         System.out.println(result);
//     }
// }

//21.factors
