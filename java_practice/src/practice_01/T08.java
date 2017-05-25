package practice_01;

public class T08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1000;      //汽水数量         
		int drinkNum = 0;      //喝掉的汽水数量         
		int emptyNum = 0;   //空瓶子的数量        
		while(num > 0){      //有汽水可以喝             
			num--;    //喝掉一瓶             
			emptyNum++; //空瓶子数量增加1             
			drinkNum++;   //喝掉的汽水数量增加1             
			if(emptyNum == 3) { //有3个空瓶子，则去换                 
				num++;   //汽水数量增加1                 
				emptyNum = 0;   //空瓶子数量清零             
				}         
			}         
		System.out.println("总共喝掉瓶数：" + drinkNum);         
		System.out.println("剩余空瓶子数：" + emptyNum);
	}
}
