package org.designpattern.dto;

import org.designpattern.dto.Plan;

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
