
package com.zunit.rlogger.client.service.bayes;

import java.util.List;

/**
 *
 * @author Ace
 * Interfejs zawierający metody wykorzystywane przy obliczaniu najbardziej
 * prawdopodobnego zdarzenia. Czyli określanie jak bardzo prawdopodobne
 * jest wystąpienie błędu przy danych podanych przez klienta.
 */
public interface BayesService {
    double countBayesResultForList(List list, String userId, String logType);
    
    
}
