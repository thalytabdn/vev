package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculadora.Calculadora;
import calculadora.Cargo;
import calculadora.Funcionario;

public class CalculadoraTets {
  Funcionario desenvolvedor1 = new Funcionario("12345685412", "Desenvolvedor 1", "dev1@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);

  Funcionario desenvolvedor2 = new Funcionario("45874569852", "Desenvolvedor 2", "dev2@gmail.com", 2530.80, Cargo.DESENVOLVEDOR);

  Funcionario dba1 = new Funcionario("74512365895", "DBA 1", "dba1@gmail.com", 3520.80, Cargo.DBA);

  Funcionario dba2 = new Funcionario("74512365895", "DBA 1", "dba1@gmail.com", 1850.20, Cargo.DBA);
  
  
  Calculadora calculadora = new Calculadora();
  
  @Test
  public void criaFuncionarioTest() {
    assertEquals(this.desenvolvedor1.getId(), "12345685412");
    assertEquals(this.desenvolvedor1.getNome(), "Thalyta Nascimento");
    assertEquals(this.desenvolvedor1.getEmail(), "thalyta@gmail.com");
    assertTrue(this.desenvolvedor1.getSalario() == 6520.80);
    assertEquals(this.desenvolvedor1.getCargo(), Cargo.DESENVOLVEDOR);
  }

  @Test
  public void calculaSalarioDesenvolvedorTest(){
    Cargo cargo1 = this.desenvolvedor1.getCargo();
    double salario1 = this.desenvolvedor1.getSalario();

    assertEquals(this.calculadora.calculaSalario(cargo1, salario1), (salario1 - (salario1 * 0.20)), 0) ;  

    Cargo cargo2 = this.desenvolvedor2.getCargo();
    double salario2 = this.desenvolvedor2.getSalario();

    assertEquals(this.calculadora.calculaSalario(cargo2, salario2),salario2 - (salario2 * 0.10), 0 );
  }

  @Test
  public void calculaSalarioDBATest(){
    Cargo cargo1 = this.dba1.getCargo();
    double salario1 = this.dba1.getSalario();

    assertEquals(this.calculadora.calculaSalario(cargo1, salario1), (salario1 - (salario1 * 0.20)), 0) ;  

    Cargo cargo2 = this.dba2.getCargo();
    double salario2 = this.dba2.getSalario();

    assertEquals(this.calculadora.calculaSalario(cargo2, salario2),salario2 - (salario2 * 0.10), 0 );
  }
  
}
