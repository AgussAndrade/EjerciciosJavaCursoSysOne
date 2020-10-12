public class Velero extends Barco {
    private int numerosDeMastiles;
    public Velero(String matricula, int eslora, int anioDeFabricacion, int numerosDeMastiles) {
        super(matricula, eslora, anioDeFabricacion);
        this.numerosDeMastiles = numerosDeMastiles;
    }

    @Override
    public int moduloFuncionParaAlquiler() {
        return (numerosDeMastiles + super.moduloFuncionParaAlquiler());
    }
}

