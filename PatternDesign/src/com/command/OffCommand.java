package com.command;

public class OffCommand implements Command{
	private Receiver r = null;
	public OffCommand( Receiver r ) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public boolean excute( Object o) {
		// TODO Auto-generated method stub
		return r.close();
	}	
}
