
//Insertion
//Linear Search
import java.util.*;
public class InsertionSort {    
   public static void main(String args[]){ 
   
       Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
       for (int j = 1; j < n; j++) {  
           int current = array[j];  
           int i = j-1;  
           while ( (i > -1) && ( array [i] > current ) ) {  
               array [i+1] = array [i];  
               i--;  
           }  
           array[i+1] = current;  
       }  
    for(int i=0;i<n;i++){
        System.out.print(" "+array[i]); 
           }  
      
        
    
      sc.close();
          
}
}