package abstractFactory.bankProject;

import abstractFactory.ProjectManager;

public class BankProjectManager implements ProjectManager {
    
    @Override
    public void manageProject() {
        System.out.println("Manage project...");    
    }

}