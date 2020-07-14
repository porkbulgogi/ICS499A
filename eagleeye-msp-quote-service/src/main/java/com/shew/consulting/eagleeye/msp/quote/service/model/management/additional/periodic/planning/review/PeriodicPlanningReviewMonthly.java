package com.shew.consulting.eagleeye.msp.quote.service.model.management.additional.periodic.planning.review;

import com.shew.consulting.eagleeye.msp.quote.service.model.quote.ManagementType;
import com.shew.consulting.eagleeye.msp.quote.service.model.services.Service;
import com.shew.consulting.eagleeye.msp.quote.service.model.services.ServiceDefinition;
import org.springframework.stereotype.Component;

@Component
public class PeriodicPlanningReviewMonthly implements ServiceDefinition {

    public static final String TITLE = "Monthly";

    @Override
    public Service defineService() {
        return new Service(getId(ManagementType.ADDITIONAL), TITLE, 120);
    }

}
