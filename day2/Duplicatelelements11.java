package week5.day2;

public class Duplicatelelements11 
{
	
	public static void main(String[] args) 
	{
	int num11[] = {1,4,4,7,6,8};
	
	for(int i=0;i<num11.length;i++)
	{
		int count=0;
		for(int j=0;j<num11.length;j++)
		{
			if(num11[i]==num11[j])
			{
				count+=1;
			}
		}
		if(count==1)
		{
			System.out.print(num11[i] + " ");
		}
	}
	}
}
