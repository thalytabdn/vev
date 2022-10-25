package filtro;

import fatura.Cliente;
import fatura.Fatura;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class FaturaTest {

    @Test
    public void teste() {
        Cliente cliente = new Cliente("Guilherme Coelho", new Date(2022, 11, 30), "PE");
        Fatura fatura = new Fatura("0000000000", 20.50, new Date(2022, 12, 31), cliente);

        Assert.assertEquals("0000000000", fatura.getCodigo());
        Assert.assertEquals(20.50, fatura.getValor(), 0.0);
        Assert.assertEquals(new Date(2022, 12, 31), fatura.getData());
        Assert.assertTrue(cliente.equals(fatura.getCliente()));
    }
}
