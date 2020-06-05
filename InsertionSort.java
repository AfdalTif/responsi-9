public class InsertionSort 
{ 
	/*Berfungsi untuk mengurutkan array menggunakan jenis penyisipan*/
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=1; i<n; ++i) 
		{ 
			int key = arr[i]; 
			int j = i-1; 

			/* Pindahkan elemen arr [0..i-1], yaitu
			lebih besar dari kunci, ke satu posisi di depan
			dari posisi mereka saat ini */
			while (j>=0 && arr[j] > key) 
			{ 
				arr[j+1] = arr[j]; 
				j = j-1; 
			} 
			arr[j+1] = key; 
		} 
	} 

	/* Fungsi utilitas untuk mencetak berbagai ukuran n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// menjalankan method 
	public static void main(String args[]) 
	{		 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 

		InsertionSort ob = new InsertionSort();		 
		ob.sort(arr); 
		
		printArray(arr); 
	} 
} 
