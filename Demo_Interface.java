public class Demo_Interface {
    public static void main(String[] args) {
        NumeroConcreto num1 = new NumeroConcreto(25);
        NumeroConcreto num2 = new NumeroConcreto(4);

        num1.suma(num2);
        num1.resta(num2);
        num1.multiplicacion(num2);
        num1.division(num2);
    }
}

interface Operaciones{
    void suma(Numero OtroNumero);
    void resta(Numero OtroNumero);
    void multiplicacion(Numero OtroNumero);
    void division(Numero OtroNumero);
}

class Numero {
    int valor;
    public Numero(int valor) {
        this.valor = valor;
    }
}

class NumeroConcreto extends Numero implements Operaciones{
    public NumeroConcreto(int valor) {
        super(valor);
    }

    @Override
    public void suma(Numero OtroNumero) {
        System.out.println("Suma de " + (this.valor+OtroNumero.valor));
    }

    @Override
    public void resta(Numero OtroNumero) {
        System.out.println("Resta de " + (this.valor-OtroNumero.valor));
    }

    @Override
    public void multiplicacion(Numero OtroNumero) {
        System.out.println("Multiplicacion de " + (this.valor*OtroNumero.valor));
    }

    @Override
    public void division(Numero OtroNumero) {
        System.out.println("Division de " + (this.valor/OtroNumero.valor));

    }
}

