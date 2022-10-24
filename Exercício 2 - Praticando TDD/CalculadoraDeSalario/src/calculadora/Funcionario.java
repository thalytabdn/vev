package calculadora;
public class Funcionario {
  private String id;
  private String nome;
  private String email;
  private double salario;
  private Cargo cargo;

  public Funcionario(String id, String nome, String email, double salario,  Cargo cargo) {
    this.id =  id;
    this.nome = nome;
    this.email = email;
    this.salario = salario;
    this.cargo = cargo;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Cargo getCargo() {
    return this.cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  
}
