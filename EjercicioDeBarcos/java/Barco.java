import java.util.Date;

public abstract class Barco {
    protected String matricula;
    protected int eslora;
    protected int anioDeFabricacion;
    protected final int FACTOR_PARA_ALQUILER = 10;
    public Barco(String matricula,int eslora, int anioDeFabricacion){
        this.anioDeFabricacion= anioDeFabricacion;
        this.eslora = eslora;
        this.matricula = matricula;
    }
    public int moduloFuncionParaAlquiler(){
        return eslora * FACTOR_PARA_ALQUILER;
    }
}
