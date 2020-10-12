public class Yate extends Barco {
    private int nroCamarotes;
    public Yate(String matricula, int eslora, int anioDeFabricacion,int nroCamarotes) {
        super(matricula, eslora, anioDeFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public int moduloFuncionParaAlquiler() {
        return nroCamarotes + super.moduloFuncionParaAlquiler();
    }
}
