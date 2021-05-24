#include <stdio.h>
#include <stdlib.h>

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
	
 	for (int i = 0; i < size; i++) {
		for (int j = i + 1; j < size; j++) {
			if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
