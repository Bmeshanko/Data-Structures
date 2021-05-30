public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = new int[15];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (21 * Math.random());
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n------------------------------");
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
