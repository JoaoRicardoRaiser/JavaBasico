/*
Objetivo: trabalhar com operações matemáticas e tipos de dados.

Crie um programa que converta uma temperatura de Celsius para Fahrenheit.

Utilize a fórmula:
\[
F = (C x 1.8) + 32
\]

Exemplo:
Temperatura em Celsius: 25
Temperatura em Fahrenheit: 77
*/

void main() {
    int temperaturaCelsius = 25;
    double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

    System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
    System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

}
