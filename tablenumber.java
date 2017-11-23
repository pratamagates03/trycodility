import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static void solution(int[] A, int K) {

		int c=0;
		if(K>A.length)K=A.length;
		for (int i = 0; i < A.length; i++) {
			int d=(Integer.valueOf(A[i]).toString().toCharArray()).length;
		    if(c<d) c=d;
		}
		
		int v = 0;
		int e = 0;
		
		if (A.length % K > 0) e = (A.length / K) + 1;
		else e = A.length / K;
		
		    
		for (int r = 0; r < e; r++) {
		
			for (int i = 0; i < K; i++) {
				System.out.print("+");
			    for (int j = 0; j < c; j++) {
			    	System.out.print("-");
				}
			}
			System.out.println("+");
			
			System.out.print("|");
			for (int m = 0; m < K; m++) {
				for (int n = c; n >= 1; n--) {
			    	if (v >= A.length) break;
			        if ((Integer.valueOf(A[v]).toString().toCharArray()).length == n) {
			        	System.out.print(A[v]);
			            n = n - (Integer.valueOf(A[v]).toString().toCharArray()).length;
			        }	        
			        else System.out.print(" ");       
			    }
			    if (v >= A.length) break;
			    System.out.print("|");
			    v++;
			}
			System.out.print("\n");
			if(r==e-1){
				if(A.length%K==0) K=K;
				else K=A.length%K;
				
				for (int i = 0; i < K; i++) {
					System.out.print("+");
				    for (int j = 0; j < c; j++) {
				    	System.out.print("-");
					}
				}
				System.out.println("+");
				
			}
		}
	    
	}
	public static void main(String[] args) {
	    // TODO code application logic here
	    int[] A = new int[10];
	    A[0] = 4;
	    A[1] = 35;
	    A[2] = 80;
	    A[3] = 123;
	    A[4] = 12345;
	    A[5] = 44;
	    A[6] = 8;
	    A[7] = 5;
	    A[8] = 24;
	    A[9] = 3;
	
	    int K = 11;
	    
	    solution(A,K);
	}
	
}
