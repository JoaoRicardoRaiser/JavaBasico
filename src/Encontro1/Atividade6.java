/*
Objetivo: utilizar operadores matemáticos e condicionais.

Crie um programa que receba três notas de um aluno e calcule sua média.

Regras:
- Média maior ou igual a 7: aprovado.
- Média maior ou igual a 5 e menor que 7: recuperação.
- Média menor que 5: reprovado.
Exemplo:
Nota 1: 8
Nota 2: 6
Nota 3: 7

Média: 7.0
Situação: Aprovado
*/

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();

    double somaNotas = nota1 + nota2 + nota3;
    double media = somaNotas / 3;

    if(media >= 7){
        System.out.println("Aprovado");
    }
    else if(media >= 5 && media < 7){
        System.out.println("Recuperação");
    }
    else if(media < 5){
        System.out.println("Reprovado");
    }
}
