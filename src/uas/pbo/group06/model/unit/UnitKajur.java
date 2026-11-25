/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model.unit;

public class UnitKajur extends UnitPengelola {
    public UnitKajur() { super(3, "Kajur", "kajur"); }
    @Override public String getJudulDashboard() { return "Dashboard Ketua Jurusan (Kajur)"; }
    @Override public String getBidangLayanan() { return "Kebijakan & Pimpinan Jurusan"; }
    @Override public String getDeskripsiSingkat() { return "Monitoring evaluasi layanan jurusan dan keputusan eskalasi pengaduan tingkat Jurusan."; }
    @Override public String getWewenangLengkap() { return "Memberikan keputusan akhir, kebijakan strategis, dan tindak lanjut pengaduan lintas prodi di tingkat Jurusan."; }
    @Override public String getEmailKedinas() { return "kajur@sipeka.test"; }
    @Override public String getLokasiKantor() { return "Gedung Sipil Lt. 1 - Ruang Ketua Jurusan"; }
    @Override public String getJamPelayanan() { return "Senin - Jumat, 08.00 - 16.00 WIB"; }
}
