package nl.trivento.codeguild.quarkus.persoon;

import java.time.LocalDate;

public class Persoon {
    private String voornaam;
    private String achternaam;
	private LocalDate geboortedatum;
    private String email;
    
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public LocalDate getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
