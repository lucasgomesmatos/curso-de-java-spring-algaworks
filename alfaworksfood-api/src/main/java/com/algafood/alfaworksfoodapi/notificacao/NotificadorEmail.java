package com.algafood.alfaworksfoodapi.notificacao;
import com.algafood.alfaworksfoodapi.modelo.Cliente;;

public class NotificadorEmail  implements Notificador{

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail ");
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta) mensagem = mensagem.toUpperCase();

        System.out.printf("Notificando %s através do email %s usando o SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp ,mensagem
        );
    }
}
