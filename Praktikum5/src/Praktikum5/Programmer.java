package Praktikum5;

public class Programmer extends Pegawai{
    private double bonus;

    public Programmer() {
        super();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tambah Bonus \t : "+ this.bonus);
        System.out.println("Total Gaji");
        System.out.println(+getGajipokok()+getBonus());
    }
}
