public class Conta {
    String nome;
    double saldo;
    double limiteChequeEspecial;
    public void abreConta(String nome, double saldo, double limiteChequeEspecial) {
        this.nome = nome;
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public void depositaValor(double valor) {
        this.saldo = this.saldo + valor;
    }
    public void retiraValor(double valor) {
        this.saldo = this.saldo + this.limiteChequeEspecial;
        if(valor > this.saldo){
            System.out.println("saldo insuficiente");
        }else{
            this.saldo = this.saldo - valor;
        }
    }
    public double retiraValor2(double valor) {
        if(valor > this.saldo){
            System.out.println("Sem saldo na conta");
        }else{
            this.saldo -= valor;
            System.out.println("Valor sacado = " + valor);
        }
        return this.saldo;
    }
    public double exibirSaldo() {
        return this.saldo;
    }
}
