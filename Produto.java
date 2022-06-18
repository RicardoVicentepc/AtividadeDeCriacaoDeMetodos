public class Produto {
String nome;
int codigo;
double precoCusto;
double precoVenda;
int quantidade;
double margemLucro;

//Com parâmetro e com retorno
public int Saida(int quantidade){
    this.quantidade = this.quantidade - quantidade;
    if(quantidade <= this.quantidade){
        System.out.println("Produto disponivel");
    }else{
        System.out.println("Produto Indisponivel");
    }
    return this.quantidade;
}
//Com parâmetro e com retorno
public int Entrada(int quantidade){
    this.quantidade = this.quantidade + quantidade;
    return this.quantidade;
}
//Com parâmetro e com retorno
public double definirPrecoVenda(double valor){
    if(valor >= this.precoCusto){
        System.out.println("Valor valido");
    }else{
        System.out.println("Valor invalido");
    }
    this.precoCusto = valor;
    return this.precoCusto;
}

// Sem parâmetro e sem rotorno
public void calcularPrecoVenda(){
    double lucro = (this.margemLucro * this.precoCusto) / 100;
    this.precoVenda = lucro + this.precoCusto;
}

public void exibirDados(){
    System.out.println("Nome = " + this.nome);
    System.out.println("codigo = " + this.codigo);
    System.out.println("Quantidade = " + this.quantidade);
    System.out.println("Margem de lucro = " + this.margemLucro);
    System.out.println("Preço Custo = " + this.precoCusto);
    System.out.println("Venda total = " + this.precoVenda);
}
}
