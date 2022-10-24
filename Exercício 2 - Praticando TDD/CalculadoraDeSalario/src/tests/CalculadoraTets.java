package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculadora.Calculadora;
import calculadora.Cargo;
import calculadora.Funcionario;

public class CalculadoraTets {
  Funcionario funcionario1 = new Funcionario("12345685412", "Desenvolvedor 1", "dev1@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);

  Funcionario funcionario2 = new Funcionario("12345685412", "Desenvolvedor 2", "dev2@gmail.com", 2530.80, Cargo.DESENVOLVEDOR);
  
  Calculadora calculadora = new Calculadora();
  
  @Test
  public void criaFuncionarioTest() {
    assertEquals(this.funcionario1.getId(), "12345685412");
    assertEquals(this.funcionario1.getNome(), "Thalyta Nascimento");
    assertEquals(this.funcionario1.getEmail(), "thalyta@gmail.com");
    assertTrue(this.funcionario1.getSalario() == 6520.80);
    assertEquals(this.funcionario1.getCargo(), Cargo.DESENVOLVEDOR);
  }

  @Test
  public void calculaSalarioDesenvolvedorTest(){
    Cargo cargo1 = this.funcionario1.getCargo();
    double salario1 = this.funcionario1.getSalario();

    assertEquals(this.calculadora.calculaSalario(cargo1, salario1), (salario1 - (salario1 * 0.20)), 0) ;  

    Cargo cargo2 = this.funcionario2.getCargo();
    double salario2 = this.funcionario2.getSalario();

    assertEquals(this.calculadora.calculaSalario(cargo2, salario2),salario2 - (salario2 * 0.10), 0 );

  }
  
}
