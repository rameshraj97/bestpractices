package com.chainsys.bestPractices.decoupled;

public class WoodenWheel implements Iwheel{
	public static String location;
	public void rotate()
	{
		System.out.println("Wooden Wheel Rotating");
	}
	public void stopRotate()
	{
		System.out.println("Wooden Wheel Stopped");
	}

}
