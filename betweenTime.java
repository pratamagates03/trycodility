import java.util.*;
import java.text.SimpleDateFormat;

public class Solution {
	public static void main(String[] args) 
    {
		String S="15:15:00";
		String T="15:15:02";
		System.out.print(solution(S,T));
    }
	
	public static int solution(String S, String T) {
		int tamp=0;
	    try {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        Date date1 = sdf.parse(S);
	        Date date2 = sdf.parse(T);
	        tamp=(int)Math.abs(date1.getTime()-date2.getTime())/1000;
	        
	    } catch (Exception ex) {
	    	ex.printStackTrace();
	    }
	    return tamp;
	}
}
