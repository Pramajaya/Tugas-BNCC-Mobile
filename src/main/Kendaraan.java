package main;

import java.util.Scanner;

abstract class Kendaraan {
	
	Scanner scan = new Scanner (System.in);
	
	String tipe, brand, name, license;
	int speed, gasCap, wheel;
	
	public Kendaraan(String tipe, String brand, String name, String license, int speed, int gasCap, int wheel) {
		this.tipe = tipe;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.speed = speed;
		this.gasCap = gasCap;
		this.wheel = wheel;
	}
	
	public Kendaraan() {
	}
	
	abstract void list();
	abstract void viewKend(int index);
	
}
