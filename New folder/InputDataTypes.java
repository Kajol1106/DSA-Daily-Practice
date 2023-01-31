import java.util.Scanner;
class Main{
  public static void main(String[] args){
    // write your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(num);
    double d=sc.nextDouble();
    System.out.println(d);
    String str=sc.next();
    System.out.println(str);
    int k=sc.nextInt();
     
    for(int i=0;i<k;i++){
        System.out.print(sc.next()+" ");
    }
    System.out.println();
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        System.out.print(sc.nextInt()+" ");
    }
  }
}
