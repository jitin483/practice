
//2D Array
import java.util.Scanner;   
public class Twodarray {   
public static void main(String[] args)   
{   
int m, n;   
Scanner sc=new Scanner(System.in);   
System.out.println("Enter the number of rows: ");
m = sc.nextInt();   
System.out.println("Enter the number of columns: "); 
n = sc.nextInt();   
int array[][] = new int[m][n];   
System.out.println("Enter the elements of the array: ");


for (int i = 0; i < m; i++){
    for (int j = 0; j < n; j++){
        array[i][j] = sc.nextInt();
    }
    
}

System.out.println("Elements of the 2D array is: ");
for (int i = 0; i < m; i++)   
{   
for (int j = 0; j < n; j++){
    System.out.print(array[i][j] + " "); 
}
System.out.println();   
}
sc.close();
}   
}    

