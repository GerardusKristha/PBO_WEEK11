package Tugas1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class TesPegawai {
    public static void main(String[] args) {
        Manager manager = new Manager(210101,"Gerardus");
        manager.setGajiPokok(4000000);
        manager.setTunjangan(1500000);
        
        Sales sales1 = new Sales(210304, "Kristha");
        sales1.setGajiPokok(3000000);
        sales1.setJumlahBarang(50);
        
        Sekretaris sekretaris = new Sekretaris(210203, "Bayu");
        sekretaris.setGajiPokok(3500000);
        
        Sales sales2 = new Sales(210306,"Indra");
        sales2.setGajiPokok(3000000);
        sales2.setJumlahBarang(25);
        
        Sales sales3 = new Sales(210308,"Putra");
        sales3.setGajiPokok(3000000);
        sales3.setJumlahBarang(100);
        
        Pegawai[] pgw = new Pegawai[5];
        pgw[0]= manager;
        pgw[1]= sales1;
        pgw[2]= sekretaris;
        pgw[3]= sales2;
        pgw[4]= sales3;
        
        String managerString= "Manager : \n";
        String sekretarisString= "Sekretaris : \n";
        String salesString= "Sales : \n" ;
        
        for(int i = 0; i<pgw.length;i++){
            if(pgw[i] instanceof Manager){
                managerString+= pgw[i].toString() +" dengan gaji total : "+ pgw[i].getGajiTotal()+"\n";
            }
            if(pgw[i] instanceof Sekretaris){
                sekretarisString+=pgw[i].toString() +" dengan gaji total : "+ pgw[i].getGajiTotal()+"\n";
            }
            if(pgw[i] instanceof Sales){
                salesString+=pgw[i].toString() +" dengan gaji total : "+ pgw[i].getGajiTotal()+"\n";
            }
        }
        System.out.println("Daftar Pegawai : ");
        System.out.println(managerString);
        System.out.println(sekretarisString);
        System.out.println(salesString);
    }
}
