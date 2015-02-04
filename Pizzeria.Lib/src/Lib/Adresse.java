package Lib;

public final class Adresse {
	private String _rue;
	private String _no;
	private int _npa;
    private String _ville;
    private String _etage;
    private String _codeEntree;
    
	public Adresse(String rue, String no, int npa, String ville, String etage, String codeEntree) {
		setRue(rue);
		setNo(no);
		setNpa(npa);
		setVille(ville);
		setEtage(etage);
		setCodeEntree(codeEntree);
	}

	public String getRue() {
		return _rue;
	}

	public void setRue(String _rue) {
		this._rue = _rue;
	}

	public String getNo() {
		return _no;
	}

	public void setNo(String _no) {
		this._no = _no;
	}

	public int getNpa() {
		return _npa;
	}

	public void setNpa(int _npa) {
		this._npa = _npa;
	}

	public String getVille() {
		return _ville;
	}

	public void setVille(String _ville) {
		this._ville = _ville;
	}

	public String getEtage() {
		return _etage;
	}

	public void setEtage(String _etage) {
		this._etage = _etage;
	}

	public String getCodeEntree() {
		return _codeEntree;
	}

	public void setCodeEntree(String _codeEntree) {
		this._codeEntree = _codeEntree;
	}
}
