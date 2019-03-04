package se.lexicon.F_JDBC;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
   
    
    	static Scanner in = new Scanner(System.in);
    	static City_dao_impl dao = new City_dao_impl();

    	public static void main(String[] args) throws SQLException {

    		
    		boolean Running = true;

    		while (Running) {
    			System.out.println("Welcome To DataBase " + "\1- for Find By ID " + "\2- for Find By Code " + "\3-for Find By Name "
    					+ "\4- for Find All" + "\5- for Add City " + "\6- for Update City " + "\7- for Delete City");

    			int Selections = in.nextInt();

    			switch (Selections) {

    			case 1:
    				System.out.println("Please Type The City ID : ");
    				System.out.print(dao.findById(in.nextInt()));
    				break;
    			case 2:
    				System.out.print("Please Type The City Code: ");
    				dao.findByCode(in.next()).forEach(System.out::println);
    				break;
    			case 3:
    				System.out.print("Please Type The City Name: ");
    				dao.findByName(in.next()).forEach(System.out::println);
    				break;
    			case 4:
    				System.out.println("All Cities Table");
    				dao.findAll().forEach(System.out::println);
    				break;
    			case 5:
    				System.out.println(dao.add(create_new_city.creat()));
    				break;
    			case 6:
    				System.out.println(dao.update(Update()));
    				break;
    			case 7:
    				System.out.println("Please Type The City ID You Want To Delete : ");
    				System.out.println(dao.delete(dao.findById(in.nextInt())));
    				break;

    			default:
    				break;
    			}

    		}
    	}
    	
    	public static City Update() {

    		City UpdateOne = null;

    		String Name;
    		int Population;

    		System.out.println("Please Type The City ID : ");
    		UpdateOne = dao.findById(in.nextInt());

    		System.out.print("Pleae Add The New City Name :");
    		Name = in.next();
    		System.out.print("Pleae Add The New City Population:");
    		Population = in.nextInt();

    		return new City(UpdateOne.getId(), Name, UpdateOne.getCountryCode(), UpdateOne.getDistrict(), Population);

    	}
    }

