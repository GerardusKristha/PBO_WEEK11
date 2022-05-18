package Tugas1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Pegawai {
    protected int employeeID;
    private String name;
    protected int gajiPokok;

    public Pegawai(){
        this(210000,"-");    
    }
    public Pegawai( int employeeID,String name){
        if(employeeID<210000){
            this.employeeID = 210000;
        }
        else {
            this.employeeID = employeeID;
        }
        this.name = name;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int employeeID){
        if(employeeID<210000){
            this.employeeID = 210000;
        }
        else {
            this.employeeID = employeeID;
        }
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public double getGajiTotal(){
        return gajiPokok;
    } 
    public String toString(){
        return "ID : " + employeeID + ", Nama : " + name; 
    }
}
