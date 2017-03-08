package com.ohdoking.designpattern.day2.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("?˜„?¬ ?ƒ?ƒœ : "+ temperature + "?„ ê·¸ë¦¬ê³?" + humidity + "% ?Šµ");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
	
}
