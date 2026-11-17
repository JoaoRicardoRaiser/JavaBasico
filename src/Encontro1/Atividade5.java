/*
Objetivo: trabalhar com condicionais e operadores relacionais.

Crie um programa que receba a idade de uma pessoa e informe:
- Menor de idade: abaixo de 18 anos.
- Maior de idade: 18 anos ou mais.
Desafio adicional: classifique também:
- Criança: até 12 anos.
- Adolescente: de 13 a 17 anos.
- Adulto: de 18 a 59 anos.
- Idoso: 60 anos ou mais.
*/

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idadeDigitada = scanner.nextInt();

    if(idadeDigitada <= 12){
        System.out.println("Criança");
    }
    else if(idadeDigitada <= 17){
        System.out.println("Adolescente");
    }
    else if (idadeDigitada <= 59) {
        System.out.println("Adulto");
    }
    else {
        System.out.println("Idoso");
    }
}
