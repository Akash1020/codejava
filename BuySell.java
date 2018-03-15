import java.util.*;

class BuySell
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);

System.out.println("Enter the size of the array");
int size=in.nextInt();

int arr[]=new int[size];

	for(int k=0;k<size;k++)
	{
	System.out.println("Enter the stock price at day"+k);
	arr[k]=in.nextInt();
	}

	int buyDay=0;
	int sellDay=0;

	int k=0;
	
	int m=k+1;
	int nextBuyDay=m;
	
	while(m<size)
	{	
	int big=arr[k];
	buyDay=k;

	int flag=0;

		while(m<size)
		{	
			if(arr[m]>big)
			{
			big=arr[m];
			sellDay=m;
			}
			else
			{
			nextBuyDay=m;
			flag=1;
			break;
			}
		m++;
		k++;
		}
		
	if(buyDay!=sellDay)
	System.out.println("buy at day "+buyDay+" and sell at day "+sellDay);
	if(flag==1)
	{
	k=nextBuyDay;
	m=k+1;	
	}
	

}//while		

}

}
