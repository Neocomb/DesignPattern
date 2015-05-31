package com.Memento;

public class Originator {
	private String state;

	String getState() {
		return state;
	}

	void setState(String state) {
		this.state = state;
	}
	
	public MementoIF createMem() {
		return new Memento(state);
	}
	
	public boolean restoreMem(MementoIF mem) {
		setState( ( (Memento)mem).getMemState()  );
		return true;
	}
	
	private class Memento implements MementoIF{
		private String memState;

		public Memento( String state ) {
			// TODO Auto-generated constructor stub
			memState = state;
		}
		
		private String getMemState() {
			return memState;
		}

//		private void setMemState(String memState) {
//			this.memState = memState;
//		}
	}

	@Override
	public String toString() {
		return "Originator [state=" + state + "]";
	}
	
}
