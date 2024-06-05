import java.util.Scanner;
public class Att4Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor, maior, mudanca1, mudanca2, mudanca3, tam = 0;
        double soma = 0;

        System.out.println("Escolha um tamanho para seu vetor: ");
        tam = scanner.nextInt();

        if (tam <= 0) { // garantir valor positivo e maior que zero

            while (tam <= 0) {
                System.out.println("Escolha um valor positivo e maior que zero !");

                System.out.println("ERRO! Tente de novo: ");
                tam = scanner.nextInt();
            }
        }
        int [] vetor = new int[tam];

        System.out.println("Digite os valores pertencentes a esse vetor: ");

        for (int i = 0; i < tam; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
        menor = vetor[0];
        maior = vetor[0];
        for (int i = 0; i < tam; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        System.out.println("Estes são os valores que você escolheu: ");

        for (int i = 0; i < tam; i++) {
            System.out.println("[" + (i + 1) + "] = " + vetor[i]);
        }
        System.out.println("A soma deles é: " + soma );

        System.out.println("A média deles é: " + (soma / tam) );

        System.out.println("O menor número do vetor é: " + menor );

        System.out.println("O maior número do vetor é: " + maior);

        System.out.println("Para substituir 2 valores do seu vetor digite 1(um), caso queira parar a simulação digite 0 (zero)");
        mudanca1 = scanner.nextInt();
        if (mudanca1 < 0 || mudanca1 > 1 ) {

            while (mudanca1 < 0 || mudanca1 > 1) {
                System.out.println("ERRO! Número inválido! Tente novamente: ");
                mudanca1 = scanner.nextInt();
            }
        }
        if (mudanca1 == 1) {
            System.out.println("Estes são os vetores que podem ser modificados: ");
            for (int i = 0; i < tam; i++) {
                System.out.println("[" + (i + 1) + "] = " + vetor[i]);
            }
            System.out.println("Digite o primeiro número que você quer mudar: ");
            mudanca2 = scanner.nextInt();
            if (mudanca2 > tam || mudanca2 < 1) {

                while (mudanca2 > tam || mudanca2 < 1) {
                    System.out.println("O valor não pode ser encontrado no vetor! Tente novamente:");
                    mudanca2 = scanner.nextInt();
                }
            }
            System.out.println("Valor [" + mudanca2 + "] encontrado! Escolha um novo valor para ele: ");
            mudanca2--;
            mudanca3 = scanner.nextInt();
            vetor[mudanca2] = mudanca3;

            System.out.println("Decida o segundo número que você quer mudar: ");
            mudanca2 = scanner.nextInt();
            if (mudanca2 > tam || mudanca2 < 1) {
                while (mudanca2 > tam || mudanca2 < 1) {
                    System.out.println("O valor não pode ser encontrado no vetor! Tente de novo:");
                    mudanca2 = scanner.nextInt();
                }
            }
            System.out.println("Valor [" + mudanca2 + "] encontrado! Escolha um novo valor para ele: ");
            mudanca2--;
            mudanca3 = scanner.nextInt();
            vetor[mudanca2] = mudanca3;
            System.out.println("O novo vetor, após as mudanças ficou:  ");
            for (int i = 0; i < tam; i++) {
                System.out.println("[" + (i + 1) + "] = " + vetor[i]);
            }
            soma = 0;

            for (int x = 0; x < tam; x++) {
                soma += vetor[x];
            }
            menor = vetor[0];
            maior = vetor[0];

            for (int i = 0; i < tam; i++) {
                if (menor > vetor[i]) {
                    menor = vetor[i];
                }
                if (maior < vetor[i]) {
                    maior = vetor[i];
                }
            }
            System.out.println("A soma de todos os valores inseridos é: " + soma );

            System.out.println("E a média é:" + (soma / tam) );

            System.out.println("O menor valor do vetor é: " + menor );

            System.out.println("E o maior valor é:" + maior );
        }
    }
}
