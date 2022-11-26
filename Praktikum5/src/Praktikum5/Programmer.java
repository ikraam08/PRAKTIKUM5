package Praktikum5;

public class Programmer extends Pegawai{
    //Atribute
    private double bonus;
    // Overloading constructor inherite superclass
    public Programmer(String name, double gajipokok) {
        super(name,gajipokok);
    }
    //SETTER
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //GETTER
    public double getBonus() {
        return bonus;
    }
    //Overriding Method
    @Override
    public void display() {
        super.display();
        System.out.println("Tambah Bonus \t : "+ this.bonus);
        System.out.println("Total Gaji");
        System.out.println(+getGajipokok()+getBonus());
    }
}
