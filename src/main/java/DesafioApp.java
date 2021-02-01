import java.util.Arrays;
import java.util.List;

public class DesafioApp {

    public static void main(String[] args) {
        final List<String> emails = Arrays.asList("a@a", "b@b", "c@c");
        final List<Item> items = Arrays.asList(new Item("TV", 100, 1, UnidadeVenda.UNIDADE));

        final DesafioService desafioService = new DesafioService();
        System.out.println(desafioService.calcular(items, emails)); // printa o resultado
    }
}
