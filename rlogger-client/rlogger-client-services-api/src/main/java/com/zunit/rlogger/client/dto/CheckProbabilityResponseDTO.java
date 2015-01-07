
package com.zunit.rlogger.client.dto;

/**
 *
 * @author Ace
 */
public class CheckProbabilityResponseDTO {
    private String probability;
    private String result; //Oznacza ERR, SUC lub WAR w zaleznosci od wyniku obliczen klasyfikatora Bayesa

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
}
