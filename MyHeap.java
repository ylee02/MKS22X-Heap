import java.util.*;
public class MyHeap {
  private static void pushDown(int[] data, int size, int index) {
    int child = 2 * index + 1;
	while (child < size) {
		int l = data[child];
		int max = l;
		if (child + 1 < size) {
			int r = data[child + 1];
			//max = Math.max(r,l);
			if (r> l){
				max = r;
				child++;
			}
		}
		if (data[index] < max) {
			int temp = data[index];
			data[index] = data[child];
			data[child] = temp;
			index = child;
		}else return;
		child = index * 2 + 1;

    
	
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
	for (int i = data.length -1; i >= 0; i--) {
		System.out.println("a");
		pushDown(data, data.length,i);
	}
  }

  public static void heapsort(int[] data) {
	heapify(data);
	for (int i = data.length; i >1; i--) {
		System.out.println(Arrays.toString(data));
		int temp = data[0];
		data[0] = data[i -1];
		data[i-1] = temp;
		pushDown(data,i-1, 0);
		
		
	}
		
  }
  
  public static void main(String[] args) {
	  int[] temp = {7, 2, 3, 4, 6, 9};
	  heapsort(temp);
	  System.out.println(Arrays.toString(temp));
	}
}
