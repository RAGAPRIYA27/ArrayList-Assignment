package arraylistassignment;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode_Sorting_Merging {
	public static ArrayList<Integer> answer (ArrayList<Integer> al1, ArrayList<Integer> al2)
	{
	al1.addAll(al2);
	Collections.sort(al1);
	ArrayList<Integer> ans=new ArrayList<Integer>();
	ans.add(al1.get(2));
	ans.add(al1.get(6));
	ans.add(al1.get(8));
	return ans;
	}
	}

