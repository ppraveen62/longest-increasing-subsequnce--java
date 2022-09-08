package L4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LIS {
		
	static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
    
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }
       
 
    
        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
            	
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
 
       
        for (i = 0; i < n; i++) {
            if (max < lis[i]) {
                max = lis[i];
            }
        }
 
        return max;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the number of elements in list (number < 100) :");
		int i = sc.nextInt();
		int [] arrlist = new int[i];
		for(int m=0;m<i;m++) {
			System.out.print("Enter the element "+(m+1)+" :");
			int num =sc.nextInt();
			arrlist[m]=num;
		}
		System.out.println();
		System.out.println("your list with "+i+" elements :");
		System.out.println(Arrays.toString(arrlist));
		
		System.out.println("the longest increasing subsequence is "+lis(arrlist,i));
	
   
    }
    

}
