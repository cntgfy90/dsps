package abstractFactory.websiteProject;

import abstractFactory.Developer;
import abstractFactory.ProjectFactory;
import abstractFactory.ProjectManager;
import abstractFactory.Tester;

public class WebsiteProjectFactory implements ProjectFactory {
    
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebsiteTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsiteProjectManager();
    }
    
}