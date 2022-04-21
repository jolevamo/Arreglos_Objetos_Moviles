package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String Nom, Referencia, denominacion;
        double precio;
        Scanner inputData = new Scanner(System.in);
        System.out.println("Ingrese el número de productos a registrar: ");
        int Tam = Integer.parseInt(inputData.nextLine());
        Product [] products = new Product[Tam];
        Product Tecno = new Product();
        for (int i=0;i<Tam;i++){
            System.out.println("Ingrese el nombre del producto "+(i+1));
            Nom = inputData.nextLine();
            System.out.println("Ingrese el precio del producto "+(i+1));
            precio = Double.parseDouble(inputData.nextLine());
            System.out.println("Ingrese la referencia del producto "+(i+1));
            Referencia = inputData.nextLine();
            products [i] = new Product();
            products [i].setName(Nom);
            products[i].setPrice(precio);
            products[i].setReference(Referencia);
        }
        for (int i = 0;i < Tam; i++){
            System.out.println("Nombre: "+products[i].getName()+", Precio: "+products[i].getPrice()+", Referencia: "+products[i].getReference());
        }
        System.out.println("Ingrese el nombre del producto del cual desea consultar el precio: ");
        String UserInput = inputData.nextLine();
        for (int i =0; i <Tam; i++){
            if (products[i].getName().equals(UserInput)){
                System.out.println("El precio del "+" "+UserInput+" "+products[i].getPrice());
            }
        }



    }
}
