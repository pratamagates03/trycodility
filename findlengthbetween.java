import java.util.Scanner;

public class Solution {
	public static void main(String[] args) 
    {
		int[] A=new int[5];
		A[0]=7;
		A[1]=5;
		A[2]=6;
		A[3]=8;
		A[4]=5;
		
		System.out.print(solution(A));
    }
	
	public static int solution(int[] A){
		int c=0;
		for(int i=0;i<A.length;i++){
			int b=0;
			for(int j=i+1;j<A.length;j++){
				b++;
				System.out.print(b);
				if(A[i]==A[j]) {c=b;break;}
			}
			if(c>0) break;
		}
		return c+1;
	}
}
