package programming;

public class BubbleSort {
	int a[] = {30, 20, 10, 50,40};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort objB = new BubbleSort();
		for (int i = 0; i < objB.a.length; i++) {
			for (int j = i+1; j < objB.a.length; j++) {
				if (objB.a[i]>objB.a[j]) {                        //if (objB.a[i]<objB.a[j])  for descending order
					int temp = objB.a[i];
					objB.a[i] = objB.a[j];
					objB.a[j] = temp;
				}
			}
		}
		for (int i = 0; i < objB.a.length; i++) {
			System.out.print(objB.a[i]+" ");
		}

	}

}
