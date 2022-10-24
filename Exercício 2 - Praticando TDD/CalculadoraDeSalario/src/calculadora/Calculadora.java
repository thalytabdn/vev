package calculadora;

public class Calculadora {

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

    return salarioLiquido;
  }
  
}
