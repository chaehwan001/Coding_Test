package ct.week01;

import java.util.Arrays;

/*
 * 배열 복사, 정렬
 */
public class EX14 {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = new int[5];
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2)); // 배열을 출력하는 함수
		
		int arr3[] = new int[10];
		arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr3));
		
		int arr4[] = new int[]{10, 5, 9, 4, 2, 8, 1};
		Arrays.sort(arr4, 2, 5); // 인덱스번호 2번부터 5번까지 정리
		System.out.println(Arrays.toString(arr4));
	}
}
