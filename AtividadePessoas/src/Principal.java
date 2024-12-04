import javax.swing.JOptionPane;

public class Principal {

    private static final String MENU = "Menu de opções: \n"
            + "1. Mostrar maior salário \n"
            + "2. Mostrar menor salário \n"
            + "3. Pegar por ID \n"
            + "4. Sair";

    public static void main(String[] args) {
        Pessoas[] vetPessoa;

        
        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas deseja cadastrar?"));
        vetPessoa = new Pessoas[numPessoas];

        
        for (int i = 0; i < numPessoas; i++) {
            Pessoas pessoa = new Pessoas();

            pessoa.setId(i); 
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            pessoa.setNome(nome);

            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário da pessoa " + (i + 1) + ":"));
            pessoa.setSalario(salario);

            vetPessoa[i] = pessoa;
        }

        
        String op = "";
        while (!op.equals("4")) {
            op = JOptionPane.showInputDialog(MENU);

            switch (op) {
                case "1":
                    Pessoas maiorSalarioPrint = maiorSalario(vetPessoa);
                    JOptionPane.showMessageDialog(null, "Pessoa com maior salário:\n" + maiorSalarioPrint);
                    break;

                case "2":
                    Pessoas menorSalarioPrint = menorSalario(vetPessoa);
                    JOptionPane.showMessageDialog(null, "Pessoa com menor salário:\n" + menorSalarioPrint);
                    break;

                case "3":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID que deseja pegar:"));
                    if (id >= 0 && id < vetPessoa.length) {
                        Pessoas pegarId = getById(vetPessoa, id);
                        JOptionPane.showMessageDialog(null, "Pessoa encontrada:\n" + pegarId);
                    } else {
                        JOptionPane.showMessageDialog(null, "ID inválido!");
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "SAINDO.....");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Número inválido");
            }
        }
    }

    public static Pessoas maiorSalario(Pessoas[] vetPessoa) {
        Pessoas pessoaComMaior = vetPessoa[0];
        for (int i = 1; i < vetPessoa.length; i++) {
            if (vetPessoa[i] != null && vetPessoa[i].getSalario() > pessoaComMaior.getSalario()) {
                pessoaComMaior = vetPessoa[i];
            }
        }
        return pessoaComMaior;
    }

    public static Pessoas menorSalario(Pessoas[] vetPessoa) {
        Pessoas pessoaComMenor = vetPessoa[0];
        for (int i = 1; i < vetPessoa.length; i++) {
            if (vetPessoa[i] != null && vetPessoa[i].getSalario() < pessoaComMenor.getSalario()) {
                pessoaComMenor = vetPessoa[i];
            }
        }
        return pessoaComMenor;
    }

    public static Pessoas getById(Pessoas[] vetPessoa, int id) {
        return vetPessoa[id];
    }
}
