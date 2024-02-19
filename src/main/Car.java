package main;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Kendaraan {
	
	ArrayList<String> tipeList = new ArrayList<>();
	ArrayList<String> brandList = new ArrayList<>();
	ArrayList<String> nameList = new ArrayList<>();
	ArrayList<String> licenseList = new ArrayList<>();
	ArrayList<Integer> speedList = new ArrayList<>();
	ArrayList<Integer> gasCapList = new ArrayList<>();
	ArrayList<Integer> wheelList = new ArrayList<>();
	ArrayList<String> tipeKenList = new ArrayList<>();
	ArrayList<Integer> enterSysList = new ArrayList<>();
	
	private String tipeKen;
	private int enterSys;
	
	public Car(String tipe, String brand, String name, String license, int speed, int gasCap, int wheel, String tipeKen, int enterSys) {
		super(tipe, brand, name, license, speed, gasCap, wheel);
		this.tipeKen = tipeKen;
		this.enterSys = enterSys;
	}
	
	public ArrayList<String> getTipeList() {
	    return tipeList;
	}
	
	public void list() {
		tipe = "Car";
		
		do {
			System.out.print("Input Brand [>=5]: ");
			brand = scan.nextLine();
		}while(!(brand.length() >= 5));
		
		do {
			System.out.print("Input Name [>=5]: ");
			name = scan.nextLine();
		}while(!(name.length() >= 5));
		
		do {
			System.out.print("Input License Number: ");
			Pattern pattern = Pattern.compile("[A-Z]{1}\s[0-9]{1,4}\s[A-Z]{1,3}");
			license = scan.nextLine();
			Matcher matcher = pattern.matcher(license);
			
			if(matcher.matches()) {
				break;
			}
			
		}while(true);
		
		do {
			System.out.print("Input Top Speed [100 <= speed <= 250]: ");
			speed = scan.nextInt(); scan.nextLine();
		} while (!(speed <= 250 && speed >=100));
		
		do {
			System.out.print("Input Gas Capacity [30 <= gasCap <= 60]:");
			gasCap = scan.nextInt(); scan.nextLine();
		}while(!(gasCap <= 60 && gasCap >= 30));
		
		do {
			System.out.print("Input Wheel [4 <= wheel <=6]: ");
			wheel = scan.nextInt(); scan.nextLine();
		} while (!(wheel <= 6 && wheel >= 4));
		
		do {
			System.out.print("Input Type [SUV | Supercar | Minivan]: ");
			tipeKen = scan.nextLine();
		} while (!(tipeKen.equals("SUV") || tipeKen.equals("Supercar") || tipeKen.equals("Minivan")));
		
		do {
			System.out.print("Input Entertainment System Amount [>=1]: ");
			enterSys = scan.nextInt(); scan.nextLine();
			
		} while (!(enterSys >= 1));
		
		System.out.println("ENTER to return");
		
		tipeList.add(tipe);
		brandList.add(brand);
		nameList.add(name);
		licenseList.add(license);
		speedList.add(speed);
		gasCapList.add(gasCap);
		wheelList.add(wheel);
		tipeKenList.add(tipeKen);
		enterSysList.add(enterSys);
		
		
	}
	
	public void viewKend(int index) {
		
		if (index >= 0 && index < tipeList.size()) {
			System.out.println("Brand: " + tipeList.get(index));
			System.out.println("Name: " + nameList.get(index));
			System.out.println("License Plate: " + licenseList.get(index));
			System.out.println("Type: " + tipeKenList.get(index));
			System.out.println("Gas Capacity: " + gasCapList.get(index));
			System.out.println("Top Speed: " + speedList.get(index));
			System.out.println("Wheel(s): " + wheelList.get(index));
			System.out.println("Entertainement System: " + enterSysList.get(index));
			System.out.println("Turning On Entertainment System...");
			if(tipeKenList.get(index).contains("Supercar")) {
				System.out.println("Boosting!");
			}else {
				System.out.println(" ");
			}
		}
		
		
	}

}
