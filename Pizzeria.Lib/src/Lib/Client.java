package Lib;

public final class Client {
	private Adresse _adresse;
	private int _id;
	private String _nom;
	private String _prenom;
	private String _email;
	private String _telephone;
	
	public Client(int id, String nom, String prenom, String email, String telephone, Adresse adresse) {
		setId(id);
		setNom(nom);
		setPrenom(prenom);
		setEmail(email);
		setTelephone(telephone);
		setAdresse(adresse);
	}

	public Adresse getAdresse() {
		return _adresse;
	}

	public void setAdresse(Adresse _adresse) {
		if(_adresse == null) {
			throw new IllegalArgumentException("Veuillez fournir une adresse");
		}
		
		this._adresse = _adresse;
	}

	public int getId() {
		return _id;
	}

	public void setId(int _id) {
		this._id = _id;
	}

	public String getNom() {
		return _nom;
	}

	public void setNom(String _nom) {
		if(_nom == null || _nom.isEmpty()) {
			throw new IllegalArgumentException("Veuillez fournir un nom");
		}
		
		this._nom = _nom;
	}

	public String getPrenom() {
		return _prenom;
	}

	public void setPrenom(String _prenom) {
		if(_prenom == null || _prenom.isEmpty()) {
			throw new IllegalArgumentException("Veuillez fournir un prenom");
		}
		
		this._prenom = _prenom;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String _email) {
		if(_email == null || _email.isEmpty()) {
			throw new IllegalArgumentException("Veuillez fournir un email");
		}
		
		this._email = _email;
	}

	public String getTelephone() {
		return _telephone;
	}

	public void setTelephone(String _telephone) {
		if(_telephone == null || _telephone.isEmpty()) {
			throw new IllegalArgumentException("Veuillez fournir un telephone");
		}
		
		this._telephone = _telephone;
	}
}
