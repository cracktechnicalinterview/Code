package DesignPattern;

import java.util.ArrayList;

public class Channel implements Subject {
	
	private String channelName;
	private ArrayList<Observer> list=new ArrayList<Observer>();
	
	Channel(String channelName) {
		this.channelName=channelName;
	}

	@Override
	public void subscribe(Observer obs) {
		list.add(obs);
	}

	@Override
	public void unsubscribe(Observer obs) {
		list.remove(obs);
	}

	@Override
	public void notifyAllObserver(String message) {
		
		for(Observer obs: list) {
			obs.update(message);
		}
		
	}
	
	public void videoUpload(String message) {
		notifyAllObserver(message);
	}

	
}
