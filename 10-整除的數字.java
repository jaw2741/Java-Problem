import java.util.*;  
   
public class Main {  
   
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);  
        int n = scn.nextInt(), n2,k,count = 0;  
        for (int i = 10000; i < 100000; i++) {  
            if (i % n == 0) {  
                n2 = i / n;  
                char arr1[] = String.valueOf(i).toCharArray(), arr2[] = String.valueOf(n2).toCharArray();  
                int arr[] = new int[10];  
                for (int j = 0; j < arr1.length; j++) {  
                    arr[arr1[j] - '0']++;  
                }  
                for (int j = 0; j < arr2.length; j++) {  
                    arr[arr2[j] - '0']++;  
                }  
                if(arr2.length==4)  
                    arr[0] = 1;  
                for (k = 0; k < 10; k++) {  
                    if (arr[k] != 1)  
                        break;  
                }  
                if (k == 10) {  
                    System.out.printf("%05d / %05d = %d\n", i, n2, n);  
                    count++;  
                }  
            }  
        }  
        if (count == 0)  
            System.out.printf("No solutions for %d.\n", n);  
    }  
}  