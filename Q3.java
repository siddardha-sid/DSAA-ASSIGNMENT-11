
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {0,1,2,4,5,6,7};
System.out.println(findMissingInRange(arr)); ;
	}
	public static int findMissingInRange(int[] arr) {
		int n=arr.length;
		int sumOfRange=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sumOfRange-sum;
	}

}
