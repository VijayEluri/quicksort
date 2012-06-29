import java.util.Random;

public class quicksort {
	int[] data;
	int size;

	public quicksort(int[] data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	int Partition(int i, int j) {
		Random random = new Random();
		int s = random.nextInt(j) % (j - i + 1) + i;
		int pivot = data[s];
		int p = i, q = j;
		while (i < j) {
			while (data[j] > pivot)
				j--;

			while (data[i] < pivot)
				i++;
			if (i < j) {
				swap(i, j);
				// if (data[i] == pivot) {
				// swap(i, ++p);
				// }
			}
			// if (data[j] == pivot) {
			// swap(j, --q);
			// }
			i = p;
		}
		return i;
	}

	void Sort() {
		Sort(0, data.length - 1);
	}

	void Sort(int low, int high) {
		if (low < high) {
			int pivot;
			pivot = Partition(low, high);
			Sort(low, pivot - 1);
			Sort(pivot + 1, high);
		}
	}

	void swap(int i, int j) {
		data[i] ^= data[j];
		data[j] ^= data[i];
		data[i] ^= data[j];
	}

	public String toString() {
		String result = new String();
		for (int i = 0; i < data.length; i++) {
			result += Integer.toString(data[i]) + ",";
		}
		return result;
	}
}
