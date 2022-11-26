package Praktikum5;

public class Main {

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("einsten",5000000);
        Manager manager = new Manager("rere",3000000);
        Programmer programmer = new Programmer("roro",4000000);
        pegawai.setName("Isac");
        manager.setName("Newton");
        programmer.setName("Albert");
        pegawai.setGajipokok(3500000);
        manager.setGajipokok(7000000);
        programmer.setGajipokok(6500000);
        manager.setTunjangan(2000000);
        programmer.setBonus(500000);
        pegawai.display();
        manager.display();
        programmer.display();
    }
}
