package lowLevelDesign.observerPattern;

import lowLevelDesign.observerPattern.observable.IphoneObservableImpl;
import lowLevelDesign.observerPattern.observable.StockObservable;
import lowLevelDesign.observerPattern.observer.EmailAlertObserverImpl;
import lowLevelDesign.observerPattern.observer.MobileAlertObserverImpl;
import lowLevelDesign.observerPattern.observer.NotificationAlertObserver;

public class Store {
	public static void main(String args[]) {
		
		StockObservable iphoneStockObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_Username", iphoneStockObservable);
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);
		System.out.println("Stock Left: "+iphoneStockObservable.getStockCount());
		
	}
}
 