public class BinarySearch {
	
	public int search(int[] arr, int n, int low, int high) {
		int mid = (low + high) / 2;

		if (arr[mid] == n) return mid;

		if (arr[mid] > n) search(arr, n, mid + 1, high);

		if (arr[mid] < n) search(arr, n, low, mid);
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		
		int res = search(arr, 4, 0, arr.length());
		System.out.println(res);
	}

}
