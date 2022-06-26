package Controller;

import Model.*;

import java.util.ArrayList;

public class Dummy {

    String nama, alamat, ttl, telp, jurusan, judulTesis, judulDisertasi;
    int nim, nik;
    String departemen;
    int salary, honorPerSKS;

    MataKuliah matkul1, matkul2, matkul3, matkul4;
    Presensi presensi1, presensi2, presensi3;
    ArrayList<Presensi> listPresensi1, listPresensi2, listPresensi3, listPresensi4;
    MatkulAmbil matkulAmbilWajib1, matkulAmbilWajib2, matkulAmbilWajib3, matkulAmbilPilihan;
    MatkulPilihan matkulPilihan1, matkulPilihan2, matkulPilihan3;
    ArrayList<MatkulAmbil> listMataKuliahMagister1, listMataKuliahMagister2, listMataKuliahMagister3, listMataKuliahMagister4;

    PresensiStaff presensiStaff1, presensiStaff2, presensiStaff3, presensiStaff4;
    ArrayList<PresensiStaff> listPresensiStaff, listPresensiStaff1, listPresensiStaff2, listPresensiStaff3, listPresensiStaff4, listPresensiStaff5, listPresensiStaff6;
    MatkulAjar matkulAjar1, matkulAjar2, matkulAjar3, matkulAjar4, matkulAjar5, matkulAjar6;
    ArrayList<MatkulAjar> listMataKuliahAjar;

    ArrayList<Sarjana> listMhsSarjana = new ArrayList<>();
    ArrayList<Magister> listMhsMagister = new ArrayList<>();
    ArrayList<Doktor> listMhsDoktor = new ArrayList<>();
    ArrayList<DosenTetap> listDosenTetap = new ArrayList<>();
    ArrayList<DosenHonorer> listDosenHonorer = new ArrayList<>();
    ArrayList<Karyawan> listKaryawan = new ArrayList<>();

    Dummy() {
        initArrListMhsSarjana();
        initArrListMhsMagister();
        initArrListMhsDoktor();
        initArrListDosenTetap();
        initArrListDosenHonorer();
        initArrListKaryawan();
    }

