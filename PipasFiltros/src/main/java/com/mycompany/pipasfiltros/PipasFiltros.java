package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public class PipasFiltros {

    public static void main(String[] args) {
        // Cadena de entrada
        String input = " Jullian Puerta ";

        // Crear y ejecutar el pipeline
        Pipeline pipeline = new Pipeline();
        pipeline.execute(input);  // Resultado esperado: SOTLIFYPASIPARUTCETIQUCRA
    }
}
