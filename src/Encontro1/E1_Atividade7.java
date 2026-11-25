/*
Objetivo: combinar variáveis, operadores matemáticos e condicionais.

Crie um programa para calcular o valor final de uma compra.

Regras:
- Compras abaixo de R$ 100: sem desconto.
- Compras de R$ 100 até R$ 499,99: 5% de desconto.
- Compras de R$ 500 até R$ 999,99: 10% de desconto.
- Compras de R$ 1.000 ou mais: 15% de desconto.
Exemplo:
Valor da compra: R$ 600,00
Desconto aplicado: 10%
Valor do desconto: R$ 60,00
Valor final: R$ 540,00
*/

void main() {
    var scanner = new Scanner(System.in);

    System.out.print("Digite o valor em R$: ");
    var valorCompra = scanner.nextDouble();

    if(valorCompra < 100){
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: 0%");
        System.out.println("Valor do desconto: R$0");
        System.out.println("Valor final: R$ " + valorCompra);

    }
    else if (valorCompra <= 499.99){
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: 5%");

        var desconto = valorCompra * 0.05;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + (valorCompra - desconto));
    }
    else if (valorCompra <= 999.99){
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: 10%");

        var desconto = valorCompra * 0.10;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + (valorCompra - desconto));
    }
    else {
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: 15%");

        var desconto = valorCompra * 0.15;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + (valorCompra - desconto));
    }
}
