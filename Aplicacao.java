import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Produto p1 = new Produto();
        /*System.out.println("Insira o nome do produto!!");
        p1.nome = in.nextLine();
        System.out.println("Insira o codigo do produto!");
        p1.codigo = in.nextInt();
        System.out.println("Insira o preço custo!");
        p1.precoCusto = in.nextDouble();
        System.out.println("Insira a quantidade!");
        p1.quantidade = in.nextInt();
        System.out.println("Insira a margem de lucro!");
        p1.margemLucro = in.nextDouble();
        System.out.println("Insira o preço da venda");
        p1.definirPrecoVenda(in.nextDouble());
        p1.calcularPrecoVenda();
        System.out.println("Insira a entrada de unidades");
        p1.Entrada(in.nextInt());
        System.out.println("Insira a saida de unidades");
        p1.Saida(in.nextInt());
        in.close();*/
        p1.nome = "Doce de leite mimoso";
        p1.codigo = 1212;
        p1.precoCusto = 25.80;
        p1.margemLucro = 20;
        p1.quantidade = 30;
        p1.definirPrecoVenda(25.80);
        p1.calcularPrecoVenda();
        p1.Entrada(70);
        p1.Saida(40);
        p1.exibirDados();
    }
}
