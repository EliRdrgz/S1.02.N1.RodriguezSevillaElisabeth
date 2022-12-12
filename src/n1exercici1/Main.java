package n1exercici1;

public class Main {

    public static void main(String[] args) throws VendaBuidaException {

        Venda venda = new Venda();
        try{
            venda.calcularTotal();
        }catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
        // Generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int index = 10;
            int num = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: s'ha intentat accedir a un índex fora dels límits de l'array.");
        }
    }

}

