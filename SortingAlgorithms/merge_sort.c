#include <stdio.h>
#include <stdlib.h>

void merge(int *arr, int a, int b);

void sort(int *arr, int a, int b) {
	
	if (a < b) {
		int m = (a + b) / 2;

		sort(arr, a, m);
		sort(arr, m + 1, b);

		merge(arr, a, b);
	}

	return;
}

void merge(int *arr, int a, int b) {
	int *new_arr = malloc(sizeof(arr));

	int c1 = a;
	int c2 = (a + b) / 2;

	for (int i = a; i < b; i++) {
        printf("%d ", arr[i]);
		if (c1 == (a + b) / 2) {
			new_arr[i] = arr[c2++];
		} else if (c2 == a + b) {
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
	
	printf("%d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]);

	sort(arr, 0, 7);

	printf("%d %d %d %d", arr[0], arr[1], arr[2], arr[3]);
}

