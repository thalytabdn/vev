package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculadora.Calculadora;
import calculadora.Cargo;
import calculadora.Funcionario;

public class CalculadoraTets {
  Funcionario funcionario = new Funcionario("12345685412", "Thalyta Nascimento", "thalyta@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);
  Calculadora calculadora = new Calculadora();
  
  @Test
  public void criaFuncionarioTest() {
    assertEquals(this.funcionario.getId(), "12345685412");
    assertEquals(this.funcionario.getNome(), "Thalyta Nascimento");
    assertEquals(this.funcionario.getEmail(), "thalyta@gmail.com");
    assertTrue(this.funcionario.getSalario() == 6520.80);
    assertEquals(this.funcionario.getCargo(), Cargo.DESENVOLVEDOR);
  }

  @Test
  public void calculaSalarioDesenvolvedorTest(){
    Cargo cargo = this.funcionario.getCargo();
    double salario = this.funcionario.getSalario();

    assertTrue(this.calculadora.calculaSalario(cargo, salario) == (salario - (salario * 0.20))) ;    

  }
  
}
