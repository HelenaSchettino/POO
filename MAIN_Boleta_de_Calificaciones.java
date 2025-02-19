public class MAIN_Boleta_de_Calificaciones {
    public static void main(String[] args) {
        Boleta_de_Calificaciones e1 = new Boleta_de_Calificaciones();
        Boleta_de_Calificaciones e2 = new Boleta_de_Calificaciones();
        Boleta_de_Calificaciones e3 = new Boleta_de_Calificaciones();

        e1.Estudiante="Yojan Adir Garcia Benitez";
        e1.POO=10;
        e1.Algebra_lineal=8.5;
        e1.Contabilidad_Financiera=9;
        e1.Calculo_Integral=10;
        e1.Probabilidad_y_Estadistica=8;
        e1.Quimica=7;

        System.out.println(e1.obtener_datos());

        e2.Estudiante="Helena Schettino Garcia";
        e2.POO=10;
        e2.Algebra_lineal=7.5;
        e2.Contabilidad_Financiera=8;
        e2.Calculo_Integral=9;
        e2.Probabilidad_y_Estadistica=8;
        e2.Quimica=7;

        System.out.println(e2.obtener_datos());

        e3.Estudiante="Lian Rincon Juarez";
        e3.POO=9;
        e3.Algebra_lineal=8.5;
        e3.Contabilidad_Financiera=9;
        e3.Calculo_Integral=8;
        e3.Probabilidad_y_Estadistica=8;
        e3.Quimica=9;

        System.out.println(e3.obtener_datos());
    }
}
