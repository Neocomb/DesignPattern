package com.command;

public class TVReceiver extends Receiver {

	static final int MAX_PROGRAM_NUM = 100;
	
	boolean status = false;
	int programNum = 1;
	
	@Override
	public boolean open() {
		// TODO Auto-generated method stub
		if ( status == false ) {
			return status = true;
		}
		return false;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		if (status == true ) {
			status = false;
			return true;
		}
		return false;
	}

	@Override
	public boolean jump(int index) {
		// TODO Auto-generated method stub
		if (!status) {
			return false;
		}
		if (index > 0 && index < MAX_PROGRAM_NUM) {
			programNum = index;
			return true;
		}
		return false;
	}

	@Override
	public boolean change(int index) {
		// TODO Auto-generated method stub
		index = programNum+index;
		return jump(index);
	}
	
	public void show() {
		System.out.println("Tv is " + (status == true?"On":"Off") + ", The ProgramNumber is " + programNum);
	}

}
