package lowLevelDesign.observerPattern.observer;

import lowLevelDesign.observerPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	
	String emailId;
	StockObservable observable;
	
	public EmailAlertObserverImpl(String emailId, StockObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail(emailId, "Product is in stock. Hurry up!");
	}
	
	private void sendMail(String email, String msg) {
		System.out.println("Mail sent to: "+emailId);
	}

}
