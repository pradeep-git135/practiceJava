package programming;

public class MaxNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {30, 20, 10, 50, 40};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("maximum number in an array " + a[0]);
		System.out.println("minimum number in an array " + a[a.length-1]);
	}

}
