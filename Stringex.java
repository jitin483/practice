//2D string
import java.util.Scanner;   
public class Stringex 
{   
public static void main(String args[])   
{   
int m, n;   
Scanner sc=new Scanner(System.in);   
System.out.println("Enter the number of rows: ");
m = sc.nextInt();   
System.out.println("Enter the number of columns: "); 
n = sc.nextInt();   
String array[][] = new String[m][n];   
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < m; i++){
    for (int j = 0; j < n; j++){
        array[i][j] = sc.next();
    }
    
}


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