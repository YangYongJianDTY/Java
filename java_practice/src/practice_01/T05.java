package practice_01;

public class T05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sName = "������";
        String strHex;//���ڴ��ÿ���ֵ�Unicode����
        String  strRes="";  //�������Ӹ����룬��������
        for(int i = 0; i < sName.length(); i++ )//����������ַ��ĸ���
        {
        	char c = sName.charAt(i);   //��������еĵ����ַ���
        	int intAsc = (int)c;  //���ַ�ת��int��
        	if(intAsc > 128)
        	{
        	    strHex = Integer.toHexString(intAsc);  //ͨ��Integer��toHexString���������ַ�ת��Unicode����
        	    strRes += "&#x" + strHex + ";";  //����������������
        	}
        	else
        	{
        		strRes += c;
        	}
        }        
        System.out.println(strRes);//�������&#x59da;&#x660e;

	}

}
