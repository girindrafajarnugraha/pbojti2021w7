/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author INDRAFN
 */
public class Inheritance1 {
    public static void main(String[] args){
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Lakilaki", 20, 2000000, 
                250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();
        
        System.out.println();
        
        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 
                10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
        
//        Manager M = new Manager();
//        M.nama = "Vivin";
//        M.alamat = "Jl. Vinolia";
//        M.umur = 25;
//        M.jk = "Perempuan";
//        M.gaji = 3000000;
//        M.tunjangan = 1000000;
//        M.tampilDataManager();
//        
//        System.out.println();
//        
//        Staff S = new Staff();
//        S.nama = "Lestari";
//        S.alamat = "Malang";
//        S.umur = 25;
//        S.jk = "Perempuan";
//        S.gaji = 2000000;
//        S.lembur = 500000;
//        S.potongan = 250000;
//        S.tampilDataStaff();
    }
}
