package com.mycompany.pipasfiltros;

/**
 *
 * @author julli
 */
public class RemoveSpacesFilter implements IFilter<String, String> {

    @Override
    public String process(String input) {
        return input.replaceAll("\\s+", "");
    }
}
