public class AulaVariaveis{
    public static void main (String [] arg){
        int idade;
        idade = 37;
        double salario; 
        salario = 1270.50;
        System.out.println(idade);
        System.out.println(salario);
        double divisao = 3.14/2;
        System.out.println(divisao);
        int outraDivisao = 5/2;
        System.out.println(outraDivisao);
        double novaTentativaDeDivisao= 5/2;  // o interpretador intende isso como divisão de números inteiros
        System.out.println(novaTentativaDeDivisao);
        double ultimaTentativaDivisao = 5 / 2.0; //o interpretador entende que o resultado é um número flutuante
        System.out.println(ultimaTentativaDivisao);
    }
}