package tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTets {

  Calculadora calculadora;

  @Test
  public void criaFuncionarioTest() {
    this.calculadora = new Calculadora();
    Funcionario funcionario = newFuncionario("12345685412", "Thalyta Nascimento", "thalyta@gmail.com", 6520.80, cargo.DESENVOLVEDOR);
    assertEquals(funcionario.nome, "Thalyta Nascimento");
  }
  
}
