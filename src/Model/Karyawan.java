package Model;

import java.util.ArrayList;

public class Karyawan extends Staff {

    private int salary;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public Karyawan(String nama, int NIK, String alamat, String TTL, String telepon, int salary, ArrayList<PresensiStaff> listPresensiStaff) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        setListPresensiStaff(listPresensiStaff);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "Karyawan : \n" + super.toString() + "\nSalary=" + salary + "\nListPresensiStaff=" + listPresensiStaff;
    }


}
