public class Deportivo extends Barco {
    private int cv;
    public Deportivo(String matricula, int eslora, int anioDeFabricacion, int cv) {
        super(matricula, eslora, anioDeFabricacion);
        this.cv = cv;
    }

    @Override
    public int moduloFuncionParaAlquiler() {
        return cv + super.moduloFuncionParaAlquiler();
    }
}
