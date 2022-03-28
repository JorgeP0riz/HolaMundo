import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HolaMundo {

    private Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) throws Exception {
        System.out.println("HolaMundo");

        HolaMundo p = new HolaMundo();
        p.m1();

        System.out.println("La suma de los primeros 10 numeros positivos");
        p.suma(5);
    }

    /**
     * Este metodo se encarga de sumar
     * @param n el numero natural base
     * @return la suma de los primeros n numeros naturales
     * @throws Exception
     */
    public int suma(int n) throws Exception {
        if (n <=0){
            throw new Exception("Suma necesita un numero mayor a 0 ");
        }
        int r = 0;
        for (int i = 0; i <= n; i++) {
            r += i;
        }
        return r;
    }

    private void m1() {
        System.out.println("Metodo m1");
        logger.error("Aqui va un error");
        logger.info("Aqui va un info");
        logger.debug("Aqui va un debug");
    }
}
