import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void enviarNotificacao(CanalNotificacao referencia){
        referencia.enviar();
    }
    public static void main(String[] args){
        ArrayList<CanalNotificacao> canalNotificacoes = new ArrayList<CanalNotificacao>();

        Email e1 = new Email("luisa", "olá", "saudação");
        canalNotificacoes.add(e1);

        Sms s1 = new Sms("cris", "tudo bem?", 1699);
        canalNotificacoes.add(s1);

        WhatsApp wpp1 = new WhatsApp("joão", "como vai?", "Entregue");
        canalNotificacoes.add(wpp1);

        canalNotificacoes.forEach(GerenciadorNotificacoes::enviarNotificacao);
        }
}



//
//Crie uma classe de teste chamada GerenciadorNotificacoes com o seguinte fluxo no main:
//Crie um ArrayList (ou Vetor) do tipo CanalNotificacao.
//Adicione ao menos um objeto de cada tipo (Email, SMS, WhatsApp) a essa lista.
//O ponto alto do exercício: Utilize um laço for ou foreach para percorrer a lista e,
//para cada item, chame o método enviar().