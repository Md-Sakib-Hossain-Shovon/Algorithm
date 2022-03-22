
public class linearsearch{
	public static void main(String args[]){
		int[]n={10,20,30,40,50,60};
		int flag=50;
		System.out.println(flag+"is found at index:"+linsearch(n,flag));
	}
	public static int linsearch(int[]arr,int flag){
		for(int i=0;i<arr.length;i++){


			if(arr[i]==flag){
				return i;
			}
		}
		return -1;
	}
}