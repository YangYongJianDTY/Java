package practice_01;

public class T07 {

	public static void main(String[] args) {
		int x, y, z;  
		 for (x = 0; x <= 20; x++)  
		 {  
			 for (y = 0; y <= 33; y++)  
			 {  
				 z = 100 - x - y;
				 if (3 * y + 5 * x + z / 3 == 100)  			   
					 System.out.println("公鸡：" + x + "只； 母鸡：" + y + "只； 小鸡：" + z + "只"); 
			   
			 }  
		 }
	}

}