    private void initArrListMhsSarjana() {

        matkul1 = new MataKuliah("111", 4, "Algoritma");
        matkul2 = new MataKuliah("222", 2, "Kalkulus");
        matkul3 = new MataKuliah("333", 2, "Desaign");

        matkulPilihan1 = new MatkulPilihan(15, "444", 2, "Inggris");
        matkulPilihan2 = new MatkulPilihan(10, "555", 2, "Indo");
        matkulPilihan3 = new MatkulPilihan(7, "666", 3, "PKN");

        ArrayList<Presensi> tempPresensi;
        ArrayList<MatkulAmbil> tempListMataKuliah;

        // MAHASISWA 1
        nama = "David";
        alamat = "Sukabumi";
        ttl = "Sukabumi, 12-12-1212";
        nim = 1122334;
        telp = "0888-8888-8888";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("4 Agustus 2022", 1));
        tempPresensi.add(new Presensi("3 Agustus 2022", 0));
        tempPresensi.add(new Presensi("6 Agustus 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 90, 80, 88));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Agustus 2022", 1));
        tempPresensi.add(new Presensi("3 Agustus 2022", 1));
        tempPresensi.add(new Presensi("4 Agustus 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 99, 77, 69));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("6 Agustus 2022", 1));
        tempPresensi.add(new Presensi("3 Agustus 2022", 1));
        tempPresensi.add(new Presensi("8 Agustus 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 90, 70, 80));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 90, 89, 77));

        listMhsSarjana.add(new Sarjana(nama, nim, jurusan, alamat, ttl, telp, tempListMataKuliah));

        // MAHASISWA 2
        nama = "Thomas";
        alamat = "Bandung";
        ttl = "Bandung, 5 Desember 2002";
        nim = 11121456;
        telp = "0666-6666-6666";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 90, 70, 80));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 90, 80, 88));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 90, 70, 80));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan3, tempPresensi, 70, 88, 90));

        listMhsSarjana.add(new Sarjana(nama, nim, jurusan, alamat, ttl, telp, tempListMataKuliah));

        // MAHASISWA 3
        nama = "Peter";
        alamat = "Sukabumi";
        ttl = "Sukabumi, 8 Maret 2002";
        nim = 1234567;
        telp = "0777-7777-7777";
        jurusan = "Elektro";

        tempListMataKuliah = new ArrayList<>();

        // ambil algo - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 September 2022", 1));
        tempPresensi.add(new Presensi("2 September 2022", 0));
        tempPresensi.add(new Presensi("3 September 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 80, 70, 80));

        // ambil ppkn - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 September 2022", 1));
        tempPresensi.add(new Presensi("2 September 2022", 1));
        tempPresensi.add(new Presensi("3 September 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 80, 70, 84));

        // ambil webdes - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 September 2022", 1));
        tempPresensi.add(new Presensi("2 September 2022", 0));
        tempPresensi.add(new Presensi("3 September 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 70, 79, 78));

        // ambil probstat - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 80, 89, 60));

        listMhsSarjana.add(new Sarjana(nama, nim, jurusan, alamat, ttl, telp, tempListMataKuliah));
    }

    private void initArrListMhsMagister() {

        matkul1 = new MataKuliah("111", 4, "Struktur Data");
        matkul2 = new MataKuliah("222", 2, "Inglish II");
        matkul3 = new MataKuliah("333", 2, "Web Programming");

        matkulPilihan1 = new MatkulPilihan(10, "444", 2, "Kalkulus");
        matkulPilihan2 = new MatkulPilihan(10, "555", 2, "Inggris");
        matkulPilihan3 = new MatkulPilihan(6, "666", 3, "SI");


        ArrayList<Presensi> tempPresensi;
        ArrayList<MatkulAmbil> tempListMataKuliah;


        // MAHASISWA 1
        nama = "Alvin";
        alamat = "Medan";
        ttl = "Medan, 8 Jan 2011";
        nim = 1122309;
        telp = "000222233";
        jurusan = "Informatika";
        judulTesis = "SISBER";

        tempListMataKuliah = new ArrayList<>();

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Februari 2022", 1));
        tempPresensi.add(new Presensi("2 Februari 2022", 1));
        tempPresensi.add(new Presensi("3 Februari 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 81, 46, 57));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Februari 2022", 1));
        tempPresensi.add(new Presensi("2 Februari 2022", 0));
        tempPresensi.add(new Presensi("3 Februari 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 80, 76, 62));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Februari 2022", 1));
        tempPresensi.add(new Presensi("2 Februari 2022", 1));
        tempPresensi.add(new Presensi("3 Februari 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 94, 54, 28));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Februari 2022", 0));
        tempPresensi.add(new Presensi("2 Februari2022", 1));
        tempPresensi.add(new Presensi("3 Februari 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan3, tempPresensi, 88, 76, 92));

        listMhsMagister.add(new Magister(nama, nim, jurusan, alamat, ttl, telp, judulTesis, tempListMataKuliah));


        // MAHASISWA 2
        nama = "Rini";
        alamat = "Jakarta";
        ttl = "Jakarta, 15 Januari 2002";
        nim = 333112313;
        telp = "123456777";
        jurusan = "Informatika";
        judulTesis = "Input Testing";

        tempListMataKuliah = new ArrayList<>();

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Oktober 2022", 1));
        tempPresensi.add(new Presensi("2 Oktober 2022", 0));
        tempPresensi.add(new Presensi("3 Oktober 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 55, 81, 86));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Oktober 2022", 1));
        tempPresensi.add(new Presensi("2 Oktober 2022", 1));
        tempPresensi.add(new Presensi("3 Oktober 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 48, 60, 71));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Oktober 2022", 0));
        tempPresensi.add(new Presensi("2 Oktober 2022", 1));
        tempPresensi.add(new Presensi("3 Oktober 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 56, 78, 88));

        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Oktober 2022", 1));
        tempPresensi.add(new Presensi("2 Oktober 2022", 1));
        tempPresensi.add(new Presensi("3 Oktober 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan2, tempPresensi, 83, 45, 55));

        listMhsMagister.add(new Magister(nama, nim, jurusan, alamat, ttl, telp, judulTesis, tempListMataKuliah));
    }

    private void initArrListMhsDoktor() {
        // MAHASISWA 1
        nama = "Briam";
        alamat = "Kalimantan Utara";
        ttl = "Kalimantan Utara, 10 Mei 2000";
        nim = 11211100;
        telp = "0120000089";
        jurusan = "DKV";
        judulDisertasi = "OOP";

        listMhsDoktor.add(new Doktor(nama, nim, jurusan, alamat, ttl, telp, judulDisertasi, 82, 80, 72));


        // MAHASISWA 2
        nama = "Raya";
        alamat = "Bandung";
        ttl = "Bandung, 19 juni 2003";
        nim = 1124445;
        telp = "0001112324414";
        jurusan = "Informatika";
        judulDisertasi = "Blank";

        listMhsDoktor.add(new Doktor(nama, nim, jurusan, alamat, ttl, telp, judulDisertasi, 75, 78, 89));
    }

    public void initArrListDosenTetap() {

        ArrayList<PresensiStaff> tempPresensiStaff;
        ArrayList<MatkulAjar> tempListMataKuliahAjar;

        matkul1 = new MataKuliah("111", 4, "Algoritma");
        matkul2 = new MataKuliah("333", 2, "PPKN");

        nama = "Romi";
        alamat = "Surakarta";
        ttl = "Sukabumi, 1 Juni 1974";
        nik = 1133334;
        telp = "02355557770";
        departemen = "Informatika";
        salary = 2_000_000;

        tempListMataKuliahAjar = new ArrayList<>();

        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 mei 2020", 1, "01.00"));
        tempPresensiStaff.add(new PresensiStaff("2 mei 2020", 0, "12.00"));
        tempPresensiStaff.add(new PresensiStaff("3 mei 2020", 1, "14.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul1, tempPresensiStaff));

        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 mei 2020", 1, "12.00"));
        tempPresensiStaff.add(new PresensiStaff("2 mei 2020", 0, "14.00"));
        tempPresensiStaff.add(new PresensiStaff("3 mei 2020", 1, "01.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul2, tempPresensiStaff));

        listDosenTetap.add(new DosenTetap(nama, nik, alamat, ttl, telp, salary, departemen, tempListMataKuliahAjar));
    }

    public void initArrListDosenHonorer() {

        ArrayList<PresensiStaff> tempPresensiStaff;
        ArrayList<MatkulAjar> tempListMataKuliahAjar;

        matkul1 = new MataKuliah("111", 4, "Struktur Data");
        matkul2 = new MataKuliah("222", 2, "Agama");

        nama = "Riki";
        alamat = "Bandung";
        ttl = "Bandung, 12 Oktober 2010";
        nik = 11334555;
        telp = "8866333455522";
        departemen = "Informatika";
        honorPerSKS = 3_000_000;

        tempListMataKuliahAjar = new ArrayList<>();

        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Oktober 2020", 1, "06.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Oktober 2020", 0, "12.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Oktober 2020", 1, "13.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul1, tempPresensiStaff));

        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Oktober 2020", 1, "11.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Oktober 2020", 1, "12.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Oktober 2020", 1, "07.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul2, tempPresensiStaff));

        listDosenHonorer.add(new DosenHonorer(nama, nik, alamat, ttl, telp, honorPerSKS, departemen, tempListMataKuliahAjar));
    }

    public void initArrListKaryawan() {

        ArrayList<PresensiStaff> tempPresensiStaff;

        nama = "Dodi";
        alamat = "Riau";
        ttl = "Medan, 7 November 1988";
        nik = 1311232424;
        telp = "0899283243444";
        salary = 500_000;

        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 April 2020", 0, "12.00"));
        tempPresensiStaff.add(new PresensiStaff("2 April 2020", 1, "12.00"));
        tempPresensiStaff.add(new PresensiStaff("3 April 2020", 1, "12.00"));

        listKaryawan.add(new Karyawan(nama, nik, alamat, ttl, telp, salary, tempPresensiStaff));
    }

    public ArrayList<Sarjana> getArrListMhsSarjana() {
        return listMhsSarjana;
    }

    public ArrayList<Magister> getArrListMhsMagister() {
        return listMhsMagister;
    }

    public ArrayList<Doktor> getArrListMhsDoktor() {
        return listMhsDoktor;
    }

    public ArrayList<DosenTetap> getArrListDosenTetap() {
        return listDosenTetap;
    }

    public ArrayList<DosenHonorer> getArrListDosenHonorer() {
        return listDosenHonorer;
    }

    public ArrayList<Karyawan> getArrListKaryawan() {
        return listKaryawan;
    }
}
