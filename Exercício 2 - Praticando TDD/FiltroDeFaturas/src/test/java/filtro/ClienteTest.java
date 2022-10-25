package filtro;

import fatura.Cliente;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class ClienteTest {

    @Test
    public void teste() {
        Cliente cliente = new Cliente("Guilherme Coelho", new Date(2022, 11, 30), "PE");

        Assert.assertEquals("Guilherme Coelho", cliente.getNome());
        Assert.assertEquals(new Date(2022, 11, 30), cliente.getData());
        Assert.assertTrue("PE".equals(cliente.getEstado()));
    }

}
