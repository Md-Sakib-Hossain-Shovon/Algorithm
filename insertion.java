 public class insertion{
	public static void main(String args[]){
		int[]arr1={2,9,5,4,3,10};
		int[]arr2=InSort(arr1);
		for(int i:arr2){
			System.out.println(i);
			System.out.println(" ");
		}
	}
	public static int[]InSort(int[]input){
		int temp;
		for(int i=1;i<input.length;i++){
			for(int j=i;j>0;j--){
				if(input[j]<input[j-1]){
				temp=input[j];
				input[j]=input[j-1];
				input[j-1]=temp;
			}
		}
	}
	return input;
}

}