package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public interface IFilter <I,O> {
     O process(I input);
}
