package models;

import java.util.Date;

public class Etudiant extends Personne{

    private String  matricule;
    private String  email;
    private String  telephone;
    private String  adresse;
    private Date  dateNaiss;

    public Date getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    private String  isHoused;

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
  
    public String getIsHoused() {
        return isHoused;
    }
    public void setIsHoused(String isHoused) {
        this.isHoused = isHoused;
    }

}
