package dio.primeiro_passos.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    @Override
    public void run (String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome() + "\n E-mail: " + remetente.getEmail() + "\nCom telefone para contato:  " + remetente.getTelefones());
        System.out.println("Seu Cadastro foi realizado com sucesso!");
    }

    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente TechTeam;
    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Cadastro confirmado com sucesso!");
    }
    public void enviarMensagemBoasVindas() {
        TechTeam.setEmail("email@gmail.com.br");
        System.out.println(TechTeam);
        System.out.println("Bem-vindo ao Tech Elite!");
    }

}
