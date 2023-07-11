
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,3,5,6,10};
		
System.out.println(peek(arr,arr.length));;
	}
	public static int peek(int[] arr,int n) {
		if(arr[0]>arr[1]) {
			return 0;
		}if(arr[n-1]>arr[n-2]) {
			return n-1;
		}
	int index=1;
	while(index<n-1) {
		if(arr[index]>arr[index-1] && arr[index]>arr[index+1]) {
			return index;
		}
		index++;
	}
	return -1;
	}

}
