package bootcampdhw4spring2.diploma.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {
    private String nome;
    private HashMap<String, Double> disciplinas;

    public double calculaMedia() {
        double media;
        int contador = 0;
        double soma = 0;

        // somando as notas usando for
//        for (Map.Entry<String, Double> disciplina : disciplinas.entrySet()) {
//            Double nota = disciplina.getValue();
//            soma += nota;
//            contador += 1;
//        }


        // somando as notas usando API stream
//        BinaryOperator<Double> func = (ans, i) -> ans + i;
        soma = disciplinas.values().stream().reduce((double) 0, (ans, i) -> ans + i);
        contador = (int) disciplinas.values().stream().count();

        media = soma / contador;
        return media;
    }

}
