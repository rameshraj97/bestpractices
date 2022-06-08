package com.chainsys.bestPractices.decoupled;
//Objects of this class can work with any engine, and with any wheel
//The car class is decoupled from petrolEngine class, and steelWheel class
public class Car {
  private Iengine engine; //Early bound with petrol engine
  private Iwheel[] wheels; //Early bound with wheel interface
  //The type of engine, and the type of wheel will be injected to the car class
  //At runtime using the constructors. This is called as constructor based 
  //dependency injection
  
  public Car(Iengine engine,Iwheel[] wheel) {
      this.engine = engine;
      this.wheels = wheel;
  }
  public void startCar() {
      engine.start();
      wheels[0].rotate();
      wheels[1].rotate();
      wheels[2].rotate();
      wheels[3].rotate();
  }
  public Iwheel[] getWheels()
  {
      return this.wheels;
  }
}