package com.sample.spring.tv3;

public class SonyTv implements Tv{

	@Override
	public void turnOn() {
		System.out.println("sony");
	}

	@Override
	public void turnOff() {
		System.out.println("sony");
	}

	@Override
	public void soundUp() {
		System.out.println("sony");
	}

	@Override
	public void SoundDown() {
		System.out.println("sony");
	}

}
