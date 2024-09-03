package exercicios;

// FabricaLayoutFlex.java
public class FabricaLayoutFlex implements FabricaLayoutPagina {
    @Override
    public Cabecalho criarCabecalho() {
        return new CabecalhoFlex();
    }

    @Override
    public Rodape criarRodape() {
        return new RodapeFlex();
    }

    @Override
    public BarraLateral criarBarraLateral() {
        return new BarraLateralFlex();
    }
}
