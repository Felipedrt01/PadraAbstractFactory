package exercicios;


// Principal.java
public class Principal {
    public static void main(String[] args) {
        FabricaLayoutPagina fabricaGrid = new FabricaLayoutGrid();
        Cabecalho cabecalhoGrid = fabricaGrid.criarCabecalho();
        Rodape rodapeGrid = fabricaGrid.criarRodape();
        BarraLateral barraLateralGrid = fabricaGrid.criarBarraLateral();

        cabecalhoGrid.renderizar();
        rodapeGrid.renderizar();
        barraLateralGrid.renderizar();

        FabricaLayoutPagina fabricaFlex = new FabricaLayoutFlex();
        Cabecalho cabecalhoFlex = fabricaFlex.criarCabecalho();
        Rodape rodapeFlex = fabricaFlex.criarRodape();
        BarraLateral barraLateralFlex = fabricaFlex.criarBarraLateral();

        cabecalhoFlex.renderizar();
        rodapeFlex.renderizar();
        barraLateralFlex.renderizar();
    }
}
