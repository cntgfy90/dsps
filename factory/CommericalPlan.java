package factory;

import factory.Plan;

public class CommericalPlan extends Plan {
    
    @Override
    public void getRate() {
        rate = 7.50;
    }

}