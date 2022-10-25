package filtro;

import fatura.Cliente;
import fatura.Fatura;
import fatura.Filtro;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class FiltroTest {
    @Test
    public void teste() {
        Cliente cliente = new Cliente("Guilherme Coelho", new Date(2021, 11, 30), "PE");
        Cliente cliente2 = new Cliente("João", new Date(2021, 9, 26), "PE");
        Cliente cliente3 = new Cliente("Maria", new Date(2021, 9, 26), "SP");
        // fatura menor que 2000
        Fatura fatura1 = new Fatura("0000000000", 20.50, new Date(2022, 12, 31), cliente);
        Filtro filtro = new Filtro();
        // fatura entre 2-2,5k e data <= 1 mês atras
        Fatura fatura2 = new Fatura("0000000001", 2400.50, new Date(2022, 10, 20), cliente);
        // fatura entre 2-2,5k e data de inclusao <= 2 mês atras
        Fatura fatura3 = new Fatura("0000000002", 2600.50, new Date(2022, 10, 20), cliente2);
        // fatura maior q 4k e do sul do brasil
        Fatura fatura4 = new Fatura("0000000003", 2600.50, new Date(2022, 10, 20), cliente3);
        Fatura fatura5 = new Fatura("0000000004", 5000, new Date(2022, 10, 20), cliente2);

        filtro.addFatura(fatura1);
        filtro.addFatura(fatura2);
        filtro.addFatura(fatura3);
        filtro.addFatura(fatura4);
        filtro.addFatura(fatura5);

        Assert.assertEquals(1, filtro.getQtdFaturas());
    }
}
