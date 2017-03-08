package com.ohdoking.designpattern.day2.innerobserver;

import java.util.Observable;
import java.util.Observer;

import com.ohdoking.designpattern.day2.observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("?˜„?¬ ?ƒ?ƒœ : "+ temperature + "?„ ê·¸ë¦¬ê³?" + humidity + "% ?Šµ");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
}
