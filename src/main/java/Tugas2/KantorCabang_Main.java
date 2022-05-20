package Tugas2;

import Tugas1.*;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class KantorCabang_Main {

    public static void main(String[] args) {

        KantorCabang kc = new KantorCabang("PBOA", "Paingan", "Yogayakrta");

        Manager manager = new Manager(210101, "Gerardus");
        manager.setGajiPokok(4000000);
        manager.setTunjangan(1500000);

        Sales sales1 = new Sales(210304, "Kristha");
        sales1.setGajiPokok(3000000);
        sales1.setJumlahBarang(50);

        Sekretaris sekretaris = new Sekretaris(210203, "Bayu");
        sekretaris.setGajiPokok(3500000);

        Sales sales2 = new Sales(210306, "Indra");
        sales2.setGajiPokok(3000000);
        sales2.setJumlahBarang(25);

        Sales sales3 = new Sales(210308, "Putra");
        sales3.setGajiPokok(3000000);
        sales3.setJumlahBarang(100);

        Pegawai[] pgw = new Pegawai[KantorCabang.MAX_PEGAWAI];
        pgw[0] = manager;
        pgw[1] = sales1;
        pgw[2] = sekretaris;
        pgw[3] = sales2;
        pgw[4] = sales3;

        kc.setPegawaiArray(pgw, 5);
        System.out.println(kc.toString());
        System.out.println(kc.cetakGajiTotalSetiapPegawai());
    }


}
