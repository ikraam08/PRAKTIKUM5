package Praktikum5;

public class Pegawai {
    private String name;
    private double gajipokok;
    // overload Constructor
    public Pegawai (){
        this.name = name;
        this.gajipokok = gajipokok;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public double getGajipokok() {
        return gajipokok;
    }


    // Overriding
    public void display (){
        System.out.println("\nNama \t\t\t : " +getName());
        System.out.println("Gaji Pokok \t\t : " +getGajipokok());
    }
}
