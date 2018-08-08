package org.mifos.chatbot.adapter.handler.loanproduct;

import lombok.extern.slf4j.Slf4j;
import org.mifos.chatbot.client.ApiException;
import org.mifos.chatbot.client.api.LoanProductsApi;
import org.mifos.chatbot.client.model.GetLoanProductsProductIdResponse;
import org.mifos.chatbot.core.model.Intent;
import org.mifos.chatbot.core.model.MifosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MaxAllowedAmountHandler extends BaseLoanProductIntentHandler {
    private static final String[] INTENT_KEYWORDS = {"max", "Allowed", "Amount"};

    @Autowired
    private LoanProductsApi loanProductsApi;

    @Override
    public Boolean canHandle(Intent intent) {
        for(String intent_keyword : INTENT_KEYWORDS) {
            if (!intent.getKeyword().toLowerCase().contains(intent_keyword.toLowerCase()))
                return false;
        }

        return true;
    }

    @Override
    public MifosResponse handle(Intent intent) {
        MifosResponse response = new MifosResponse();
        try {
            GetLoanProductsProductIdResponse result = loanProductsApi.retrieveLoanProductDetails(intent.getParameterAsLong("ID"));
            response.setContent(String.valueOf(result.getMinPrincipal()));
        } catch (ApiException e) {
            log.info("Error", e);
            response.setContent(e.getMessage());
        }

        return response;
    }
}
