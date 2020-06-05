public class SelectionSort{
	void sort(int arr[])
	{
		int n = arr.length;

		// Satu per satu batas bergerak dari subarray yang tidak disortir
		for (int i = 0; i < n-1; i++)
		{
			// Temukan elemen minimum dalam array yang tidak disortir
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Tukar elemen minimum yang ditemukan dengan yang pertama
			// elements
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// mencetak array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// pengujian kode yang ada di atas
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		ob.sort(arr);
		System.out.println("Sorting array");
		ob.printArray(arr);
	}
}
