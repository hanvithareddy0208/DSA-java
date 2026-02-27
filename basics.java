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