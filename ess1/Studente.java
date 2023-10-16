
public class Studente {
    private String nome;
    private String cognome;
    private int id;


    public Studente(String nome , String cognome , int id){
      this.nome = nome;
      this.cognome = cognome;
      this.id = id;
}

    public String getnome(){
        return nome;
    }

    public void setnome( String newName){
       nome = newName;
    }


     public String getcognome(){
        return nome;
    }

    public void setcognome( String newSurname){
       cognome = newSurname;
    }    


     public int getid(){
        return id;
    }

    public void setid( int newId){
       id = newId;
    }  
    
    @Override
    public String toString(){
        return "Studente{" +
        "nome = " + nome + ", " + 
        "cognome = " + cognome + 
        ", id = "+ id + '}';
            
        
    }

}

