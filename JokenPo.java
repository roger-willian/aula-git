import java.util.Random;

public class JokenPo {

    public static void sortear() {
        Random rand = new Random();
        int numeroSorteado = rand.nextInt((3 - 1) + 1) + 1;
        System.out.println(numeroSorteado);
    }

}