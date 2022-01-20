package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int a, float b){
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        } else{
            return 0;
        }
    }

    public void imprimirDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Nao existe divisao por 0");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 76;
        System.out.println("Dentro do AlteraNumeros");
        System.out.println("num1 "+ num1);
        System.out.println("num2 "+ num2);
    }

    public void somaArray(int[] numeros){
            int soma = 0;
            for (int num: numeros){
                soma += num;
            }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
            int soma = 0;
            for (int num: numeros){
                soma += num;
            }
            System.out.println(soma);
    }

}
