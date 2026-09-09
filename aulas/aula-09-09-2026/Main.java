import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    Endereco endereco = new Endereco();

    void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco.rua + ", " + endereco.numero + " - " + endereco.cidade + "/" + endereco.estado + " - CEP: " + endereco.cep);
    }
}

class Endereco {
    String rua;
    int numero;
    String cidade;
    String cep;
    String estado;
}

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome: ");
        pessoa.nome = entrada.nextLine();
        System.out.print("Digite a idade: ");
        pessoa.idade = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("Digite a rua: ");
        pessoa.endereco.rua = entrada.nextLine();
        System.out.print("Digite o número: ");
        pessoa.endereco.numero = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite a cidade: ");
        pessoa.endereco.cidade = entrada.nextLine();
        System.out.print("Digite o estado: ");
        pessoa.endereco.estado = entrada.nextLine();
        System.out.print("Digite o CEP: ");
        pessoa.endereco.cep = entrada.nextLine();
        pessoa.print();
    }
}
