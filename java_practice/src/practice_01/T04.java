package practice_01;

public class T04 { 
	 
	public static void main (String args[]) { 
		
		int startPosition = 0, endPosition = 0;
		char cStart = '��', cEnd = '��';
		startPosition = (int)cStart; //cStart��int��ת�������㣬���������ֵ��startPosition
		endPosition = (int)cEnd; //cEnd��int��ת�����㣬���������ֵ��endPosition
		System.out.println("ϣ����ĸ��");
		for(int i = startPosition; i <= endPosition; i++)
		{
			char c='\0';
			c = (char)i;//i��char��ת�����㣬���������ֵ��c
		    System.out.print(c + " ");//��һ�����һ���ַ�
			if(((int)c - startPosition + 1) % 10 == 0)//ÿ10���ַ���һ��
			System.out.println(""); 
		} 
	}
}