package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Baquedano", "120", "Llanquihue", "Puerto Varas");
        Direccion direccion2 = new Direccion("San Martin", "455", "Puerto Montt", "Puerto Montt");
        Direccion direccion3 = new Direccion("Los Notros", "89", "Frutillar", "Frutillar");

        Persona cliente = new Persona(
                "12.345.678-9",
                "Ana Torres",
                "+56912345678",
                "ana.torres@gmail.com",
                direccion1
        );

        Empleado guia = new Empleado(
                "11.111.111-1",
                "Pedro Soto",
                "+56998765432",
                "pedro.soto@llanquihuetour.cl",
                direccion2,
                "Guia Turistico",
                850000
        );

        Empleado coordinadora = new Empleado(
                "22.222.222-2",
                "Maria Gonzalez",
                "+56945678912",
                "maria.gonzalez@llanquihuetour.cl",
                direccion3,
                "Coordinadora de Tours",
                950000
        );

        System.out.println("=== DATOS DEL SISTEMA LLANQUIHUE TOUR ===");
        System.out.println(cliente);
        System.out.println(guia);
        System.out.println(coordinadora);
    }
}

    