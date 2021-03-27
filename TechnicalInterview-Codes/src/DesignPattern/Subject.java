package DesignPattern;

public interface Subject {
	public void subscribe(Observer obs);
	public void unsubscribe(Observer obs);
	public void notifyAllObserver(String message);
}
