//basics

//1.positive or negative
//2.even number
//3.sum of first n number numbers
//4.n natural numbers
//5.sum in given range
//6.greatest between two
//7.greatest of three
//8.leap year
//9.leap year between two given ranges
//10.prime number
//11.prime numbers between two given ranges
//12.sum of digits
//13.reverse a number
//14.palindrome number
//15.counting numbers
//16.amstrong number
//17.amstrong numbers between two given ranges
//18.fibanacci series
//19.factorial of a number
//20.power
//21.Check perfect number
//22.perfect numbers between range
//23.strong number
//24.strong numbers between range
//25.perfect square
//26.perfect squares between range
//27.automorphic number
//28.automorphic numbers between range
//29.harshad number
//30.harshad numbers between range
//31.neon number
//32.neon numbers between range
//33.spy number
//34.spy numbers between range
//35.disarium number
//36.disarium numbers between range
//37.circular prime


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
//         boolean isprime = true;
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
//             System.out.println("is prime");
//         }else{
//             System.out.println("not prime");
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
//         int count =0;
//         for(int i=a;i<=b;i++){
//             boolean isprime = true;
//             if(i<=1){
//                 isprime = false;
//             }
//             for(int j=2;j<=i/2;j++){
//                 if(i%j==0){
//                     isprime = false;
//                     break;
//                 }
//             }
//             if(isprime){
//                 System.out.println(i);
//                 count++;
//             }
//         }
//         System.out.println("count is"+count);
//     }
// }

//12.sum of digits
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum =0;
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

//18.fibbanacci series
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0;
//         int b = 1;  
//         System.out.print(a + " " + b + " ");
//         for(int i=2;i<=n;i++){
//             int next = a+b;
//             System.out.print(next+" ");
//             a = b;
//             b = next;
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

//21.Check perfect number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum =0;
//         for(int i=1;i<a;i++){
//             if(a%i==0){
//                 sum = sum+i;
//             }
//         }
//         if(sum==a){
//             System.out.println("perfect number");
//         }else{
//             System.out.println("not perfect");
//         }
//     }
// }

//22.perfect numbers between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int sum =0;
//             for(int j=1;j<i;j++){
//                 if(i%j==0){
//                     sum = sum+j;
//                 }
//             }
//             if(sum==i){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }

//23.strong number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum =0;
//         int original =a;
//         while(a!=0){
//             int rem = a%10;
//             int fact =1;
//             for(int i=1;i<=rem;i++){
//                 fact = fact*i;
//             }
//             sum = sum+fact;
//             a = a/10;
//         }
//         if(sum==original){
//             System.out.println("strong number");
//         }else{
//             System.out.println("no");
//         }
//     }
// }

//24.strong numbers between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int sum =0;
//             int original =i;
//             int temp =i;
//             while(temp!=0){
//                 int rev = temp%10;
//                 int fact =1;
//                 for(int j=1;j<=rev;j++){
//                     fact = fact*j;
//                 }
//                 sum = sum +fact;
//                 temp = temp/10;
//             }
//             if(sum==original){
//                 System.out.println(original+" ");
//             }
//         }
//     }
// }

//25.perfect square
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         boolean found = false;
//         for(int i=1;i<=a;i++){
//             if(i*i==a){
//                 found = true;
//                 break;
//             }
//         }
//         if(found){
//             System.out.println("perfect square");
//         }else{
//             System.out.println("not perfect");
//         }
//     }
// }

//26.perfect squares between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             for(int j=1;j<=i;j++){
//                 if(j*j==i){
//                     System.out.println(i+" ");
//                 }
//             }
//         }
//     }
// }

//27.automorphic number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int square = a*a;
//         String str1 = Integer.toString(a);
//         String str2 = Integer.toString(square);
//         if(str2.endsWith(str1)){
//             System.out.println("automorphic");
//         }else{
//             System.out.println("not automorphic");
//         }
//     }
// }

//28.automorphic numbers between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int square = i*i;
//             String str1 = Integer.toString(i);
//             String str2 = Integer.toString(square);
//             if(str2.endsWith(str1)){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }

//29.harshad number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum=0;
//         int original =a;
//         while(a!=0){
//             int rev = a%10;
//             sum = sum + rev;
//             a=a/10;
//         }
//         if(original%sum==0){
//             System.out.println("harshad number");
//         }else{
//             System.out.println("not a harshad number");
//         }
//     }
// }

//30.harshad numbers between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int original = i;
//             int sum = 0;
//             int temp=i;
//             while(temp!=0){
//                 int rev = temp%10;
//                 sum = sum+rev;
//                 temp = temp/10;
//             }
//             if(original%sum==0){
//                 System.out.println(i +" ");
//             }
//         }
//     }
// }

//31.neon number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int square = a*a;
//         int sum =0;
//         while(square!=0){
//             int rem = square%10;
//             sum = sum + rem;
//             square = square/10;
//         }
//         if(a == sum){
//             System.out.println("neon number");
//         }else{
//             System.out.println("not a neon number");
//         }
//     }
// }

//32.neon numbers between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int square = i*i;
//             int sum = 0;
//             while(square!=0){
//                 int rem=square%10;
//                 sum = sum+rem;
//                 square = square/10;
//             }
//             if(i==sum){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }

//33.spy number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum=0;
//         int product=1;
//         while(a!=0){
//             int rem = a%10;
//             sum = sum+rem;
//             product = product*rem;
//             a = a/10;
//         }
//         if(sum==product){
//             System.out.println("spy number");
//         }else{
//             System.out.println("not a spy number");
//         }
//     }
// }

//34.spy numbers between range
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int sum=0;
//             int product =1;
//             int temp=i;
//             while(temp!=0){
//                 int rem = temp%10;
//                 sum = sum+rem;
//                 product = product *rem;
//                 temp = temp/10;
//             }
//             if(sum==product){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }

//35.disarium number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int original =a;
//         int sum=0;
//         int product=1;
//         int count=0;
//         while(a!=0){
//             int rem = a%10;
//             count++;
//             for(int j=1;j<=count;j++){
//                 product = rem*rem;
//             }
//             sum = sum+product;
//             a=a/10;
//         }
//         if(original==sum){
//             System.out.println("disarium number");
//         }else{
//             System.out.println("no");
//         }
//     }
// }

//36.disarium numbers between range

//37.circular prime


//38.happy number
// import java.util.Scanner;
// public class basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         while(a!=1 && a!=4){
//             int sum = 0;
//             int temp = a;
//             while(a!=0){
//                 int rem = a%10;
//                 sum = sum+(rem*rem);
//                 a = a/10;
//             }
//             a=sum;
//         }
//         if(a==1){
//             System.out.println("happy number");
//         }
//     }
// }