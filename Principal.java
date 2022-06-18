import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Conta ContaSimplificada = new Conta();

        System.out.println("Insira o nome");
        ContaSimplificada.nome = in.nextLine();

        System.out.println("Insira o saldo");
        ContaSimplificada.saldo = in.nextDouble();

        System.out.println("Digite o limite da conta");
        ContaSimplificada.limiteChequeEspecial = in.nextDouble();

        System.out.println("Deseja depositar algo na conta? sim=0 não=1");
        int ver = in.nextInt();
        if(ver == 0){
            System.out.println("Insira quanto deseja depositar");
            ContaSimplificada.depositaValor(in.nextDouble());
        }
        System.out.println("Deseja sacar qual quantia?");
        ContaSimplificada.retiraValor(in.nextDouble());

        System.out.println("Saldo atual da sua conta = " + ContaSimplificada.exibirSaldo());
        
    }
}