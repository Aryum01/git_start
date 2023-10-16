package modulo2.ess2;

public class Auto{
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;
   


    public Auto(int cilindrata , String targa , String marca, String modello){
      this.cilindrata  = cilindrata ;
      this.targa = targa;
      this.marca= marca;
      this.modello=modello;
}

    public int getcilindrata(){
        return cilindrata;
    }

    public void setcilindrata( int newCilindrata){
       cilindrata = newCilindrata;
    }


     public String gettarga(){
        return targa;
    }

    public void settarga( String newTarga){
       targa = newTarga;
    }    


     public String getmarca(){
        return marca;
    }

    public void setmarca( String newMarca){
       marca = newMarca;
    }  
    
    public String getmodello(){
        return marca;
    }

    public void setmodello( String newModello){
       modello= newModello;
    }  

    @Override
    public String toString(){
        return "Auto{" +
        "cilindrata = " + cilindrata + ", " + 
        "targa = " + targa + 
        ", marca = "+ marca +  ", modello = " + modello + '}';
            
        
    }

}

