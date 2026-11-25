/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model.unit;

public class UnitSekjur extends UnitPengelola {
    public UnitSekjur() { super(1, "Sekjur", "sekjur"); }
    @Override public String getJudulDashboard() { return "Dashboard Sekretariat Jurusan (Sekjur)"; }
    @Override public String getBidangLayanan() { return "Fasilitas Kampus (Sarpras)"; }
    @Override public String getDeskripsiSingkat() { return "Kelola disposisi pengaduan fasilitas kelas, lab komputer, proyektor, dan AC."; }
    @Override public String getWewenangLengkap() { return "Menangani perbaikan, perawatan, dan pengadaan sarana prasarana fisik di lingkungan Jurusan."; }
    @Override public String getEmailKedinas() { return "sekjur@sipeka.test"; }
    @Override public String getLokasiKantor() { return "Gedung Sipil Lt. 1 - Ruang Sekjur JTI"; }
    @Override public String getJamPelayanan() { return "Senin - Jumat, 08.00 - 16.00 WIB"; }
}