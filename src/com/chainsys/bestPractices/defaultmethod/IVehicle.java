package com.chainsys.bestPractices.defaultmethod;

public interface IVehicle { void start(); default void move(){
System.out.println("vehicle is moving");
}
}
class Car implements IVehicle
{
@Override
public void start() {
System.out.println("car is starting");
}
}
class Bike implements IVehicle
{
@Override
public void start() {
System.out.println("bike is starting");
}
}