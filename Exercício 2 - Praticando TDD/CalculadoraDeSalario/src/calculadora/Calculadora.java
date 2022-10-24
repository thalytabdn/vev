package calculadora;

public class Calculadora {

  public double calculaSalario(Cargo cargo, double salario){
    double salarioLiquido = 0;
    if(cargo.equals(Cargo.DESENVOLVEDOR) && salario >= 3000){
      salarioLiquido = salario - (salario * 0.20);
    }

    return salarioLiquido;
  }
  
}
