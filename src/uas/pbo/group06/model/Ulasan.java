/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model;

public class Ulasan {
    private int idUlasan;
    private String noTiket;
    private String namaMahasiswa;
    private String isiUlasan;
    private String balasanUnit;
    private String waktu;

    public Ulasan(int idUlasan, String noTiket, String namaMahasiswa, String isiUlasan, String balasanUnit, String waktu) {
        this.idUlasan = idUlasan;
        this.noTiket = noTiket;
        this.namaMahasiswa = namaMahasiswa;
        this.isiUlasan = isiUlasan;
        this.balasanUnit = balasanUnit;
        this.waktu = waktu;
    }

    public int getIdUlasan() { return idUlasan; }
    public String getNoTiket() { return noTiket; }
    public String getNamaMahasiswa() { return namaMahasiswa; }
    public String getIsiUlasan() { return isiUlasan; }
    public String getBalasanUnit() { return balasanUnit; }
    public String getWaktu() { return waktu; }
}
