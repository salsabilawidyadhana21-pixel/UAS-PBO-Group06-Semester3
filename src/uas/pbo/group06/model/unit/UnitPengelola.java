/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model.unit;

public abstract class UnitPengelola {
    protected int idUnit;
    protected String namaUnit;
    protected String kodeUnit;

    public UnitPengelola(int idUnit, String namaUnit, String kodeUnit) {
        this.idUnit = idUnit;
        this.namaUnit = namaUnit;
        this.kodeUnit = kodeUnit;
    }

    public int getIdUnit() { return idUnit; }
    public String getNamaUnit() { return namaUnit; }
    public String getKodeUnit() { return kodeUnit; }

    public abstract String getJudulDashboard();
    public abstract String getBidangLayanan();
    public abstract String getDeskripsiSingkat();
    public abstract String getWewenangLengkap();
    public abstract String getEmailKedinas();
    public abstract String getLokasiKantor();
    public abstract String getJamPelayanan();
}