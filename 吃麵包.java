import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int k=0; k < n ;k++){
		int n1 = sc.nextInt(), n2 = sc.nextInt(), bread[]=new int [n1];
		for(int i = 0; i < n1; i++)
			bread[i]=sc.nextInt();
		for(int i = 0; i< n2; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			for(int j=x-1;j<y;j++)
				sum += bread[j];
			System.out.println(sum);
		                 
		} }
	}	
}