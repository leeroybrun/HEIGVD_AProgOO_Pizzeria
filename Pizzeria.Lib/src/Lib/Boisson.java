package Lib;

public final class Boisson extends Article {
	
	private double _contenance;

	public Boisson(String designation, double prixHT, double contenance) throws Exception {
		super(designation, prixHT);
	}

	@Override
	public double calculerPrixHT() {
		return getPrixHT();
	}

	public double getContenance() {
		return _contenance;
	}

	public void setContenance(double contenance) throws Exception {
		if(contenance < 0.1) {
			throw new IllegalArgumentException("Contenance doit pas être < 0.1");
		}
		this._contenance = contenance;
	}

}
