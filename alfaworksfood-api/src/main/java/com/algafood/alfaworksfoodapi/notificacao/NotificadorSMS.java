package com.algafood.alfaworksfoodapi.notificacao;
import com.algafood.alfaworksfoodapi.modelo.Cliente;
import org.springframework.stereotype.Component;;

@Component
public class NotificadorSMS  implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone() ,mensagem
        );
    }
}