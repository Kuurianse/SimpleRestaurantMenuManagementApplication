package com.tutorial;

import java.util.Scanner;
import java.util.ArrayList;

abstract class MenuItem {
    String kodeMenu;
    String namaMenu;
    int harga;

    MenuItem(String kodeMenu, String namaMenu, int harga) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    abstract void display();

    String getter() {
        return this.kodeMenu;
    }
}

interface Discountable {
    int getDiscount();
}

class RegularMenu extends MenuItem {
    RegularMenu(String kodeMenu, String namaMenu, int harga) {
        super(kodeMenu, namaMenu, harga);
    }

    @Override
    void display() {
        System.out.printf("        %-7s   %-15s   %-7d\n", this.kodeMenu, this.namaMenu, this.harga);
    }
}

class SpecialMenu extends MenuItem implements Discountable {
    int discount;

    SpecialMenu(String kodeMenu, String namaMenu, int harga, int discount) {
        super(kodeMenu, namaMenu, harga);
        this.discount = discount;
    }

    @Override
    void display() {
        System.out.printf("        %-7s   %-15s   %-7d   %d%%\n", this.kodeMenu, this.namaMenu, this.harga,
                this.discount);
    }

    @Override
    public int getDiscount() {
        return this.discount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<RegularMenu> makananRegular = new ArrayList<>();
        ArrayList<SpecialMenu> makananSpesial = new ArrayList<>();

        int choice = 0;
        do {
            System.out.println("Family Restaurant");
            System.out.println("==========================");
            System.out.println("1. Add Regular Menu");
            System.out.println("2. Add Special Menu");
            System.out.println("3. Show All Menu");
            System.out.println("4. Delete Regular Menu");
            System.out.println("5. Delete Special Menu");
            System.out.println("6. Exit");
            System.out.print("Choice [1-6]: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
					System.out.println("\nAdd Regular Menu");
					System.out.println("========================");

					String kodeMenu;
					while(true){
						System.out.print("input menu kode [R...]: ");
                    	kodeMenu = input.next();
						if(kodeMenu.length() == 4 && kodeMenu.startsWith("R")){
							break;
						}
					}
					input.nextLine();

					String namaMenu;
					int namelenght;
					while (true) {
						System.out.print("input menu name [5-20]: ");
						namaMenu = input.nextLine();
						namelenght = namaMenu.length();
						if (namelenght >= 5 && namelenght <= 20) {
							break;
						}
					}

					int harga;
					while (true) {
						System.out.print("input menu price [10000 - 100000]: ");
						harga = input.nextInt();
						if (harga >= 10000 && harga <= 100000) {
							break;
						}
					}

					System.out.println("Add Success!");

					RegularMenu regular = new RegularMenu(kodeMenu, namaMenu, harga);
					makananRegular.add(regular);
					break;
					
                case 2:
					System.out.println("\nAdd Special Menu");
					System.out.println("========================");

					String kodeMenuSpecial;
					while(true){
						System.out.print("input menu kode [S...]: ");
                    	kodeMenuSpecial = input.next();
						if(kodeMenuSpecial.length() == 4 && kodeMenuSpecial.startsWith("S")){
							break;
						}
					}
					
					input.nextLine();
					String namaMenuSpecial;
					int namelenghtS;
					while (true) {
						System.out.print("input menu name [5-20]: ");
						namaMenuSpecial = input.nextLine();
						namelenghtS = namaMenuSpecial.length();
						if (namelenghtS >= 5 && namelenghtS <= 20) {
							break;
						}
					}
					
					int hargaSpecial;
					while (true) {
						System.out.print("input menu price [10000 - 100000]: ");
						hargaSpecial = input.nextInt();
						if (hargaSpecial >= 10000 && hargaSpecial <= 100000) {
							break;
						}
					}

					int discount;
					while (true) {
						System.out.print("input menu discount [10% | 25% | 50%]: ");
						discount = input.nextInt();
						if (discount == 10 || discount == 25 || discount == 50) {
							break;
						}
					}

					System.out.println("Add Success!");

					SpecialMenu special = new SpecialMenu(kodeMenuSpecial, namaMenuSpecial, hargaSpecial, discount);
					makananSpesial.add(special);
					break;

                case 3:
					// showAllMenu();
					System.out.println("\nReguler Menu");
					System.out.println("==============================================");
					System.out.println("No   |   Kode   |      nama      |   harga  |");
					System.out.println("==============================================");
					int r = 0;
					for(RegularMenu makanan:makananRegular){
						System.out.print(r+1);
						makanan.display();
						r++;
					}

					System.out.println("\nSpecial Menu");
					System.out.println("======================================================");
					System.out.println("No   |   Kode   |      nama      |   harga  | Diskon |");
					System.out.println("======================================================");
					int s = 0;
					for(SpecialMenu makanan:makananSpesial){
						System.out.print(s+1);
						makanan.display();
						s++;
					}
					System.out.println();

					break;

                case 4:
					System.out.println("\nDelete Reguler Menu");
					System.out.println("=============================");
					boolean flag1 = true;
					
					String delKodeMenuR;
					while(true){
						System.out.print("input menu kode [R...]: ");
						delKodeMenuR = input.next();
						if(delKodeMenuR.length() == 4 && delKodeMenuR.startsWith("R")){
							break;
						}
					}
					
					String tempR;
					int i = 0;
					for(RegularMenu makanan:makananRegular){
						tempR = makanan.getter();
						if(delKodeMenuR.equals(tempR)){
							makananRegular.remove(i);
							flag1 = false;
							break;
						}
						i++;
					}
					if (flag1 == true) {
						System.out.println("Code is Wrong");
					} else {
						System.out.println("Delete Success!");
					}
					System.out.println();
					break;

                case 5:
					System.out.println("\nDelete Special Menu");
					System.out.println("=============================");		
					boolean flag2 = true;
					String delKodeMenuS;
					while(true){
						System.out.print("input menu kode [S...]: ");
						delKodeMenuS = input.next();
						if(delKodeMenuS.length() == 4 && delKodeMenuS.startsWith("S")){
							break;
						}
					}

					String tempS;
					int j = 0;
					for(SpecialMenu makanan:makananSpesial){
						tempS = makanan.getter();
						if(delKodeMenuS.equals(tempS)){
							makananSpesial.remove(j);
							flag2 = false;
							break;
						}
						j++;
					}
					if (flag2 == true) {
						System.out.println("Code is Wrong");
					} else {
						System.out.println("Delete Success!");
					}
					System.out.println();

					break;

            }

        } while (choice != 6);
    }
}
