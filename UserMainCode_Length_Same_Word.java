package arraylistassignment;

import java.util.StringTokenizer;

public class UserMainCode_Length_Same_Word {
	public static int empdis(String s)
	 {
		 int r;
		 String s1=" ";
		 StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
		 s=stringTokenizer.nextToken();
		 while (stringTokenizer.hasMoreTokens())
		 {
			 s1 = stringTokenizer.nextToken();
		 }
		 if (s1.equals(s))
			 r = s1.length();
		 else 
			 r = s1.length()+ s.length();
		 return r;
	 }
	}

