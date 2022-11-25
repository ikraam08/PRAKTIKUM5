package Praktikum5;

public class Pegawai {
    //Atribute
    private String name;
    private double gajipokok;

    // overload Constructor
    public Pegawai (){
        this.name = name;
        this.gajipokok = gajipokok;
    }
    //SETTER
    public void setName(String name) {
        this.name = name;
    }
    //GETTER
    public String getName() {
        return name;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public double getGajipokok() {
        return gajipokok;
    }


    // Overriding Method
    public void display (){
        System.out.println("\nNama \t\t\t : " +getName());
        System.out.println("Gaji Pokok \t\t : " +getGajipokok());
    }
}
