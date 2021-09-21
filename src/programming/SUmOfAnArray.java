package programming;

public class SUmOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20, 30, 40, 50,60};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);

	}

}
