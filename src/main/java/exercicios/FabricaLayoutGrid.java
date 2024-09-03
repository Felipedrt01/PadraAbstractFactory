package exercicios;

// FabricaLayoutGrid.java
public class FabricaLayoutGrid implements FabricaLayoutPagina {
    @Override
    public Cabecalho criarCabecalho() {
        return new CabecalhoGrid();
    }

    @Override
    public Rodape criarRodape() {
        return new RodapeGrid();
    }

    @Override
    public BarraLateral criarBarraLateral() {
        return new BarraLateralGrid();
    }
}

