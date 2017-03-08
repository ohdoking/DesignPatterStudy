package com.ohdoking.designpattern.day2.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

//	?��??�? ?��?���? 갱신?�� 결과�? ?��
	public void measurementsChanged(){
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	//?��??버�? �?�?�? ?��?�� update 메서?���? ?��?��?��?�� ?��??버들?���? ?��?���? �??��?���? ?��?���?.
	@Override
	public void notifyObservers() {
		for(int i = 0 ; i < observers.size() ; i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
}
