package practice_01;

public class T09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 0, 2, 1};
		int m = 0;
		for(int i = 0; i < arr.length / 2; i++ ) {
			if(arr[i] == arr[arr.length - i - 1]) {
				m += 1;
			}
		}
		if(m == 2){
			System.out.println("相同");
		} else {
			System.out.println("不相同");	
		}
	}
}
