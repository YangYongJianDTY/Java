package practice_04.exe1;

import java.util.LinkedList;

public class DuiLie {
	LinkedList <String> link = new LinkedList <String> ();
	
	public void myAdd(String s) {
		this.link.addFirst(s);
	}
	
	public String myGet() {
		return this.link.removeLast();
	}

	public boolean isNull() {
		if(link.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
