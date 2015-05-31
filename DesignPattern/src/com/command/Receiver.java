package com.command;

public abstract class Receiver {
	public abstract boolean open();
	public abstract boolean close();
	public abstract boolean change( int index );
	public abstract boolean jump( int index );
}
