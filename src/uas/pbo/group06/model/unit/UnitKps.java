/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model.unit;

public class UnitKps extends UnitPengelola {
    public UnitKps() { super(4, "KPS", "kps"); }
    @Override public String getJudulDashboard() { return "Dashboard Ketua Program Studi (KPS)"; }
    @Override public String getBidangLayanan() { return "Kurikulum & Akademik Prodi"; }
    @Override public String getDeskripsiSingkat() { return "Penanganan pengaduan perkuliahan, dosen wali, skripsi/TA, dan kurikulum Prodi."; }
    @Override public String getWewenangLengkap() { return "Menangani serta memutuskan penyelesaian pengaduan akademik, perkuliahan, dan tugas akhir mahasiswa Prodi."; }
    @Override public String getEmailKedinas() { return "kps@sipeka.test"; }
    @Override public String getLokasiKantor() { return "Gedung Sipil Lt. 2 - Ruang KPS"; }
    @Override public String getJamPelayanan() { return "Senin - Jumat, 08.00 - 16.00 WIB"; }
}