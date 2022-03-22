import java.util.Arrays;
public class countingsort{
	public static void main(String args[]){
		System.out.println("Before Sorting:");
		int arr[]={20,30,10,40,50};
		System.out.println(Arrays.toString(arr));
		arr=countingSort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}
	static int[] countingSort(int arr[])
	{
		int n=arr.length;
		int result[]=new int[n];
		int count[]=new int[6];
		for(int i=0;i<6;++i)
			count[i]=0;
		for(int i=0;i<n;++i)
			++count[arr[i]];
		for(int i=1;i<=7;++i)
			count[i]+=count[i-1];
		for(int i=0;i<n;++i)
		{
			result[count[arr[i]]-1]=arr[i];
			--count[arr[i]];
		}
		return result;
	}
}