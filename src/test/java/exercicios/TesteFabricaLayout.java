package exercicios;

// TesteFabricaLayout.java
public class TesteFabricaLayout {
    public static void main(String[] args) {
        // Testando a Fábrica de Layout Grid
        FabricaLayoutPagina fabricaGrid = new FabricaLayoutGrid();

        Cabecalho cabecalhoGrid = fabricaGrid.criarCabecalho();
        Rodape rodapeGrid = fabricaGrid.criarRodape();
        BarraLateral barraLateralGrid = fabricaGrid.criarBarraLateral();

        System.out.println("Teste com Layout Grid:");
        cabecalhoGrid.renderizar();
        rodapeGrid.renderizar();
        barraLateralGrid.renderizar();

        System.out.println();

        // Testando a Fábrica de Layout Flexível
        FabricaLayoutPagina fabricaFlex = new FabricaLayoutFlex();

        Cabecalho cabecalhoFlex = fabricaFlex.criarCabecalho();
        Rodape rodapeFlex = fabricaFlex.criarRodape();
        BarraLateral barraLateralFlex = fabricaFlex.criarBarraLateral();

        System.out.println("Teste com Layout Flexível:");
        cabecalhoFlex.renderizar();
        rodapeFlex.renderizar();
        barraLateralFlex.renderizar();
    }
}
