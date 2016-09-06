
import java.util.Random;

public class QuickSortTest {
	static final Random random = new Random();
	static int[] nums = new int[50];
	public static void main(String[] args) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100);
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		quickSort(nums, 0, nums.length - 1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");   
		}
	}
	
	static void quickSort(int[] arr, int s, int e) {
		boolean flag = false;
		int compare = arr[s];
		int i = s, j = e;
		while (i < j) {
			if ((flag = !flag)) {
				while (i < j && arr[j] > compare) 
					j--;
				if (i == j) break;
				arr[i++] = arr[j] + (arr[j] = compare) * 0;
			} else {
				while (i < j && arr[i] <= compare) 
					i++;
				if (i == j) break;
				arr[j--] = arr[i] + (arr[i] = compare) * 0;
			}
		}
		if (s < --j)
			quickSort(arr, s, j);
		if (++i < e)
			quickSort(arr, i, e);
	}
}
