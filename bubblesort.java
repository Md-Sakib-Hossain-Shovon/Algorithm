import java.util.Scanner;
public class bubblesort{
	public static void main(String args[]){
		int n,i,d,swap;
		Scanner in=new Scanner(System.in);
		System.out.println("Input Number To Sort");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter"+n+"Numbers");
		for(i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(i=0;i<(n-1);i++){
			for(d=0;d<n-i;d++){
			if(arr[d]>arr[d+1]){
				swap=arr[d];
				arr[d]=arr[d+1];
				arr[d+1]=swap;
			}
			}
		}
		System.out.println("Sorted Numbers:");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}