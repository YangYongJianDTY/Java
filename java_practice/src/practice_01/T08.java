package practice_01;

public class T08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1000;      //��ˮ����         
		int drinkNum = 0;      //�ȵ�����ˮ����         
		int emptyNum = 0;   //��ƿ�ӵ�����        
		while(num > 0){      //����ˮ���Ժ�             
			num--;    //�ȵ�һƿ             
			emptyNum++; //��ƿ����������1             
			drinkNum++;   //�ȵ�����ˮ��������1             
			if(emptyNum == 3) { //��3����ƿ�ӣ���ȥ��                 
				num++;   //��ˮ��������1                 
				emptyNum = 0;   //��ƿ����������             
				}         
			}         
		System.out.println("�ܹ��ȵ�ƿ����" + drinkNum);         
		System.out.println("ʣ���ƿ������" + emptyNum);
	}
}
