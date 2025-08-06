package lowLevelDesign.observerPattern.observer;

import lowLevelDesign.observerPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	String username;
	StockObservable observable;
	
	public MobileAlertObserverImpl(String username, StockObservable observable) {
		this.username = username;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMsgOnMobile(username, "Product is in stock. Hurry up!");
	}
	
	private void sendMsgOnMobile(String username, String msg) {
		System.out.println("Msg sent to: "+username);
	}

}
