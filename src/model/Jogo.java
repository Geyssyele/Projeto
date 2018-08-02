package model;

/**
 *
 * @author ben
 */
public class Jogo {
    private Integer id;//banco
    
    private String plataforma;
    private String nomeJogo;

    
    public Jogo( String plataforma, String nomeJogo) {
        this.plataforma = plataforma;
        this.nomeJogo = nomeJogo;
    }
    public Jogo(int id, String plataforma, String nomeJogo) {
        this.id = id;
        this.plataforma = plataforma;
        this.nomeJogo = nomeJogo;
    }
    
    //gets e sets
    public String getPlataforma() {
        return plataforma;
    }
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    //retornar sempre jogo
    @Override
    public String toString() {
        return "Jogo("+plataforma+"\t"+nomeJogo+")";
    }
    
    
    
    
}
