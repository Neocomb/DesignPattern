package com.Memento;

import java.util.HashMap;

public class Caretaker {
	HashMap<String, MementoIF> hm = new HashMap<String, MementoIF>();
	
	public void addMem( String desc , MementoIF mem){
		hm.put(desc, mem);
	}
	
	public MementoIF	delMem( String desc ) {
		return hm.remove(desc);
	}
	
	public MementoIF getMem( String desc ) {
		return hm.get(desc);
	}
	
}
