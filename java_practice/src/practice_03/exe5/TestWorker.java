package practice_03.exe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestWorker {
	//��list���ϴ��Ա����Ϣ
	List <Worker> worker = new ArrayList();
	/*
	 * ��Ӽ�����Ϣ
	 */
	public void add() {
		Worker [] workers = new Worker[] {
				new Worker(1001, "Tom", "Market", 1200),
				new Worker(1002, "Jack", "Department", 1300),
				new Worker(1003, "Simth", "Market", 2000),
				new Worker(1004, "Tony", "Department", 3000)
		};
		worker.addAll(Arrays.asList(workers));
	}
	/*
	 * �г�����Ա���������乤��
	 */
	public void printInfo() {
		Iterator it = worker.iterator();
		while(it.hasNext()) {
			Worker w = (Worker) it.next();
			System.out.println("����:" + w.name + "; ���ʣ�" + w.salary + ";");
		}
	}
	/*
	 * ���Jack�Ĺ��ʣ������乤�ʸ�Ϊ1500Ԫ(ͨ��changePay(int)�����޸�)
	 */
	public void changePay(int salary) {
		for(Worker w : worker) {
			if(w.name == "Jack") {
				System.out.println("Jack�Ĺ���Ϊ��" + w.salary + ";");
				w.salary = salary;
				System.out.println("�޸ĺ�Ĺ���Ϊ��" + w.salary + ";");
			}
		}
	}
	/*
	 * �����й��ʵ���2000Ԫ��Ա���Ĺ�������20%(ͨ��changePay(float)�����޸�)
	 */
	public void changePay(float add) {
		for(Worker w : worker) {
			if(w.salary < 2000) {
				System.out.println(w.name + "�Ĺ���Ϊ��" + w.salary + ";");
				w.salary *= (1 + add);
				System.out.println("�޸ĺ�Ĺ���Ϊ��" + w.salary + ";");
			}
		}
	}
	/*
	 * ����ÿ�����ŵ�ƽ������
	 */
	public void averagePay(String branch) {
		int total = 0, i = 0;
		for(Worker w : worker) {
			String str = (String) w.branch;
			//System.out.println(str.equals(branch));
			if(str.equals(branch)) {
				total += w.salary;
				i++;
			}
		}
		int averM = total / i;
		System.out.println(branch + "���ŵ�ƽ������Ϊ��" + averM + ";");
	}
	/*
	 * ɾ�����С�Tom����Ա����Ϣ
	 */
	public void remove(String name) {
		for (Iterator it = worker.iterator(); it.hasNext();) {
			Worker w = (Worker) it.next();
			String str = (String) w.name;
			if(str.equals(name)){
				it.remove();
			}
		}
		System.out.println("�ѳɹ�ɾ��Ա����" + name + ";");
	}
	/*
	 * ���Ժ���
	 */
	public static void main(String[] args) {
		TestWorker tw = new TestWorker();
		tw.add();
		tw.printInfo();
		tw.changePay(1500);
		tw.changePay((float) 0.20);
		tw.averagePay("Market");
		tw.averagePay("Department");
		tw.remove("Tom");
		tw.printInfo();
	}

}
