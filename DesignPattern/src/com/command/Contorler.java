package com.command;

public class Contorler {
	
	private Command on;
	private Command off;
	private Command change;
	private Command jump;
	
	public Contorler() {
	}

	Command getOn() {
		return on;
	}

	void setOn(Command on) {
		this.on = on;
	}

	Command getOff() {
		return off;
	}

	void setOff(Command off) {
		this.off = off;
	}

	Command getChange() {
		return change;
	}

	void setChange(Command change) {
		this.change = change;
	}
	

	Command getJump() {
		return jump;
	}

	void setJump(Command jump) {
		this.jump = jump;
	}
	
	public boolean open() {
		return on.excute(null);
	}

	public boolean close() {
		return off.excute(null);
	}

	public boolean jump(int index) {
		return jump.excute(index);
	}

	public boolean change(int index) {
		return change.excute(index);
	}


}
