import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto(); // constrói padrão;

        System.out.println("Entre com os dados do Produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.print("quantidade: ");
        produto.quantidade = sc.nextInt();
        System.out.println(produto);

        System.out.println("Você deseja adicionar ou remover?");
        System.out.println("Para sair - Digite 0");
        System.out.println("Para Adicionar - Digite 1");
        System.out.println("Para Remover - Digite 2");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                break;
            case 1:
                System.out.println("Informe a quantidade a adicionar no estoque: ");
                int quantidade = sc.nextInt();
                produto.addProduto(quantidade);
                System.out.println(produto);
                break;
            case 2:
                System.out.println("Informe a quantidade a remover do estoque: ");
                quantidade = sc.nextInt();
                produto.removeProduto(quantidade);
                System.out.println(produto);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
