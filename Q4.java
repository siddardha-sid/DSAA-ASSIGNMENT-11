import java.util.HashSet;
import java.util.Set;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,3,4,2};
System.out.println(findRepeated(arr)); ;
	}
	public static int findRepeated(int[] arr) {
		Set<Integer> s=new HashSet<>();
		for(int i : arr) {
			if(!s.add(i)) {
				return i;
			}
		}
		return -1;
	}

}
