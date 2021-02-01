import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesafioService {

    public Map<String, Integer> calcular(final List<Item> itens, final List<String> emails){
        int soma = somarItens(itens);
        int qtdEmails = emails.size();
        final int valorEmail = soma / qtdEmails;

        Map<String, Integer> listCompras = new HashMap<>();

        for (int i = 0; i < emails.size(); i++) {
            int mod = soma % qtdEmails;

            if ((mod > 0) && (i == (emails.size()-1))) {
                listCompras.put(emails.get(i), valorEmail+mod);
            } else {
                listCompras.put(emails.get(i), valorEmail);
            }
        }
        return listCompras;
    }

    private int somarItens(final List<Item> itens){
         int soma = 0;
         for (final Item item: itens) {
             soma += item.calcularItem();
         }

         return soma;
     }
}
