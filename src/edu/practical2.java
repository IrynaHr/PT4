package edu;

public class practical2 {

	public static void main(String[] args) {

		String country = "Ukraine";
		Continent continent;
		switch (country) {
		case "Ukraine":
		case "Spain":
		case "Italy":
			continent = Continent.EUROPE;
			System.out.println("EUROPE");
			break;
		case "Mexico":
		case "Chili":
		case "Brazial":
			continent = Continent.SOUTH_AMERICA;
			System.out.println("SOUTH_AMERICA");
			break;
		case "Canada":
		case "USA":
			continent = Continent.NORTH_AMERICA;
			System.out.println("NORTH_AMERICA");
			break;
		default:
			System.out.println("No this country");
			System.exit(0);
		}

	}

	public enum Continent {
		SOUTH_AMERICA, NORTH_AMERICA, AFRICA, EUROPE, ASIA, AUSTRALIA, ANTARCTICA
	}
}
