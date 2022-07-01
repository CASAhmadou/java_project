package models;

public class Chambre {

    private TypeChambre type;
    private int id;
    private String numero;
    private String etage;

    private Pavillon pavillon;
    private ResponsablePedagogique resp;

  

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
        return "Chambre [etage=" + etage + ", id=" + id + ", numero=" + numero + ", pavillon=" + pavillon + ", resp="
                + resp + ", type=" + type + "]";
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
    
}
