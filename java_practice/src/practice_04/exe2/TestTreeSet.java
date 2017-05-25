package practice_04.exe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet {
	public List <String> list, list2;
	
	public TestTreeSet() {
		list = new ArrayList <String> ();
	}
	
	public void add() {
		String[] s = new String[] {"abc", "de", "gong", "De", "abc",
				"Foo", "gong"};
		list.addAll(Arrays.asList(s));
	}
	
	public static void main(String[] args) {
		TreeSet <String> ts = new TreeSet <String> (new Comparator <String> () {
			public int compare (String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		TestTreeSet tts = new TestTreeSet();
		tts.add();
		for(String l : tts.list) {
			if(!ts.contains(l)) {
				ts.add(l);
			}
		}
		System.out.println(ts);

	}

}
