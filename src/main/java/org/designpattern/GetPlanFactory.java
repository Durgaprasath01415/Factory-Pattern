package org.designpattern;

import org.designpattern.dto.CommericalPlan;
import org.designpattern.dto.DomesticPlan;
import org.designpattern.dto.InstitutionalPlan;
import org.designpattern.dto.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERICALPLAN")) {
            return new CommericalPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
