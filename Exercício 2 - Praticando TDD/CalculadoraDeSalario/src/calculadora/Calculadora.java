package calculadora;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculadora {
  private HashMap<String, Funcionario> funcionarios;

  public Calculadora() {
    this.funcionarios = new HashMap<>();
  }

  public void addFuncionario(String id, String nome, String email, double salario,  Cargo cargo){
    Funcionario funcionario = new Funcionario(id, nome, email, salario, cargo);
    this.funcionarios.put(id, funcionario);
  }

  public boolean funcionarioExiste(String id){
    return this.funcionarios.containsKey(id);
  }

  public Funcionario getFuncionario(String id){
    if(this.funcionarios.containsKey(id)){
      return this.funcionarios.get(id);
    }else{
      throw new NullPointerException("Funcionário não cadastrado.");
    }
  }

  public int getQtdFuncionarios(){
    return this.funcionarios.size();
  }

  public double calculaSalario(String id){
    Funcionario funcionario = getFuncionario(id);
    Cargo cargo = funcionario.getCargo();
    double salario = funcionario.getSalario();

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
