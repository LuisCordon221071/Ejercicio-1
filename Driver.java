// Uniersidad del Valle de Guatemala
// Luis Alberto Cordón Salguero
// 221071
// 12 de Agosto del 2022
// Ejercicio 1
import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        //APC
        Amigo pal = new Amigo();
        Perro3 dog = new Perro3();
        Controlador con = new Controlador();
        //Att
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        //Amigo
        System.out.println( "-----------------");
        System.out.println("Ingrese su información personal");
        System.out.println("-----------------");
        System.out.println("Nombre: ");
        pal.setNombre(sn.nextLine());
        System.out.println("Correo electrónico: ");
        pal.setCorreo(sn.nextLine());
        System.out.println("Número de teléfono: ");
        pal.setTelefono(sn.nextInt());
        //Perro
        sn.nextLine();
        System.out.println( "-----------------");
        System.out.println("Ingrese la información de su perro");
        System.out.println("-----------------");
        System.out.println("Nombre: ");
        dog.setNombre(sn.nextLine());
        System.out.println("Raza: ");
        dog.setRaza(sn.nextLine());
        System.out.println("Color: ");
        dog.setColor(sn.nextLine());
        System.out.println("Tamaño: ");
        dog.setTamaño(sn.nextLine());
        System.out.println("Sexo: ");
        dog.setSexo(sn.nextLine());
        System.out.println("Edad: ");
        dog.setEdad(sn.nextInt());
        System.out.println("Peso: ");
        dog.setPeso(sn.nextInt());
        System.out.println("Altura: ");
        dog.setAltura(sn.nextInt());
        //Menú
        while (!salir){
            System.out.println("1) Nuevo amigo");
            System.out.println("2) Nuevo perro");
            System.out.println("3) Llamar a la perrera");
            System.out.println("4) Imprimir anuncio");
            System.out.println("5) Publicar anuncio en el periódico");
            System.out.println("6) Salir");
            try{
                System.out.println("Introduzca un número: ");
                opcion = sn.nextInt();
                switch(opcion){
                    case 1:
                        pal = new Amigo();
                        sn.nextLine();
                        System.out.println( "-----------------");
                        System.out.println("Ingrese su información personal");
                        System.out.println("-----------------");
                        System.out.println("Nombre: ");
                        pal.setNombre(sn.nextLine());
                        System.out.println("Correo electrónico: ");
                        pal.setCorreo(sn.nextLine());
                        System.out.println("Número de teléfono: ");
                        pal.setTelefono(sn.nextInt());
                        break;
                    case 2:
                        dog = new Perro3();
                        sn.nextLine();              
                        System.out.println( "-----------------");
                        System.out.println("Ingrese la información de su perro");
                        System.out.println("-----------------");
                        System.out.println("Nombre: ");
                        dog.setNombre(sn.nextLine());
                        System.out.println("Raza: ");
                        dog.setRaza(sn.nextLine());
                        System.out.println("Color: ");
                        dog.setColor(sn.nextLine());
                        System.out.println("Tamaño: ");
                        dog.setTamaño(sn.nextLine());
                        System.out.println("Sexo: ");
                        dog.setSexo(sn.nextLine());
                        System.out.println("Edad: ");
                        dog.setEdad(sn.nextInt());
                        System.out.println("Peso: ");
                        dog.setPeso(sn.nextInt());
                        System.out.println("Altura: ");
                        dog.setAltura(sn.nextInt());
                        break;
                    case 3:
                        if (con.getPerrera()<5){
                            System.out.println("La perrera encontró a su perro :D");
                            System.out.println("Te quedan Q"+con.getDinero()); 
                        }
                        else if (con.getPerrera()>=5){
                            System.out.println("Lo sentimos, no hemos encontrado a su perro :c, te quedan Q"+con.getDinero()); 
                        }
                        break;
                    case 4:
                        if (con.getAnuncio()<10){
                            System.out.println("Alguien de la comunidad encontró a su perro :D");
                            System.out.println("Te quedan Q"+con.getA());
                        }
                        else if (con.getAnuncio()>=10){
                            System.out.println("Lo sentimos, no hemos encontrado a su perro :c, te quedan Q"+con.getA()); 
                        }
                        break;
                    case 5:
                        if (con.getPeriodico()<15){
                            System.out.println("Alguien del periódico encontró a su perro :D");
                        }
                        else if (con.getAnuncio()>=15){
                            System.out.println("Lo sentimos, no hemos encontrado a su perro :c, te quedan Q"+con.getB()); 
                        }
                        break;
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("las opciones son entre 1 y 6");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe introducir un número");
                sn.next();
            }
        }
        System.out.println("Feliz día :D");
    }
}