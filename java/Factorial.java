import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("n=?");
        int n=sc.nextInt();
        System.out.println("Factorial of "+ n +" is " + fact(n));
        sc.close();
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
             f*=i;
        }
        return f;
    }
    
}