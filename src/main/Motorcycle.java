package main;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Motorcycle extends Kendaraan {
	
	ArrayList<String> tipeList = new ArrayList<>();
	ArrayList<String> brandList = new ArrayList<>();
	ArrayList<String> nameList = new ArrayList<>();
	ArrayList<String> licenseList = new ArrayList<>();
	ArrayList<Integer> speedList = new ArrayList<>();
	ArrayList<Integer> gasCapList = new ArrayList<>();
	ArrayList<Integer> wheelList = new ArrayList<>();
	ArrayList<String> tipeMotoList = new ArrayList<>();
	ArrayList<Integer> helmList = new ArrayList<>();
	ArrayList<Integer> priceList = new ArrayList<>();
	
	
	private String tipeMoto;
	private int helm;
	private int price;
	
	public Motorcycle(String tipe, String brand, String name, String license, int speed, int gasCap, int wheel, String tipeMoto,
			int helm, int price) {
		super(tipe, brand, name, license, speed, gasCap, wheel);
		this.tipeMoto = tipeMoto;
		this.helm = helm;
	}
	
	public Motorcycle() {
	}
	
	public void list() {
		
		tipe = "Motorcycle";
		
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
			System.out.print("Input Wheel [2 <= wheel <=3]: ");
			wheel = scan.nextInt(); scan.nextLine();
		} while (!(wheel <= 3 && wheel >= 2));
		
		do {
			System.out.print("Input Type [Automatic | Manual]: ");
			tipeMoto = scan.nextLine();
		} while (!(tipeMoto.equals("Automatic") || tipeMoto.equals("Manual")));
		
		do {
			System.out.print("Input Helmet Amount [>=1]: ");
			helm = scan.nextInt(); scan.nextLine();
		} while (!(helm >= 1));
		
		System.out.println("ENTER to return");
		
		tipeList.add(tipe);
		brandList.add(brand);
		nameList.add(name);
		licenseList.add(license);
		speedList.add(speed);
		gasCapList.add(gasCap);
		wheelList.add(wheel);
		tipeMotoList.add(tipeMoto);
		helmList.add(helm);
		priceList.add(price);
	}
	
	public void viewKend(int index) {
		
		if(index >= 0 && index < tipeList.size()) {
			System.out.println("Brand: " + brandList.get(index));
			System.out.println("Name: " + nameList.get(index));
			System.out.println("License Plate: " + licenseList.get(index));
			System.out.println("Type: " + tipeMotoList.get(index));
			System.out.println("Gas Capacity: " + gasCapList.get(index));
			System.out.println("Top Speed: " + speedList.get(index));
			System.out.println("Wheel(s): " + wheelList.get(index));
			System.out.println("Helmet: " + helmList.get(index));
			System.out.println(nameList.get(index) + " is Standing!");
			
			do {
				System.out.println("Input Helm Price: ");
				price = scan.nextInt(); scan.nextLine();
			}while(!(price > 0));
			
			System.out.println("Price: " + price);
		}
		
		
		
	}

}
