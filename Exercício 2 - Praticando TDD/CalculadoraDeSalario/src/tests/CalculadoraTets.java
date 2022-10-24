package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculadora.Cargo;
import calculadora.Funcionario;

public class CalculadoraTets {

  @Test
  public void criaFuncionarioTest() {
    Funcionario funcionario = new Funcionario("12345685412", "Thalyta Nascimento", "thalyta@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);
    assertEquals(funcionario.getId(), "12345685412");
    assertEquals(funcionario.getNome(), "Thalyta Nascimento");
    assertEquals(funcionario.getEmail(), "thalyta@gmail.com");
    assertTrue(funcionario.getSalario() == 6520.80);
    assertEquals(funcionario.getCargo(), Cargo.DESENVOLVEDOR);
  }
  
}
