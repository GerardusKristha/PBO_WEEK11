package Tugas1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Sekretaris extends Pegawai{
    public Sekretaris(){
        super();
    }
    
    public Sekretaris(int employeeID, String name){
       super(employeeID, name);
    }
    
    public double getGajiTotal(){
        return getGajiPokok();
    }

}


