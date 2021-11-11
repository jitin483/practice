//Add all numbers till N Using Recursion ................... Series n = n+n-1+n-2+n-3......+1..OR Sum=n+Sum till n-1
//Approach Sum=Sum(n-1)
import java.util.Scanner;
public class SumAllNum{
     static int sum(int n){
        if(n==0){
            return 0;
        }
        int prev_sum=sum(n-1);
        return n+prev_sum;

    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sum(n);
System.out.println(sum(n));

sc.close();
    
}
}