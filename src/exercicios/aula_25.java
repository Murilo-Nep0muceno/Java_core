package exercicios;

public class aula_25 {
    public static void main(String[] args) {
        byte dia = 4;
        switch (dia) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sabado");
                break;

        }
        String sexo = "f";

        switch (sexo.toUpperCase()) {
            case "M"  :
                System.out.println("Homem");
                break;
            case "F":
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }

    }
}
