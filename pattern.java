//patterns
//1.regular pattern

//1.regular pattern
// public class pattern{
//     public static void main(String[]args){
//         int n =4;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//2.hollow reactangle
// public class pattern{
//     public static void main(String[]args){
//         int n = 4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||j==1||j==n||i==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
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
