package observer;

public class EJemploObserver {
    public static void main(String[] args) {
        AccionEmpresa accion = new AccionEmpresa("Google", 1000);
        IInversor inversor = new EstudianteUnversidad();

        accion.addInversor(inversor);

        //simular lo que pasa con la accion
        accion.baja(10);
        accion.sube(23);
        accion.baja(8);
        accion.sube(12);
        accion.baja(5);
    }
}
