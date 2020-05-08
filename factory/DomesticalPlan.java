package factory;

import factory.Plan;

public class DomesticalPlan extends Plan {
    
    @Override
    public void getRate() {
        rate = 5.55;
    }
}
