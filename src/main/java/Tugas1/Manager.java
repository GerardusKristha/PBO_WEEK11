package Tugas1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Manager extends Pegawai{
    private int tunjangan;
    public Manager() {
        super();
    }
    
    public Manager(int employeeID, String name){
       super(employeeID, name);
    }
    
    public int getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public double getGajiTotal(){
        return getGajiPokok()+tunjangan;
    }

}
