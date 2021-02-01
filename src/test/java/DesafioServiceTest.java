import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class DesafioServiceTest {

    DesafioService desafioService = new DesafioService();

    @Test
    void testarCalculo(){
        List<String> emails = Arrays.asList("a@a", "b@b", "c@C");
        final List<Item> items = criarItens();

        final Map<String, Integer> calcular = desafioService.calcular(items, emails);
        System.out.println(calcular);

        Assertions.assertEquals(calcular.size(), 3);
    }

    List<Item> criarItens(){
        final Item item1 = new Item("TV", 200000, 10, UnidadeVenda.UNIDADE);
        final Item item2 = new Item("Mouse", 4000, 2, UnidadeVenda.UNIDADE);
        final Item item3 = new Item("Fio", 100, 100, UnidadeVenda.PACOTE);
        final Item item4 = new Item("Teclado", 20000, 5, UnidadeVenda.UNIDADE);

        return  Arrays.asList(item1, item2, item3, item4);
    }

}