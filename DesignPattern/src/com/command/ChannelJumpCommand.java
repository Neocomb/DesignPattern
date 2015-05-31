package com.command;

public class ChannelJumpCommand implements Command {
	private Receiver r = null;

	public ChannelJumpCommand(Receiver r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	@Override
	public boolean excute(Object o) {
		// TODO Auto-generated method stub
		return r.jump((Integer) o);
	}
}
