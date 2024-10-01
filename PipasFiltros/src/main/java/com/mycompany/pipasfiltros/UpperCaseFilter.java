package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public class UpperCaseFilter implements IFilter<String, String> {

    @Override
    public String process(String input) {
        return input.toUpperCase();
    }
}
