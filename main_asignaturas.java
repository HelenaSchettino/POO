public class main_asignaturas {
    public static void main(String[] args) {
        computadora computadora_1 = new computadora();
        computadora_1.setMarca ("HP");
        computadora_1.setAlmacenamiento("512GB SDD");
        computadora_1.setModelo("OMEN");
        computadora_1.setRAM(16);
        computadora_1.setProcesador("INTEL corei5 13th Gen");

        computadora computadora_2 = new computadora();
        computadora_2.setMarca ("ASUS");
        computadora_2.setAlmacenamiento("1TB SDD");
        computadora_2.setModelo("TUF 15");
        computadora_2.setRAM(64);
        computadora_2.setProcesador("AMD Ryzeni7 13th Gen");

        System.out.println(computadora_1);
        System.out.println(computadora_2);

        balon balon_1 = new balon();
        balon_1.setDeporte("Basketball");
        balon_1.setForma("Esferica");
        balon_1.setMaterial("plastico");
        balon_1.setPeso("500gr");
        balon_1.setPrecio("$200");
        balon_1.setTamaño("grande");

        balon balon_2 = new balon();
        balon_2.setDeporte("baseball");
        balon_2.setForma("Esferica");
        balon_2.setMaterial("cuero");
        balon_2.setPeso("250gr");
        balon_2.setPrecio("$200");
        balon_2.setTamaño("pequeño");

        System.out.println(balon_1);
        System.out.println(balon_2);

        profesionista profesionista_1 = new profesionista();
        profesionista_1.setNombre("Alberto Schettino Piña");
        profesionista_1.setEdad(56);
        profesionista_1.setCarrera("Licenciatura en Ciencias Politicas");
        profesionista_1.setUniversidad("Universidad Cristobal Colon");
        profesionista_1.setNumero_celular(229915303);

        profesionista profesionista_2 = new profesionista();
        profesionista_2.setNombre("Yojan Adir Garcia Benitez");
        profesionista_2.setEdad(26);
        profesionista_2.setCarrera("Ingenieria Mecanica");
        profesionista_2.setUniversidad("Tecnologico Nacional de Monterrey");
        profesionista_2.setNumero_celular(229416441);

        System.out.println(profesionista_1);
        System.out.println(profesionista_2);

        boleto boleto_1 = new boleto();
        boleto_1.setEvento("Concierto de Don Omar");
        boleto_1.setHora("07:00 pm");
        boleto_1.setFecha("10/08/25");
        boleto_1.setLugar("Estadio Beto Avila");
        boleto_1.setTipo("VIP");
        boleto_1.setNum_serie(123456);
        boleto_1.setPrecio("$7,000");

        boleto boleto_2 = new boleto();
        boleto_2.setEvento("Concierto de Don Omar");
        boleto_2.setHora("07:00 pm");
        boleto_2.setFecha("10/08/25");
        boleto_2.setLugar("Estadio Beto Avila");
        boleto_2.setTipo("Bronce 1");
        boleto_2.setNum_serie(654321);
        boleto_2.setPrecio("$1,500");

        System.out.println(boleto_1);
        System.out.println(boleto_2);

        manzana manzana_1 = new manzana();
        manzana_1.setTienda("Wallmart");
        manzana_1.setColor("rojo");
        manzana_1.setTipo("cherry");
        manzana_1.setPrecio("$15");

        manzana manzana_2 = new manzana();
        manzana_2.setTienda("Wallmart");
        manzana_2.setColor("amarilla");
        manzana_2.setTipo("golden");
        manzana_2.setPrecio("$20");
    }
}
