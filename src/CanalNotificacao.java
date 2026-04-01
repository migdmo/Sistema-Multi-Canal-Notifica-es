public abstract class CanalNotificacao {
    protected String destinatario, mensagem;

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "CanalNotificacao{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
    public void exibirDados(){
        System.out.println("destinatario:  " + this.destinatario +
                "mensagem: " + this.mensagem);
    }
    public abstract void enviar();
}
