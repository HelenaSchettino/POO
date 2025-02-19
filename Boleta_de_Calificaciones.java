public class Boleta_de_Calificaciones {
String Estudiante;
String Materias;
 double POO;
 double Algebra_lineal;
 double Probabilidad_y_Estadistica;
 double Calculo_Integral;
 double Quimica;
 double Contabilidad_Financiera;

 String obtener_datos(){
    String cad="";
    cad=cad+"Estudiante{Materias:"+";";
    cad=cad+"POO:"+POO+";";
    cad=cad+"Algebra_lineal:"+Algebra_lineal+";";
    cad=cad+"Probabilidad_y_Estadistica:"+Probabilidad_y_Estadistica+";";
    cad=cad+"Calculo_Integral:"+Calculo_Integral+";";
    cad=cad+"Quimica:"+Quimica+";";
    cad=cad+"Contabilidad_Financiera:"+Contabilidad_Financiera+"}";
    return cad;
}
}
