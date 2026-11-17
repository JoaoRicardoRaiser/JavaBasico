import java.util.Scanner;

public static void main(String[] args) {

    // Scanner permite ler o que o usuário digita.
    Scanner scanner = new Scanner(System.in);

    // VARIÁVEIS:
    // int = número inteiro
    // double = número decimal
    // String = texto
    // boolean = verdadeiro ou falso

    //var = se adapta ao valor repassado.

//    int idade = 25;
//    double altura = 1.80;
//    String nome = "Ana";
//    boolean estudante = true;
//
//    var sexo = "feminino";
//    var loira = false;
//
//    // Exibe informações no console.
//    System.out.println("Nome: " + nome);
//    System.out.println("Idade: " + idade);
//    System.out.println("Altura: " + altura);
//    System.out.println("Sexo: " + sexo);
//    System.out.println("É estudante: " + estudante);
//    System.out.println("É loira? " + loira);
//
//    // ENTRADA DE DADOS:
//    System.out.print("Digite seu nome: ");
//    String nomeDigitado = scanner.nextLine();
//    System.out.print("Seu nome é: " + nomeDigitado);
//
//    System.out.print("Digite sua idade: ");
//    int idadeDigitada = scanner.nextInt();
//
//    System.out.print("Sua idade é: " + idadeDigitada);

    /*
     OPERAÇÕES MATEMÁTICAS:

     + soma
     - subtração
     * multiplicação
     / divisão
     % resto
     */
//
//    int numero1 = 10;
//    int numero2 = 3;
//
//    int resultadoSoma = numero1 + numero2;
//    int resultadoSubtracao = numero1 - numero2;
//    int resultadoMultiplicacao = numero1 * numero2;
//    int resultadoDivisao = numero1 / numero2;
//    int resultadoResto = numero1 % numero2;
//
//    System.out.println("Soma: " + resultadoSoma);
//    System.out.println("Subtração: " + resultadoSubtracao);
//    System.out.println("Multiplicação: " + resultadoMultiplicacao);
//    System.out.println("Divisão: " + resultadoDivisao);
//    System.out.println("Resto: " + resultadoResto);

    /*
     * OPERADORES DE COMPARAÇÃO
     *
     * Operador | Significado
     * ---------|--------------------
     * ==       | Igual
     * !=       | Diferente
     * >        | Maior que
     * <        | Menor que
     * >=       | Maior ou igual
     * <=       | Menor ou igual
     *
     * ATENÇÃO:
     * =  atribui um valor.
     * == compara dois valores.
     */

//    int numero1 = 10;
//    int numero2 = 10;
//
//    boolean igual = numero1 == numero2;
//    boolean diferente = numero1 != numero2;
//    boolean maiorQue = numero1 > numero2;
//    boolean menorQue = numero1 < numero2;
//    boolean maiorOuIgual = numero1 >= numero2;
//    boolean menorOuIgual = numero1 <= numero2;


    /*
     OPERADORES LÓGICOS

     Operador | Significado
     ---------|------------------------------------------
     &&       | E - todas as condições devem ser verdadeiras.
     ||       | OU - pelo menos uma condição deve ser verdadeira.
     !        | NÃO - inverte o resultado (true/false).


     ESTRUTURAS CONDICIONAIS

     Estrutura | Funcionamento
     ----------|--------------------------------------------
     if        | Executa o bloco se a condição for verdadeira.
     else      | Executa o bloco se a condição do if for falsa.
     else if   | Permite testar uma nova condição.

     */



//    int idadeParaVerificar = 18;
//
//    if (idadeParaVerificar >= 18) {
//        System.out.println("Maior de idade.");
//    } else {
//        System.out.println("Menor de idade.");
//    }

    // Exemplo com mais de duas possibilidades:
    String nome = "Felipe";
    boolean temCabelo = true;
    if(nome == "Felipe" && temCabelo){
        System.out.println("Nome válido e não é careca");
    }
    else {
        System.out.println("Nome inválido");
    }

//    if (media >= 7) {
//        System.out.println("Aprovado");
//    } else if (media >= 5) {
//        System.out.println("Recuperação");
//    } else {
//        System.out.println("Reprovado");
//    }
//
//    // VALIDAÇÃO:
//    // Use condições para impedir valores inválidos.
//    double nota = 8.5;
//
//    if (nota < 0 || nota > 10) {
//        System.out.println("Nota inválida.");
//    } else {
//        System.out.println("Nota válida.");
//    }
//
    scanner.close();
}