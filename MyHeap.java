import java.util.*;
public class MyHeap {
  private static void pushDown(int[] data, int size, int index) {
    int var = data[index];
    while ((2 * index + 1 < size && var < data[2 * index + 1] ) || (2 * index + 2 < size && var < data[2* index + 2])) {
		  if (var < data[2 * index + 1]) {
			data[index] = data[2 * index + 1];
			data[2 * index + 1] = var;
			index = 2 * index + 1;
		  } else {
			data[index] = data[2 * index + 2];
			data[2 * index + 2] = var;
			index = 2 * index + 2;
		  }

    }
  }

  private static void pushUp(int[] data, int index) {
	while (((index + 1) / 2 - 1) >= 0  && data[(index + 1) / 2 - 1] < data[index]) {
		int temp = data[(index + 1) / 2 - 1];
		data[(index + 1) / 2 - 1] = data[index];
		data[index] = temp;
		index = (index + 1) / 2 - 1;
	}
  }

  public static void heapify(int[] data) {

  }

  public static void heapsort(int[] data) {

  }
  
  public static void main(String[] args) {
	  int[] temp = {4, 2, 6, 1, 1, 9};
	  pushUp(temp, 5);
	  System.out.println(Arrays.toString(temp));
	}
}
