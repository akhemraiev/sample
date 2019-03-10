package classes;

public class House {
    private String adress;
    private int etage;
    private TV telek;

    public int windows;
    int doors;

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public int getEtage() {
        return etage;
    }

    public void setTelek(TV telek) {
        this.telek = telek;
    }

    public TV getTelek() {
        return telek;
    }


}
