/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo.group06.model.unit;

public class UnitAdminProdi extends UnitPengelola {
    public UnitAdminProdi() { super(2, "Admin Prodi", "admin_prodi"); }
    @Override public String getJudulDashboard() { return "Dashboard Admin Program Studi"; }
    @Override public String getBidangLayanan() { return "Administrasi Akademik Prodi"; }
    @Override public String getDeskripsiSingkat() { return "Verifikasi surat menyurat, KRS/KHS, dan administrasi kemahasiswaan tingkat Prodi."; }
    @Override public String getWewenangLengkap() { return "Memverifikasi kelengkapan berkas pengaduan administrasi akademik mahasiswa tingkat Program Studi."; }
    @Override public String getEmailKedinas() { return "adminprodi@sipeka.test"; }
    @Override public String getLokasiKantor() { return "Gedung Sipil Lt. 2 - Ruang Admin Prodi"; }
    @Override public String getJamPelayanan() { return "Senin - Jumat, 08.00 - 16.00 WIB"; }
}