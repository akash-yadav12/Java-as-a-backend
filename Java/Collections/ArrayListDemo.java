import java.io.*;
import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {
		int n = 5;

		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++){
			arr.add(i);
    }
		System.out.println(arr);
  	arr.remove(3);
		System.out.println(arr);
	}
}
