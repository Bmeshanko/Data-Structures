#include <stdio.h>
#include <stdlib.h>

void merge(int arr[], int a, int m, int b);

void sort(int arr[], int a, int b) {
	if (a < b) {
		int m = (a + b) / 2;
        
		sort(arr, a, m);
		sort(arr, m + 1, b);
		
		merge(arr, a, m, b);
	}
}

void merge(int arr[], int a, int m, int b) {
	int n1 = (m - a) + 1;
	int n2 = b - m;

	int left[n1];
	int right[n2];

	for (int i = 0; i < n1; i++) {
		left[i] = arr[a + i];
	}

	for (int i = 0; i < n2; i++) {
		right[i] = arr[m + 1 + i];
	}

	int k = a;
	int c1 = 0;
	int c2 = 0;

	for (int i = 0; i < b - a + 1; i++) {
		if (c1 == n1) {
			arr[k++] = right[c2++];
		} else if (c2 == n2) {
			arr[k++] = left[c1++];
		} else {
			if (left[c1] < right[c2]) {
				arr[k++] = left[c1++];
			} else {
				arr[k++] = right[c2++];
			}
		}
	}
}

int main(int argc, char **argv) {
    	int size = 10;

	if (argc > 1)
		size = atoi(argv[1]);
	
	int arr[size];
	
	time_t t;
	srand((unsigned) time(&t));

	for (int i = 0; i < size; i++) {
		arr[i] = (rand() % size) + 1;
	}

	sort(arr, 0, size);
}

