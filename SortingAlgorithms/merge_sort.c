#include <stdio.h>

void sort(int *arr, int a, int b) {
	
	if (a < b) {
		int mid = (a + b) / 2;

		sort(arr, a, m);
		sort(arr, m + 1, b);

		merge(arr, a, b);
	}

	return;
}

void merge(int *arr, int a, int b) {
	int *new_arr = malloc(sizeof(arr));
	
	int half_len = sizeof(arr) / 8;
	int full_len = half_len * 2;

	int c1 = 0;
	int c2 = half_len;

	for (int i = 0; i < sizeof(arr); i++) {
		if (c1 == half_len) {
			new_arr[i] = arr[c2++];
		} else if (c2 == full_len) {
			new_arr[i] = arr[c1++];
		} else {
			if (arr[c1] < arr[c2]) {
				new_arr[i] = arr[c1++];
			} else {
				new_arr[i] = arr[c2++];
			}
		}
	}
	
	arr = new_arr;
}

int main(int argc, char **argv) {
		
	int arr[8] = {2, 4, 8, 6, 3, 1, 5, 7};
	
	sort(arr, 0, 7);
}
