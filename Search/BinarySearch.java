public class BinarySearch {
	
	public static int search(int[] arr, int n, int low, int high) {
		int mid = (low + high) / 2;

		if (arr[mid] == n) return mid;

		if (arr[mid] < n) return search(arr, n, mid + 1, high);

		if (arr[mid] > n) return search(arr, n, low, mid - 1);

		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		
		int res = search(arr, 4, 0, arr.length - 1);
		System.out.println(res);
	}

}
