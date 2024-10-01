package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public class ReverseStringFilter implements IFilter<String, String> {

    @Override
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
