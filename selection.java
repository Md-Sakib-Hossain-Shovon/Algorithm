public class selection{
	public static void main(String args[]){
		int[]arr1={2,6,3,4,5};
		int[]arr2=SelectionSort(arr1);
		for(int i:arr2){
			System.out.println(i);
			System.out.println(" ");
		}
	}
	public static int[]SelectionSort(int[]arr){
		for(int i=0;i<arr.length-1;i++){
			int index=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j]<arr[index])
					index=j;
				int min=arr[index];
				arr[index]=arr[i];
				arr[i]=min;
		}
		return arr;
	}
}