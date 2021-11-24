package com.percabangan;

import java.util.Scanner;

public class ContohPercabangan {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Menu Makanan");
		System.out.println("1. Makanan Betawi");
		System.out.println("2. Makanan Padang");
		System.out.println("3. Makanan Jawa");
		System.out.println("Pilih Menu Makanan : ");
		int menu = input.nextInt();
		
		switch (menu) {
		case 1: 
			System.out.println("Soto Betawi");
			break;
		case 2:
			System.out.println("Rendang");
			break;
		case 3:
			System.out.println("Mie Jawa");
			break;
		default:
			System.out.println("Menu tidak ada");
		}
		
		if (jam <= 10) {
			System.out.println("Selamat Pagi");
		} else if (jam <= 16) {
			System.out.println("Selamat Siang");
		} else if (jam <= 18){
			System.out.println("Selamat Sore");
		} else {
			System.out.println("Selamat Malam");
		}*/
		
		int nilai = 85;

		 

		switch(nilai){

		case 90:

		System.out.println("A");

		break;

		case 80:

		System.out.println("B");

		break;

		case 70:

		System.out.println("C");

		break;

		default:

		System.out.println("Nilai salah");

		
		
		ContohPercabangan main = new ContohPercabangan();
		//main.cekPajak(); 
		//main.cekpajak();
		//main.hitungBidang();

	}
	/*public void cekPajak() {
		String jenisKelamin ="Wanita";
		boolean menikah = false;
		int pajak = 0;
		
		if(jenisKelamin.equalsIgnoreCase("Pria")){
			if(menikah) {
				pajak = 5;
			}else {
				pajak = 10;
			}
		}else if (jenisKelamin.equalsIgnoreCase("Wanita")) {
			if(menikah) {
				pajak = 4;
			}else {
				pajak = 11;
			}
		}else {
			pajak = 10;
		}
		
		System.out.println("Pajak anda adalah : "+ pajak + " %");
		String jenisKelamin ="Pria";
		boolean menikah = false;
		int pajak = 0;
		
		if(jenisKelamin.equalsIgnoreCase(jenisKelamin)){
			if(menikah) {
				pajak = 5;
			}else {
				pajak = 10;
			}
		}else {
			if(menikah) {
				pajak = 4;
			}else {
				pajak = 11;
			}
		}
		
		System.out.println("Pajak anda adalah : "+ pajak + " %");
		
	}
	public void cekpajak() {
		String jenisKelamin ="male";
		boolean menikah = false;
		int pajak = 0;
		
		switch (jenisKelamin) {
		case "male": 
		case "female":
		case "intersex":
		case "trans":	
			if(menikah) {
				pajak = 5;
			}else {
				pajak = 10;
			}
		break;
		case "non_conforming": 
		case "personal":
		case "eunuch":	
			
				pajak = 10;
		
		break;
		
		default:
				pajak = 9;
		 break;
		}
		System.out.println("Pajak anda adalah : "+ pajak + " %");
	}
	public void hitungBidang() {
		
		int PERSEGI_PANJANG = 1;
		int SEGITIGA = 2;
		
		int LUAS = 1;
		int KELILING = 2;
		
		int panjang;
		int lebar;
		int bentuk_bidang;
		int jenisHitungan;
		
		Scanner scan = new Scanner(System.in);;
		System.out.println("Pilih Bentuk Bidang\r\n"+ "1. Persegi Panjang\r\n" +"2. Segitiga\r\n"+
				"\r\n"+"\r\n"+"Pilih (1-2) :");
		bentuk_bidang = scan.nextInt();
		System.out.println("Pilih Hitungan yang akan diterapkan\r\n"+"\r\n"+ "1. Luas\r\n" +"2. Keliling\r\n"+
				"\r\n"+"\r\n"+"Pilih (1-2) :");
		
		jenisHitungan = scan.nextInt();
		
		if (bentuk_bidang == PERSEGI_PANJANG) {
			if (jenisHitungan ==  LUAS) {
				System.out.println("Masukan panjang : ");
				panjang = scan.nextInt();
				System.out.println("Masukan Lebar : ");
				lebar = scan.nextInt();
				
				int luas = panjang * lebar;
				System.out.println("Luasnya adalah : "+ luas);
			} else if (jenisHitungan == KELILING) {
				System.out.println("Masukan panjang sisi: ");
				panjang = scan.nextInt();
				int keliling =  panjang *4;
				System.out.println("Kelilingnya adalah : "+ keliling);
			}
		} else if (bentuk_bidang == SEGITIGA) {
			if (jenisHitungan ==  LUAS) {
				System.out.println("Masukan alas : ");
				panjang = scan.nextInt();
				System.out.println("Masukan tinggi : ");
				lebar = scan.nextInt();
				
				double luas = (0.5 *(panjang * lebar));
				System.out.println("Luasnya adalah : "+ luas);
			}else if (jenisHitungan == KELILING) {
				System.out.println("Masukan panjang sisi: ");
				panjang = scan.nextInt();
				int keliling =  panjang *3;
				System.out.println("Kelilingnya adalah : "+ keliling);
			}
		}*/
		
	}
}
