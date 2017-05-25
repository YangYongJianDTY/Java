package practice_04.exe1;

public class TestLinkedList {
	public static void main(String[] args)
	{
	    DuiLie  dl = new DuiLie();
	    dl.myAdd("java01");
	    dl.myAdd("java02");
	    dl.myAdd("java03");
	    dl.myAdd("java04");	

	    System.out.println("输出队列数据：");
	    while(!dl.isNull())
	    {
	        System.out.println(dl.myGet());
	    }

	    DuiZhan dz = new DuiZhan();
	    dz.myAdd("java01");
	    dz.myAdd("java02");
	    dz.myAdd("java03");
	    dz.myAdd("java04");	

	    System.out.println("输出堆栈数据：");
	    while(!dz.isNull())
	    {
	        System.out.println(dz.myGet());
	    }
	}

}
