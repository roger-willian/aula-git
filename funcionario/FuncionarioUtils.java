package funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioUtils {
    public static List<Funcionario> criarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Cidcley", 1250.0));
        funcionarios.add(new Funcionario("Adegilson", 2450.0));
        funcionarios.add(new Funcionario("Evalnei", 4790.0));
        return funcionarios;
    }

    public static double somarSalariosFuncionarios(List<Funcionario> funcionarios) {
        return funcionarios.stream()
            .map(funcionario -> funcionario.getSalario())
            .reduce(0.0, Double::sum);
    }

    public static void printarNomesFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("\n=-=-=-= Funcionários =-=-=-= ");
        funcionarios.forEach(funcionario -> System.out.println(funcionario.getNome()));
    }
}