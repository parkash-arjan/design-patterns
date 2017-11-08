package com.dp.Observer;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Subject {
	private List<RemoteWriter> observers = new ArrayList<RemoteWriter>();
	private int numberOfFiles;

	public int getState() {
		return numberOfFiles;
	}

	public void setState(int state) {
		this.numberOfFiles = state;
		notifyAllObservers();
	}

	public void attach(RemoteWriter observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (RemoteWriter observer : observers) {
			observer.update();
		}
	}
}
