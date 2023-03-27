import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Long id = 3l;
        String nombre = "Axel";
        String apellido = "Choque";
        String telefono = "111111";
        String email = "axelchoque@gmail.com";
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaAlta = LocalDate.of(2021,03,10);
        Cuenta cuentaE = new Cuenta(3,true,200f);
        Cuenta[] cuentaEjercicio = {cuentaE};
        Float ingresoMensual = 0f;
        Prestamo prestamo1E = new Prestamo(3,100f);
        Prestamo[] prestamoEjercicio = {prestamo1E};
        Long antiguedad = ChronoUnit.MONTHS.between(fechaAlta, fechaHoy);
        //                              Ejercicio 1 - Creando cliente

        if(ingresoMensual>2000 && antiguedad>=12){
            ClienteA clienteEjercicio = new ClienteA(id,nombre,apellido,telefono,email,fechaAlta,cuentaEjercicio,ingresoMensual,prestamoEjercicio);
            System.out.println(clienteEjercicio);
            System.out.println("------------------------------------------");
            clientes.add(clienteEjercicio);
        } else if(ingresoMensual>0){
            ClienteB clienteEjercicio = new ClienteB(id, nombre, apellido, telefono, email, fechaAlta, cuentaEjercicio, ingresoMensual, prestamoEjercicio);
            System.out.println(clienteEjercicio);
            System.out.println("------------------------------------------");
            clientes.add(clienteEjercicio);
        } else {
            Estudiante clienteEjercicio = new Estudiante(id, nombre, apellido, telefono, email, fechaAlta, cuentaE);
            System.out.println(clienteEjercicio);
            System.out.println("------------------------------------------");
            clientes.add(clienteEjercicio);
        }
        

        Long idBuscado= 1l;



        LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        
        LocalDate fecha2 = LocalDate.of(2021, 05, 30);
        
        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        Cuenta cuenta4 = new Cuenta(2, true, 550.0f);

        Prestamo prestamo2 = new Prestamo(1, 5000f);
        
        Prestamo[] prestamos2 = {prestamo2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};

        ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha2, cuentas2, 1000.0f, prestamos2);

        //                              Ejercicio 1 - Aplicado a cliente existente

        if(clienteB1.getIngresoMensual()>2000 && clienteB1.calculoAntiguedad()>=12){
            System.out.println("Cliente A");
        } else if(clienteB1.getIngresoMensual()>0){
            System.out.println("Cliente B");
        } else {
            System.out.println("Estudiante");
        }

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};

        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha1, cuentas1, 2000.0f, prestamos1);

        //System.out.println("El balance total de cuentas del cliente es: " + clienteA1.calculoBalance());
        //System.out.println("El prestamo al que el cliente puede aplicar es de: " + clienteA1.calculoPrestamo());

        clientes.add(clienteA1);
        clientes.add(clienteB1);
        System.out.println(clientes);

        //                          Ejercicio 2

        for(int x=0; x < clientes.size(); x++){
            if(clientes.get(x).getIdCliente() == idBuscado){
                clientes.remove(x);
            }
        }
        System.out.println("------------------------------------------");
        System.out.println(clientes);
    }   
}
