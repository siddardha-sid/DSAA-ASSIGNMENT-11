
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nearest(5));
	}
	public static int nearest(int x) {
		int low=1;int high=x;int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int sqrt=mid*mid;
			if(sqrt==x) {
				return sqrt;
			} else if(sqrt>x){
				high=mid-1;
			}else {
				low=mid+1;
				res=mid;
			}
		}
		return res;
	}

}
