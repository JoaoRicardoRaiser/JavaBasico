/*
Objetivo: aprender a declarar variáveis e exibir informações.

Crie um programa que armazene:
    - Nome.
    - Idade.
    - Cidade.
    - Profissão.
Exiba todas as informações no console, utilizando System.out.println().

Exemplo de saída:
Olá! Meu nome é Ana.
Tenho 22 anos.
Moro em Blumenau.
Minha profissão é estudante.
*/
void main() {
    String nome = "João";
    int idade = 26;
    String cidade = "Blumenau";
    String profissao = "Software Engineer";

    System.out.println("Olá! Meu nome é " + nome);
    System.out.println("Tenho " + idade + "anos");
    System.out.println("Moro em " + cidade);
    System.out.println("Minha profissão é " + profissao);
}