package bootcampdhw4spring2.diploma.Controller;

import bootcampdhw4spring2.diploma.Model.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {

    @GetMapping
    public String getOkay() {
        return "Okay";
    }

    @PostMapping("/Aluno")
    public ResponseEntity<String> avaliarAluno(@RequestBody Aluno aluno) {
        double media = aluno.calculaMedia();
        if (media >= 9) {
            return ResponseEntity.ok("Parabéns! Você passou de ano. Sua média foi: " + media);
        }
        return ResponseEntity.ok("Que pena. Você ficou de recuperação. Sua média foi: " + media);
    }

}
