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
		int res=0;
		try {
		    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		    Date date1 = sdf.parse(S);
		    Date date2 = sdf.parse(T);
		    long diff = date2.getTime() - date1.getTime();
		    long diffSeconds = diff / 1000 % 60;
		
		    String[] result = new String[Integer.valueOf(((int) diffSeconds) + 2) - 1];
		    for (int i = 0; i < result.length; i++) {
		        if (i == 0) {
		            result[0] = S;
		        } else {
		            Date d1 = sdf.parse(result[0]);
		            Date d = new Date(d1.getTime() + ((i) * 1000));
		            result[i] = sdf.format(d);
		        }
		    }
		    
		    HashSet<Integer> set = new HashSet<Integer>();
		    for (int i = 0; i < result.length; i++) {
		        set = new HashSet<Integer>();
		        String str = result[i];
		        String[] strA = str.split(":");
		        for (int j = 0; j < strA.length; j++) {
		            String strD = strA[j];
		            char[] c = strD.toCharArray();
		            char c1 = c[0];
		            char c2 = c[1];
		            if (c1 == c2) {
		                set.add(Integer.valueOf(c1));
		            } else {
		                set.add(Integer.valueOf(c1));
		                set.add(Integer.valueOf(c2));
		            }
		        }
		        if(set.size() <= 2 ){
		            res++;
		        }
		    }
		     
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}
}
