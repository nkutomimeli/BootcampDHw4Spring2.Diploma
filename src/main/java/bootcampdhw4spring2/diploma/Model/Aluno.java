package bootcampdhw4spring2.diploma.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

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

        for (Map.Entry<String, Double> disciplina : disciplinas.entrySet()) {
            Double nota = disciplina.getValue();
            soma += nota;
            contador += 1;
        }

        media = soma / contador;
        return media;
    }

}
