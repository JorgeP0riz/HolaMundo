package observer;

import java.beans.PropertyChangeEvent;

public class EstudianteUnversidad implements IInversor {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    private void analisisInversion(int diferencia, int newValue, int oldValue) {
        if (diferencia > 0){
            System.out.println("Se sugiere vender");
        }else {
            System.out.println("Se sugiere esperar");
        }
    }
}
