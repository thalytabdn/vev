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
        Cliente cliente = new Cliente("Guilherme Coelho", new Date(2022, 11, 30), "PE");
        Fatura fatura = new Fatura("0000000000", 20.50, new Date(2022, 12, 31), cliente);
        Filtro filtro = new Filtro();

        filtro.addFatura(fatura);

        Assert.assertEquals(1, filtro.getQtdFaturas());
    }
}
