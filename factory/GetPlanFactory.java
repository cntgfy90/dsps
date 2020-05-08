package factory;

public class GetPlanFactory {

    public Plan getPlan(String type) {
        if (type.equals(PlanTypes.DOMESTICAL.toString())) {
            return new DomesticalPlan();
        } else if (type.equals(PlanTypes.COMMERCIAL.toString())) {
            return new CommericalPlan();
        } else if (type.equals(PlanTypes.INSTITUTIONAL.toString())) {
            return new InstitutionalPlan();
        } else {
            return null;
        }
    }

}