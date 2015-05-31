package com.command;

public class ChannelChangeCommand implements Command{
	private Receiver r = null;
	public ChannelChangeCommand( Receiver r ) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public boolean excute( Object o) {
		// TODO Auto-generated method stub
		return r.change((Integer)o);
	}	
}
