package abstractFactory.websiteProject;

import abstractFactory.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
    
    @Override
    public void manageProject() {
        System.out.println("Website manager manages project...");    
    }

}