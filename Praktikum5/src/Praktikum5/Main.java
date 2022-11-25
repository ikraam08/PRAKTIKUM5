package Praktikum5;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("ISAC", 3500000);
        Pegawai manager1 = new Manager("isa", 6000000);
        Pegawai programmer = new Programmer("ALBERT", 4500000);
        pegawai1.display();
        manager1.display();
        programmer.display();
    }
}
