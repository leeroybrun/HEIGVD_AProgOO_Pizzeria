package Lib;

public abstract class Article {
	private String _designation;
	private double _prixHT;
		
	protected Article(String designation, double prixHT) throws Exception {
		setDesignation(designation);
		setPrixHT(prixHT);
	}

	public String getDesignation() {
		return _designation;
	}

	private void setDesignation(String designation) throws Exception {
		if(designation == null || designation.isEmpty()) {
			throw new IllegalArgumentException("Designation est vide");
		}
		this._designation = designation;
	}

	public double getPrixHT() {
		return _prixHT;
	}

	private void setPrixHT(double prixHT) throws Exception {
		if(prixHT < 0.0) {
			throw new IllegalArgumentException("Prix doit pas être < 0");
		}
		this._prixHT = prixHT;
	}
	
	public abstract double calculerPrixHT();
}
