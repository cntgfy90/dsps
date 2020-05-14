package abstractFactory;

import abstractFactory.websiteProject.WebsiteProjectFactory;

public class GetProjectTeam {
    public static void main(String args[]) {
        ProjectFactory factory = new WebsiteProjectFactory();

        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

}