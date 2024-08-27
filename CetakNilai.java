package t1.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BLACK
 */
public class CetakNilai {
    public static void main (String[] args){
        Nilai mahasiswa1 = new Nilai();
        Nilai mahasiswa2 = new Nilai();

        mahasiswa1.npm = 12093;
        mahasiswa1.name = "Purel";
        mahasiswa1.absen = 100;
        mahasiswa1.tugas = 85;
        mahasiswa1.uts = 80;
        mahasiswa1.uas = 78;
        mahasiswa1.Nilai();
        mahasiswa1.Nilaii();

        System.out.println();

        mahasiswa2.npm = 134565;
        mahasiswa2.name = "Amboy";
        mahasiswa2.absen = 98;
        mahasiswa2.tugas = 88;
        mahasiswa2.uts = 80;
        mahasiswa2.uas = 90;
        mahasiswa2.Nilai();
        mahasiswa2.Nilaii();
    }
}