class countingmoney{
public static void main(String args[]){
	double a[]={1,2,5,10,20,50,100,500,1000};
	double n,j,value,found=0;
	System.out.println("Enter Amount");
	for(double i=9;i>0;i--)
	{
		while(a[i]<value && value>0)
		{
			if(a[i]<value){
				found++;
				value=value-a[i];
			}
		}
	}
	System.out.println("found");
}
}