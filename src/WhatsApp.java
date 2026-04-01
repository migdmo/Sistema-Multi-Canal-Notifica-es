public class WhatsApp extends CanalNotificacao{
    private String statusLeitura;

    public WhatsApp(String destinatario, String mensagem, String statusLeitura){
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }
    @Override
    public void enviar(){
        System.out.printf("Enviando Zap para [%s]... Mensagem: [%s]\n", this.destinatario, this.mensagem);
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }
}
