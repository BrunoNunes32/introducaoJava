import java.util.Scanner; //BIBLIOTECA PARA UTILIZAR O TECLADO COMO ENTRADA DE DADOS

class Main {
  public static void main(String[] args) {

    // AULA CLASSE STRING 03/06
    // String valor = "Descomplica - Java";
    // System.out.println(valor);
    // System.out.println(valor.contains("Java"));
    // System.out.println(valor.length());
    // System.out.println(valor.replace("Java", "C"));
    // System.out.println(valor.replace("Java", "C").length());

    // AULA ENTRADA E SAIDA DE DADOS 04/6
    // String palavra;
    // Scanner entrada = new Scanner(System.in);
    // System.out.print("Informe o seu nome: ");
    // palavra = entrada.next();
    // System.out.println("Você diz que se chama " + palavra);

    // AULA OPERADORES ARITMETICOS 05/06
    // double numA, numB, total;
    // numA = 8;
    // numB = 3;
    // total = numA + numB;//SOMA
    // System.out.println(total);
    // total = numA * numB;//MULTIPLICAÇÃO
    // System.out.println(total);
    // total = numA % 2;//RESTO
    // System.out.println(total);
    // total = numA / numB;//DIVISÃO

    // AULA ESTRUTURA SEQUENCIAL 06/06
    // double base, altura, area;
    // base = 10;
    // altura = 8;
    // area = (base * altura) / 2;//CALCULANDO A AREA DO TRIANGULO
    // System.out.println(area);

    // DESAFIO 01: FAZER TODAS AREAS DAS FIGURAS GEOMETRICAS COM ENTRADA DE DADOS, ELE INFORMANDO O NOME E IDADE
    Scanner entrada = new Scanner(System.in);
    double base, altura;
    String nome;
    int idade;

    System.out.print("Informe o seu nome: ");
    nome = entrada.next();
    System.out.print("Informe a sua idade: ");
    idade = entrada.nextInt();

    System.out.print("Informe a base: ");
    base = entrada.nextDouble();
    System.out.print("Informe a altura: ");
    altura = entrada.nextDouble();
    entrada.close(); //FECHANDO A ENTRADA DE DADOS
    System.out.println("Bem vindo, " + nome + "!");
    System.out.println("A sua idade é " + idade + " anos." + "!");
    
    //O CALCULO PODE SER FEITO DIRETAMENTE NO PRINT, POIS NÃO QUERO ARMAZENAR NENHUM VALOR
    System.out.println("A area do triangulo é: " + (base * altura) / 2); // CALCULANDO A AREA DO TRIANGULO
    System.out.println("A area do retangulo é: " + (base * altura)); // CALCULANDO A AREA DO RETANGULO
    System.out.println("A area do quadrado é: " + (base * base)); // CALCULANDO A AREA DO QUADRADO
    System.out.println("A area do circulo é: " + (3.14 * (base * base))); // CALCULANDO A AREA DO CIRCULO
    System.out.println("A area do parelelograma é: " + (base * altura)); // CALCULANDO A AREA DO PARALELOGRAMA
  }

}