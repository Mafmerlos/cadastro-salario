import java.util.Objects;

public class Pessoas {
    private int id;
    private String nome;
    private double salario;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, salario);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoas other = (Pessoas) obj;
        return id == other.id && Objects.equals(nome, other.nome)
                && Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
    }
    
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
    }




}