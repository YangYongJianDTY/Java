package practice_03.exe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestWorker {
	//用list集合存放员工信息
	List <Worker> worker = new ArrayList();
	/*
	 * 添加几条信息
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
	 * 列出所有员工姓名及其工资
	 */
	public void printInfo() {
		Iterator it = worker.iterator();
		while(it.hasNext()) {
			Worker w = (Worker) it.next();
			System.out.println("姓名:" + w.name + "; 工资：" + w.salary + ";");
		}
	}
	/*
	 * 输出Jack的工资，并将其工资改为1500元(通过changePay(int)方法修改)
	 */
	public void changePay(int salary) {
		for(Worker w : worker) {
			if(w.name == "Jack") {
				System.out.println("Jack的工资为：" + w.salary + ";");
				w.salary = salary;
				System.out.println("修改后的工资为：" + w.salary + ";");
			}
		}
	}
	/*
	 * 将所有工资低于2000元的员工的工资上涨20%(通过changePay(float)方法修改)
	 */
	public void changePay(float add) {
		for(Worker w : worker) {
			if(w.salary < 2000) {
				System.out.println(w.name + "的工资为：" + w.salary + ";");
				w.salary *= (1 + add);
				System.out.println("修改后的工资为：" + w.salary + ";");
			}
		}
	}
	/*
	 * 计算每个部门的平均工资
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
		System.out.println(branch + "部门的平均工资为：" + averM + ";");
	}
	/*
	 * 删除名叫“Tom”的员工信息
	 */
	public void remove(String name) {
		for (Iterator it = worker.iterator(); it.hasNext();) {
			Worker w = (Worker) it.next();
			String str = (String) w.name;
			if(str.equals(name)){
				it.remove();
			}
		}
		System.out.println("已成功删除员工：" + name + ";");
	}
	/*
	 * 测试函数
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
