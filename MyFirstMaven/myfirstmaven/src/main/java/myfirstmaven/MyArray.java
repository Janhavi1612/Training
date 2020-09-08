package myfirstmaven;

public class MyArray {
	private String[] arr;

	public MyArray(String[] arr) {
		this.arr = arr;
	}

	public String getStringAt(int i) {
		return arr[i];
	}
}
