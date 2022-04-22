package arraylistassignment;

import java.util.ArrayList;

public class UserMainCode_Max_Admissions {
	public static Integer getYear(ArrayList<Integer> List) 
	{
		int i,maxyear=0,maxcount=0;
		for(i=0;i<List.size();i++)
		{
			int num=List.get(i);
			if(maxcount<num)
				maxcount=num;
			}
		maxyear=List.get((List.indexOf(maxcount))-1);
	

return maxyear;
}
}

