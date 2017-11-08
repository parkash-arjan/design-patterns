package com.dp.Observer;

public class Driver {

	public static void main(String[] args) {

		Directory directory = new Directory();

		new RemoteWriterObserver(directory);

		directory.setState(10);
		directory.setState(20);
	}
}
