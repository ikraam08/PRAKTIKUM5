package Praktikum5;

public class Manager extends Pegawai{
    private double tunjangan;

    public Manager () {
        super();
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tambah tunjangan : " + this.tunjangan);
        System.out.println("Total Gaji");
        System.out.println(+getGajipokok()+getTunjangan());
}}
