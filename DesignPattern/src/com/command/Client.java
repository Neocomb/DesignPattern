package com.command;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new TVReceiver();
		TVReceiver Tv = (TVReceiver)receiver;
		
		OnCommand on = new OnCommand(receiver);
		OffCommand off = new OffCommand(receiver);
		ChannelChangeCommand change = new ChannelChangeCommand(receiver);
		ChannelJumpCommand jump = new ChannelJumpCommand(receiver);
		
		Contorler contorler = new Contorler();
		contorler.setChange(change);
		contorler.setJump(jump);
		contorler.setOff(off);
		contorler.setOn(on);
		
		contorler.change(1);
		Tv.show();
		contorler.change(1);
		Tv.show();
		contorler.open();
		Tv.show();
		contorler.jump(19);
		Tv.show();
		contorler.jump(20);
		Tv.show();
		contorler.change(2);
		contorler.close();
		Tv.show();
	}
}
