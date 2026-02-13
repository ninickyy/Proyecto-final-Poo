package Modelo;

public class SistemaLogin {

    private Operador[] operadores;
    private int total;

    public SistemaLogin() {
        operadores = new Operador[10];
        total = 0;
    }

    public void registrarOperador(Operador op) {
        if (total < operadores.length) {
            operadores[total] = op;
            total++;
        }
    }

    public boolean iniciarSesion(String usuario, String clave) {

        for (int i = 0; i < total; i++) {
            if (operadores[i].autenticar(usuario, clave)) {
                return true;
            }
        }

        return false;
    }
}
