package arraylistassignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_Max_Admissions {
	public static void main(String args[]) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	ArrayList<Integer> List = new ArrayList<Integer>();
	for(int i=0;i<n*2;i++) 
	{
		List.add(Integer.parseInt(br.readLine()));
	}
	System.out.println(UserMainCode_Max_Admissions.getYear(List));
	}
}

