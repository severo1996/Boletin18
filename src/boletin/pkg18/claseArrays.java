package boletin.pkg18;

public class claseArrays {

    int[] numero = new int[6];

    public void cargarArray() {
        for (int i = 0; i < 6; i++) {
            numero[i]=(int)(Math.random()*50+1);
            
            System.out.println("Numero"+ numero [i]);

        }

    }

    public void visualizar() {
        System.out.print("\n");
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println("Numero   " + numero[i]);
        }
    }
    

}
