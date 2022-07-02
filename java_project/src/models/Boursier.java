package models;

public class Boursier extends Etudiant {
    private int id;
    private String typeBourse;

    public String getLibelleBourse() {
        return typeBourse;
    }

    public void setLibelleBourse(String typeBourse) {
        this.typeBourse = typeBourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
