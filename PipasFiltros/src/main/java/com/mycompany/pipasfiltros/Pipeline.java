package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public class Pipeline {

    private Pipe<String> pipe1 = new Pipe<>();
    private Pipe<String> pipe2 = new Pipe<>();
    private Pipe<String> pipe3 = new Pipe<>();

    private UpperCaseFilter filter1 = new UpperCaseFilter();
    private RemoveSpacesFilter filter2 = new RemoveSpacesFilter();
    private ReverseStringFilter filter3 = new ReverseStringFilter();

    public void execute(String input) {
        // Pasa el input por los filtros, utilizando pipas para transferir datos
        pipe1.putData(filter1.process(input));           // Filtro 1: Mayúsculas
        pipe2.putData(filter2.process(pipe1.getData())); // Filtro 2: Eliminar espacios
        pipe3.putData(filter3.process(pipe2.getData())); // Filtro 3: Invertir cadena

        // Imprimir resultado final
        System.out.println("Resultado final: " + pipe3.getData());
    }

}
