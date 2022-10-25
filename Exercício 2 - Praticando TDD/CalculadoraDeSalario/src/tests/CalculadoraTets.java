package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculadora.Calculadora;
import calculadora.Cargo;
import calculadora.Funcionario;

public class CalculadoraTets {
  Funcionario desenvolvedor1 = new Funcionario("12345685412", "Desenvolvedor 1", "dev1@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);

  Funcionario desenvolvedor2 = new Funcionario("45874569852", "Desenvolvedor 2", "dev2@gmail.com", 2530.80, Cargo.DESENVOLVEDOR);

  Funcionario dba1 = new Funcionario("74512365895", "DBA 1", "dba1@gmail.com", 3520.80, Cargo.DBA);

  Funcionario dba2 = new Funcionario("74512365895", "DBA 2", "dba2@gmail.com", 1850.20, Cargo.DBA);

  Funcionario testador1 = new Funcionario("45123654125", "Testador 1", "tester1@gmail.com", 3520.80, Cargo.TESTADOR);

  Funcionario testador2 = new Funcionario("45715236452", "Testador 2", "tester2@gmail.com", 1850.20, Cargo.TESTADOR);

  Funcionario gerente1 = new Funcionario("45123658745", "Gerente 1", "gerente1@gmail.com", 5420.00, Cargo.GERENTE);

  Funcionario gerente2 = new Funcionario("45123654785", "Gerente 2", "gerente2@gmail.com", 4852.00, Cargo.GERENTE);
  
  
  Calculadora calculadora = new Calculadora();
  
  @Test
  public void criaFuncionarioTest() {
    calculadora.addFuncionario("12345685412", "Desenvolvedor 1", "dev1@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);

    assertEquals(calculadora.getQtdFuncionarios(), 1);
  }

  @Test
  public void calculaSalarioDesenvolvedorTest(){
    calculadora.addFuncionario("12345685412", "Desenvolvedor 1", "dev1@gmail.com", 6520.80, Cargo.DESENVOLVEDOR);
    double salario1 = this.desenvolvedor1.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.desenvolvedor1.getId()), (salario1 - (salario1 * 0.20)), 0) ;  

    calculadora.addFuncionario("45874569852", "Desenvolvedor 2", "dev2@gmail.com", 2530.80, Cargo.DESENVOLVEDOR);
    double salario2 = this.desenvolvedor2.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.desenvolvedor2.getId()),salario2 - (salario2 * 0.10), 0 );
  }

  @Test
  public void calculaSalarioDBATest(){
    calculadora.addFuncionario("74512365895", "DBA 1", "dba1@gmail.com", 3520.80, Cargo.DBA);
    double salario1 = this.dba1.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.dba1.getId()), (salario1 - (salario1 * 0.25)), 0) ;  

    calculadora.addFuncionario("74512365895", "DBA 2", "dba2@gmail.com", 1850.20, Cargo.DBA);
    double salario2 = this.dba2.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.dba2.getId()),salario2 - (salario2 * 0.15), 0 );
  }

  @Test
  public void calculaSalarioTestadorTest(){
    calculadora.addFuncionario("45123654125", "Testador 1", "tester1@gmail.com", 3520.80, Cargo.TESTADOR);
    double salario1 = this.testador1.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.testador1.getId()), (salario1 - (salario1 * 0.25)), 0) ;  

    calculadora.addFuncionario("45715236452", "Testador 2", "tester2@gmail.com", 1850.20, Cargo.TESTADOR);
    double salario2 = this.testador2.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.testador2.getId()),salario2 - (salario2 * 0.15), 0 );
  }

  @Test
  public void calculaSalarioGerenteTest(){
    calculadora.addFuncionario("45123658745", "Gerente 1", "gerente1@gmail.com", 5420.00, Cargo.GERENTE);
    double salario1 = this.gerente1.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.gerente1.getId()), (salario1 - (salario1 * 0.30)), 0) ;  
    
    calculadora.addFuncionario("45123654785", "Gerente 2", "gerente2@gmail.com", 4852.00, Cargo.GERENTE);
    double salario2 = this.gerente2.getSalario();

    assertEquals(this.calculadora.calculaSalario(this.gerente2.getId()),salario2 - (salario2 * 0.20), 0 );
  }

  @Test
  public void addFuncionarioDuplicadoTest(){
    calculadora.addFuncionario("45123658745", "Gerente 1", "gerente1@gmail.com", 5420.00, Cargo.GERENTE);

    calculadora.addFuncionario("45123658745", "Gerente 1", "gerente1@gmail.com", 5420.00, Cargo.GERENTE);

    assertEquals(calculadora.getQtdFuncionarios(), 1);
    }

    @Test
    public void verificaSeFuncionarioJaFoiCadastradoTest(){
      calculadora.addFuncionario("45123658745", "Gerente 1", "gerente1@gmail.com", 5420.00, Cargo.GERENTE);

      assertTrue(calculadora.funcionarioExiste(this.gerente1.getId()));
      assertFalse(calculadora.funcionarioExiste("45112222111"));
    }
  
}
