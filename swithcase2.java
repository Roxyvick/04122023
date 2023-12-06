import java.util.*;
public class swithcase2 {
    public static void main(String[] args) {
        try{
            String[] comodos = {"Sala", "Cozinha", "Banheiro", "Quarto", "Copa"};
            Scanner scnOpcaoUsuario = new Scanner(System.in);
            for ( int c = 0; c < comodos.length; c++) {
                System.out.println("Código [" + c + "] - " + comodos[c]);
            }
            System.out.println("Digite o código do cômodo acima pra acender a luz");

            switch (scnOpcaoUsuario.nextInt()){
                case 0:
                System.out.println("Luz da " + comodos[0] + " acessa");
                break;

                case 1:
                System.out.println("Luz da " + comodos[1] + " acessa");
                break;

                case 2:
                System.out.println("Luz da " + comodos[2] + " acessa");
                break;

                case 3:
                System.out.println("Luz da " + comodos[3] + " acessa");
                break;

                case 4:
                System.out.println("Luz da " + comodos[4] + " acessa");
                break;
            }
        } catch (Exception e){
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
