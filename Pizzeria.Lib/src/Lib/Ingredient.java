package Lib;

public final class Ingredient extends Article {
	public Ingredient(String designation, double prixHT) throws Exception {
		super(designation, prixHT);
	}
	
	@Override
	public double calculerPrixHT() {
		return getPrixHT();
	}
}
