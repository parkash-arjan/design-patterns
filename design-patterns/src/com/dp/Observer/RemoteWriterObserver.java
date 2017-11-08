package com.dp.Observer;

public class RemoteWriterObserver extends RemoteWriter {

	public RemoteWriterObserver(Directory directory) {
		this.subject = directory;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( subject.getState() );
	}
}
