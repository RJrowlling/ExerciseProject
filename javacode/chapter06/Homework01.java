/**
 * 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序,比如:[10，12，45,90]，添加23后,数组为[10，12，23，45，90]
 * @author  cjy
 * @version  1.0
 */
public class Homework01 {
	public static void main(String[] args) {
		int arr[] = {10, 12, 45, 90};

		System.out.println("原始的升序数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int a = 23;
		int arr1[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				arr1[i] = a;
				for (int j=i; j < arr.length; j++) {
					arr1[j+1] = arr[j];
				}
				break;
			} else {
				arr1[i] = arr[i];
			}
		}
		System.out.println("插值之后的升序数组：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
}