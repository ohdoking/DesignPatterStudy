package com.ohdoking.designpattern.day2.innerobserver;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

//	?΅??λ²? ?€?κ²? κ°±μ ? κ²°κ³Όλ₯? ?
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
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
