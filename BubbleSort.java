//Bubble Sort

import java.util.Scanner;
public class BubbleSort {  
    static void bubbleSort(int[] arr,int n) {  
         
         
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                               int temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp; 
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
                int arr[] =new int[n];  
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < n; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr,n);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < n; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   sc.close();
        }  
}  