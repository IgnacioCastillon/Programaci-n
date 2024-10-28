import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class trivial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String tirada = "";
        String tematica = "";
        boolean ganador = false;
        System.out.print("Cuantos jugadores van a participar: ");
        int jugadores = sc.nextInt();
        sc.nextLine();
        String[] nombre = new String[jugadores];
        int[] casilla = new int[jugadores];
        for (int i = 0; i<jugadores; i++) {
            System.out.println("Nombre jugador " + i + ":");
            nombre[i] = sc.nextLine();
        }
        while (!ganador&&!tirada.equalsIgnoreCase("Fin")) {
            for (int i = 0; i < jugadores; i++) {
                System.out.println(nombre[i] + " Pulsa enter para tirar los dados");
                tirada = sc.nextLine();
                int dado1 = rd.nextInt(6) + 1;
                int dado2 = rd.nextInt(6) + 1;
                int sumadados = dado1 + dado2;
                System.out.println("Has sacado un " + sumadados);
                casilla[i] = casilla[i] + sumadados;
                System.out.println("Has avanzado desde la casilla " + (casilla[i] - sumadados) + " a la casilla " + casilla[i]);

                if (casilla[i]==1&&casilla[i]==1+5) {
                    tematica="Entretenimiento";
                } else if (casilla[i]==2&&casilla[i]==2+5) {
                    tematica="Ciencia";
                } else if (casilla[i]==3&&casilla[i]==3+5) {
                    tematica="Geografia";
                } else if (casilla[i]==4&&casilla[i]==4+5) {
                    tematica="Arte";
                } else if (casilla[i]==5&&casilla[i]==casilla[i]+5) {
                    tematica="Deporte";
                }
                System.out.println("Te ha tocado pregunta de "+tematica);
                if (tematica.equalsIgnoreCase("Entretenimiento")){
                    int entretenimiento = rd.nextInt(10)+1;
                    if (entretenimiento==1){

                    } else if (entretenimiento==2) {

                    }
                    else if (entretenimiento==3) {

                    }
                    else if (entretenimiento==4) {

                    }
                    else if (entretenimiento==5) {

                    }
                    else if (entretenimiento==6) {

                    }
                    else if (entretenimiento==7) {

                    }else if (entretenimiento==8) {

                    }else if (entretenimiento==9) {

                    }else if (entretenimiento==10) {

                    }




                }
            }
        }
        /*for (int i = 0; i<jugadores; i++){
            System.out.println(nombre[i]);
        }
        int dado1 = rd.nextInt(6)+1;
        int dado2 = rd.nextInt(6)+1;
        int repeticion = 0;
        while (dado1==dado2&&repeticion<3){
            System.out.println("Tienes otro tiro");
            System.out.println("Pulsa enter para tirar los dados");
            String enter = sc.nextLine();
            repeticion++;
        }
        if (repeticion==3){
            System.out.println("A veces tanta buena suerte es mala suerte!! Vuelve a la casilla de salida");
        }*/
    }
}
