@FunctionalInterface
 interface ServicoMensagem {
    void enviarMensagem(String mensagem);
 }

 public class EnviadorMensagens {
    public static void main(String[] args) {
        String mensagem = "Somente este mês promoção imperdível para você!";

        ServicoMensagem sms = msg -> System.out.println("Enviando SMS: " + msg);
        ServicoMensagem email = msg -> System.out.println("Enviando E-mail: " + msg);
        ServicoMensagem redes = msg -> System.out.println("Enviando Redes Sociais: " + msg);
        ServicoMensagem whatsapp = msg -> System.out.println("Enviando Whatsapp: " + msg);

        sms.enviarMensagem(mensagem);
        email.enviarMensagem(mensagem);
        redes.enviarMensagem(mensagem);
        whatsapp.enviarMensagem(mensagem);
    }
 }