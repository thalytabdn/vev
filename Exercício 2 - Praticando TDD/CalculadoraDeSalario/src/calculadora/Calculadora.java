package calculadora;

import java.util.ArrayList;

public class Calculadora {
  private ArrayList<Funcionario> funcionarios;

  public Calculadora() {
    this.funcionarios = new ArrayList<>();
  }

  public void addFuncionario(String id, String nome, String email, double salario,  Cargo cargo){
    Funcionario funcionario = new Funcionario(id, nome, email, salario, cargo);
    this.funcionarios.add(funcionario);
  }

  public int getQtdFuncionarios(){
    return this.funcionarios.size();
  }

  public double calculaSalario(Cargo cargo, double salario){
    double salarioLiquido = 0;
    if(cargo.equals(Cargo.DESENVOLVEDOR) && salario >= 3000){
      salarioLiquido = salario - (salario * 0.20);
    }
    else if(cargo.equals(Cargo.DESENVOLVEDOR) && salario < 3000){
      salarioLiquido = salario - (salario * 0.10);
    }
    else if(cargo.equals(Cargo.DBA) && salario >= 2000){
      salarioLiquido = salario - (salario * 0.25);
    }
    else if(cargo.equals(Cargo.DBA) && salario < 2000){
      salarioLiquido = salario - (salario * 0.15);
    }
    else if(cargo.equals(Cargo.TESTADOR) && salario >= 2000){
      salarioLiquido = salario - (salario * 0.25);
    }
    else if(cargo.equals(Cargo.TESTADOR) && salario < 2000){
      salarioLiquido = salario - (salario * 0.15);
    }
    else if(cargo.equals(Cargo.GERENTE) && salario >= 5000){
      salarioLiquido = salario - (salario * 0.30);
    }
    else if(cargo.equals(Cargo.GERENTE) && salario < 5000){
      salarioLiquido = salario - (salario * 0.20);
    }

    return salarioLiquido;
  }
  
}
