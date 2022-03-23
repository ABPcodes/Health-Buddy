package com.example.dashboard;

public class thyroidu {

    String tshdb,tyidb,t3udb,fitdb;

    public thyroidu() {
    }

    public thyroidu(String tshdb, String tyidb, String t3udb, String fitdb) {
        this.tshdb = tshdb;
        this.tyidb = tyidb;
        this.t3udb = t3udb;
        this.fitdb = fitdb;
    }

    public String getTshdb() {
        return tshdb;
    }

    public void setTshdb(String tshdb) {
        this.tshdb = tshdb;
    }

    public String getTyidb() {
        return tyidb;
    }

    public void setTyidb(String tyidb) {
        this.tyidb = tyidb;
    }

    public String getT3udb() {
        return t3udb;
    }

    public void setT3udb(String t3udb) {
        this.t3udb = t3udb;
    }

    public String getFitdb() {
        return fitdb;
    }

    public void setFitdb(String fitdb) {
        this.fitdb = fitdb;
    }
}
