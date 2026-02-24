//1.initialization
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

//2.array sum
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         int sum=0;
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             sum = sum+arr[i];
//         }
//         System.out.println(sum);
//     }
// }

//3.average
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         int sum=0;
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             sum = sum+arr[i];
//         }
//         int average =sum/a;
//         System.out.println(average);
//     }
// }

//4.even or odd
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             if(arr[i]%2==0){
//                 System.out.println("even");
//             }else{
//                 System.out.println("odd");
//             }
//         }
//     }
// }

//5.positive or negative
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             if(arr[i]>0){
//                 System.out.println("positive");
//             }else if(arr[i]<0){
//                 System.out.println("negative");
//             }else{
//                 System.out.println("zero");
//             }
//         }
//     }
// }

//6.greateat or maxium
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         int max=arr[0];
//         int temp;
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             if(arr[i]>max){
//                 temp = arr[i];
//                 arr[i]=max;
//                 max=temp;
//             }
//         }
//         System.out.println(max);
//     }
// }

//7.smallest
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         int min=arr[0];
//         int temp;
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             if(arr[i]<min){
//                 temp = arr[i];
//                 arr[i]=min;
//                 min=temp;
//             }
//         }
//         System.out.println(min);
//     }
// }

//8.reverse 
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=a-1;i>=0;i--){
//             System.out.println(arr[i]);
//         }
//     }
// }

//9.copied array
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         int copied[]=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             copied[i]=arr[i];
//         }
//         for(int i=0;i<a;i++){
//             System.out.println(copied[i]);
//         }
//     }
// }

//10.basic search
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         int key = sc.nextInt();
//         for(int i=0;i<a;i++){
//             if(arr[i]==key){
//                 System.out.println("found at index "+i);
//                 return;
//             }
//         }
//         System.out.println("not found");
//     }
// }