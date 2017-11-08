package com.dp.Observer;

public abstract class RemoteWriter extends Observer {
	protected Directory subject;

	public abstract void update();
}
