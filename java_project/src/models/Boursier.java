package models;

public class Boursier extends Etudiant{
    
    private Chambre chambre;
    private TypeBourse type;

    public TypeBourse getType() {
        return type;
    }

    public void setType(TypeBourse type) {
        this.type = type;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}