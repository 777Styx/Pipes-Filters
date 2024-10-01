package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public class Pipe <T> {
    
     private T data;

    // Coloca datos en la pipa
    public void putData(T data) {
        this.data = data;
    }

    // Obtiene los datos de la pipa
    public T getData() {
        return this.data;
    }
}
