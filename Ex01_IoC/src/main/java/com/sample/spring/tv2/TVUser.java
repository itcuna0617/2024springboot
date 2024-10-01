package com.sample.spring.tv2;

public class TVUser {

	public static void main(String[] args) {
//		LgTv tv = new LgTv();
		Tv tv = new SamsungTv();
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.SoundDown();
	}

}
