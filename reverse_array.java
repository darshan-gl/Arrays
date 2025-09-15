import java.util.Arrays;

public class reverse_array {
	public static void main(String[] args) {
		int arr[]= {2,4,7,9,0,5,8};
		
		
		int low=0;
		int high=arr.length-1;
		
		while(low<high) 
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
		System.out.print(Arrays.toString(arr));
		
		
	}

}

