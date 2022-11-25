# PRAKTIKUM5
## Pemrograman Orientasi Objek

````shell
Nama   : Ikram Ramadhan
Nim    : 312110478
Matkul : Pemrograman Orientasi Objek
````


### 1. File Pegawai.java
* *CODINGAN FILE 1

```java
package Praktikum5;

public class Pegawai {
    private String name;
    private double gajipokok;
    // overload Constructor
    public Pegawai (String name, double gajipokok){
        this.name = name;
        this.gajipokok = gajipokok;
    }


    public String getName() {
        return name;
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

```






### 2.Manager.java
* *CODINGAN FILE 2
```java
package Praktikum5;

public class Manager extends Pegawai{
    private double tunjangan;

    public Manager (String name, double gajipokok) {
        super(name, gajipokok);
        this.tunjangan = 2000000;
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
    }
}

```
### 3.Progammer.java
* *CODINGAN FILE 3
```java
package Praktikum5;

public class Programmer extends Pegawai{
    private double bonus;

    public Programmer(String name, double gajipokok) {
        super(name, gajipokok);
        this.bonus = 1000000;
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

```
### 5.Main.java
* *CODINGAN FILE 4
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)
