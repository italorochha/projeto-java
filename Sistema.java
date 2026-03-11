        import java.util.Scanner;

        class Pessoa {
        String nome;
        int idade;
        public void calcularAno() {
        int anoAtual = 2026;
        int anoNascimento = anoAtual - idade; 
        System.out.println(nome + " nasceu no ano de " + anoNascimento + ".");
        }
        }
        
        public class Sistema {
        

        public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int continuar = 1; 

        while (continuar == 1) {
        System.out.println("\n MENU PRINCIPAL ");
        System.out.println("1 - Teste maioridade");
        System.out.println("2 - Descobrir ano de nascimento");
        System.out.println("3 - Lista de convidados");
        System.out.println("4 - Sair");
        System.out.println("Escolha uma opcao:");
            
        try {
        int opcao = teclado.nextInt();
        teclado.nextLine();

        switch (opcao) {
        case 1 -> {
            Pessoa pessoa1 = new Pessoa();
            System.out.println("Digite seu nome:");
            pessoa1.nome = teclado.nextLine();
            System.out.println("Digite sua idade:");
            pessoa1.idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Oi, Mundo!? meu nome e: " + pessoa1.nome + " e eu tenho: " + pessoa1.idade + " anos.");
            
        if (pessoa1.idade >= 18) {
                System.out.println("Você ja e maior de idade e pode tirar carteira de motorista!");
            }
        else {
                System.out.println("Você ainda e menor de idade.");
            }
            pessoa1.calcularAno();
                }
                    
       case 2 -> {
           System.out.println("Quantos anos voce tem ou vai fazer este ano?");
           Pessoa pessoaCase2 = new Pessoa();
           pessoaCase2.nome = "Você";
           pessoaCase2.idade = teclado.nextInt();
           pessoaCase2.calcularAno();
                }

        case 3 -> {
            Pessoa[] listaConvidados = new Pessoa[3];
            System.out.println("--- LISTA DE CONVIDADOS VIP ---");
        for (int i = 0; i < listaConvidados.length; i++) {
                listaConvidados[i] = new Pessoa();
                System.out.println("Digite o nome do convidado " + (i + 1) + ":");
                listaConvidados[i].nome = teclado.nextLine();
                System.out.println("Digite a idade do convidado " + (i + 1) + ":");
                listaConvidados[i].idade = teclado.nextInt();
                teclado.nextLine();
            }
            System.out.println("Lista de convidados:");
        for (int i = 0; i < listaConvidados.length; i++) {
                System.out.println((i + 1) + " - " + listaConvidados[i].nome + " (" + listaConvidados[i].idade + " anos)");
            }       }

        case 4 -> {
            System.out.println("Encerrando o sistema...");
            continuar = 0;
                }
                    
        default -> System.out.println("Opcao invalida! Tente novamente.");
        }    
        }
        catch (Exception e) {
        System.out.println("Entrada invalida! Por favor, digite um numero.");
        teclado.nextLine();
        }
        
        
            System.out.println("Programa encerrado. Ate logo!");
        }
        }}