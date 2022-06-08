package com.chainsys.bestPractices.decoupled;

public class Bike {
	private Iengine engine;
	public Iengine getEngine() {
		return engine;
	}
	public void setEngine(Iengine engine) {
		this.engine = engine;
	}
	public void setWheels(Iwheel[] wheels) {
		this.wheels = wheels;
	}
	private Iwheel[] wheels;

//	public Bike(Iengine engine, Iwheel[] wheel) {
//		this.engine = engine;
//		this.wheels = wheel;
//		
//	}
	public void StartBike() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
	}
	public Iwheel[] getWheels() {
		return this.wheels;
	}
}