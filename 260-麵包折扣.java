import java.util.*;  
   
public class Main {  
      
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);  
    int a = sc.nextInt();  
    int b = sc.nextInt();  
    int c = sc.nextInt();  
    int d = sc.nextInt();  
    int e = sc.nextInt();  
    double cake,size,pineapple,naisu,toast;  
    double m=0;  
    double t;  
      
    if(b==8){  
        m=500;  
    }  
    else if(b==10){  
        m=600;  
    }  
    else if(b==12){  
        m=700;  
    }  
      
    cake=a*m;  
    pineapple=c*15;  
    naisu=d*20;  
    toast=e*40;  
      
    if(a>=3){  
    cake=0.9*cake;  
    }  
    if(c>=3){  
    pineapple=0.9*pineapple;  
    }  
    if(d>=3){  
    naisu=0.9*naisu;  
    }  
    if(e>=3){  
    toast=0.9*toast;  
    }  
      
    t=cake+pineapple+naisu+toast;  
    if(t>=1000){  
        t=t*0.9;  
    }  
   
        System.out.println((int)+(t+0.5));  
    }  
}  
