package tpsit.produttoreconsumatore;

public class Parcheggio {
    
    public int PostiDisponibili = 10;

    private Semaforo smf;
    
    public Parcheggio(Semaforo smf) {
        this.smf = smf;
    }
    
    public void entraAuto(){
        PostiDisponibili++;
    }
    
    public void esceAuto(){
        PostiDisponibili--;
    }
    
}
