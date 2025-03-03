package dio.primeiro_passos.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
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
