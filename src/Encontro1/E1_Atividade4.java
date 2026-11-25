/*
Objetivo: introduzir condicionais e operador módulo (%).

Crie um programa que receba um número inteiro e informe se ele é par ou ímpar.

Exemplo:
Número: 8
O número 8 é par.
*/

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    var numeroDigitado = scanner.nextInt();

    var restoDaDivisao = numeroDigitado % 2;

    boolean ehPar = restoDaDivisao == 0;

    if(ehPar){
        System.out.println(numeroDigitado + " é par");
    }
    else {
        System.out.println(numeroDigitado + " é ímpar");
    }
}
