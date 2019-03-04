package se.lexicon.F_JDBC;

import java.util.Scanner;

public class create_new_city {
static Scanner in = new Scanner (System.in);
	
	public static City creat() {
		
		int Id;
		String Name;
		String CountryCode;
		String district;
		int Population;
		
		System.out.print("Pleae Add The City ID :");
		Id=in.nextInt();
		System.out.print("Pleae Add The City Name :");
		Name=in.next();
		System.out.print("Pleae Add The City Country Code:");
		CountryCode=in.next();
		System.out.print("Pleae Add The City District:");
		district=in.next();
		System.out.print("Pleae Add The City Population:");
		Population=in.nextInt();
		
		return new City(Id,Name,CountryCode,district,Population);
	}	

}
