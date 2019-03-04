package se.lexicon.F_JDBC;

import java.util.List;

public interface City_dao {
	City findById( int id);
	List<City> findByCode(String code);
	List<City> findByName(String name);
	List<City> findAll();
	City add(City city);
	City update(City city);
	int delete(City city);
	void printCities();
}
