package studente;

public class Studente {
    private String nome, cognome, esito;
    private float voto;
    
    public Studente(String nome, String cognome, float voto, String esito){
        this.nome=nome;
        this.cognome=cognome;
        this.voto=voto;
        this.esito=esito;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public float getVoto(){
        return voto;
    }
    
    public String getEsito(){
        return esito;
    }
    
    public void setNome(String n){
        this.nome=n;
    }
    
    public void setCognome(String c){
        this.cognome=c;
    }
    
    public void setVoto(float v){
        this.voto=v;
    }
    
    public void setEsito(float voto){
        if(voto >=6){
            this.esito="positivo";
        } 
        else{
            this.esito="negativo";
        }
    }
    
    public String info(){
        String testo=
                "nome     : " + this.nome    + "\n" +
                "cognome  : " + this.cognome + "\n" +
                "voto     : " + this.voto    + "\n" +
                "esito    : " + this.esito   + "\n";
        return testo;
    }
    
}
