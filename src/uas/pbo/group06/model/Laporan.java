/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model;

public class Laporan {
    private String noTiket;
    private String namaPelapor;
    private String nimPelapor;
    private String judulLaporan;
    private String tanggal;
    private String status;

    public Laporan(String noTiket, String namaPelapor, String nimPelapor, String judulLaporan, String tanggal, String status) {
        this.noTiket = noTiket;
        this.namaPelapor = namaPelapor;
        this.nimPelapor = nimPelapor;
        this.judulLaporan = judulLaporan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getNoTiket() { return noTiket; }
    public String getNamaPelapor() { return namaPelapor; }
    public String getNimPelapor() { return nimPelapor; }
    public String getJudulLaporan() { return judulLaporan; }
    public String getTanggal() { return tanggal; }
    public String getStatus() { return status; }
}