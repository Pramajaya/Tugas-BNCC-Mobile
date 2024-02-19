package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner (System.in);
	
	ArrayList<Kendaraan> kenList = new ArrayList<>();
	
	private String tipe = " ", brand, name, license;
	private int speed, gasCap, wheel;
	private String tipeKen;
	private int enterSys;
	private String tipeMoto;
	private int helm;
	private int price;
	
	String type;
	int viewIn;
	int i;
	int index;

	private void Input() {
		
		Car car = new Car(tipe, brand, name, license, speed, gasCap, wheel, tipeKen, enterSys);
		Motorcycle moto = new Motorcycle(tipe, brand, name, license, speed, gasCap, wheel, tipeMoto, helm, price);
		
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
			switch (type) {
			case "Car":
				car.list();
				kenList.add(car);
				break;
			case "Motorcycle":
				moto.list();
				kenList.add(moto);
				break;
			}
		}while(!(type.equals("Car") || type.equals("Motorcycle")));
		
		
		
	}
	
	private void View() {
		
		for (i = 0; i < kenList.size(); i++) {
			System.out.println("No: " + (i+1));
			System.out.println("Type: " + kenList.get(i).tipe);
			System.out.println("Name: " + kenList.get(i).name);
		}
		
		do {
			System.out.println("Pick a Vehicle Number to Test Drive [Enter '0' to Exit]: ");
			viewIn = scan.nextInt(); scan.nextLine();
			index = viewIn - 1;
			if (index >= 0 && index < kenList.size()) {
                if (kenList.get(index) instanceof Car) {
                    Car selectedCar = (Car) kenList.get(index);
                    selectedCar.viewKend(index);
                    break;
                } else if (kenList.get(index) instanceof Motorcycle) {
                    Motorcycle selectedMoto = (Motorcycle) kenList.get(index);
                    selectedMoto.viewKend(index);
                    break;
                }
            }
		}while(index != 0);
		
	}
		
	
	
	
	public Main() {
		int input;
		boolean inValid;
		do {
			inValid = false;
			try {
				do {
					System.out.println("ChipiChapa Automotive");
					System.out.println("===============================");
					System.out.println("1. Input");
					System.out.println("2. View");
					System.out.print(">> ");
					input = scan.nextInt(); scan.nextLine();
					switch(input) {
					case 1:
						Input();
						break;
					case 2:
						View();
						break;
					}
				} while (input != 3);
			} catch (Exception e) {
				inValid = true;
				System.out.println("Input Error");
				scan.next();
			}
		}while(inValid);
	}

	public static void main(String[] args) {
		new Main();

	}

}
