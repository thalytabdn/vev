package filtro;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class FaturaTest {

    @Test
    public void teste() {
        Cliente cliente = new Cliente("Guilherme Coelho", new Date(2022, 11, 30));
        Fatura fatura = new Fatura("0000000000", 20.50, new Date(2022, 12, 31), cliente);

        Assert.assertEquals(fatura.valor, 20.50);
    }
}
