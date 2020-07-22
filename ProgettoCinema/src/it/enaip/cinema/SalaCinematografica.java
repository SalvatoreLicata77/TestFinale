package it.enaip.cinema;

import java.util.ArrayList;
import java.util.Random;

public class SalaCinematografica {
	
	ArrayList<Spettatore> visione, spettatoreList;
	Random r, filmRandom, spettatoreRandom;

	public SalaCinematografica() {

	r = new Random();
	filmRandom = new Random();
	spettatoreRandom = new Random();
	visione = new ArrayList<Spettatore>();
	spettatoreList = new ArrayList<Spettatore>();

	}

	private void entrataCinema(String id, String firstName, String lastName, String birthDate, int age, int seat,
	int price) {

	
	}
}

