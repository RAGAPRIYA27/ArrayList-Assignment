package arraylistassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Sorting_Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		al1.add(sc.nextInt());
		for(int j=0;j<5;j++)
		al2.add(sc.nextInt());
		ans=UserMainCode_Sorting_Merging .answer(al1,al2);
		//System.out.println(ans);
		for(int k=0;k<3;k++)
		System.out.println(ans.get(k));
		}
		
	}


