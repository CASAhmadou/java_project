package models;

public class Chambre {

    private static int nbr;
    private TypeChambre type;
    private int id;
    private String numero;
    private String etage;
    private String etat;
    private Pavillon pavillon;
    private ResponsablePedagogique resp;


    public Chambre(){
        nbr++;
        id=nbr;
        numero = "ch000"+id;
        etat = "disponible";
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", nombre d'etage " + etage + ", numero=" + numero + ", pavillon=" + pavillon + ", etat chambre="
                + etat + ", type de chambre " + type + " ";
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public ResponsablePedagogique getResp() {
        return resp;
    }

    public void setResp(ResponsablePedagogique resp) {
        this.resp = resp;
    }
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}