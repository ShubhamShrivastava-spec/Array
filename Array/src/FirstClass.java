import java.util.*;
public class FirstClass {
	public static void main(String args[]){
	
	int arr[]=new int[3];
	arr[0]=2;
	arr[1]=2;
	arr[2]=1;
	
	ArrayList<Integer>arrlst=new ArrayList();
	
	
	for(int i=0;i<arr.length;i++)
	{
		int j=0;
		
		for(j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j]&&j!=i)
				break;
		}
		System.out.println("Value of J is :"+j);
		if(j==arr.length)
			arrlst.add(arr[i]);
	   	
			
	}
	for(int i : arrlst)
	System.out.println("Value of aaraylist"+i);
	

}
}
