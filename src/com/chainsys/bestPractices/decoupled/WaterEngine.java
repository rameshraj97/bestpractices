package com.chainsys.bestPractices.decoupled;

public class WaterEngine implements Iengine {
	
	public void start()
	{
		System.out.println("Water engine started");
	}
	public void stop()
	{
		System.out.println("Water engine Stopped");
	}

}