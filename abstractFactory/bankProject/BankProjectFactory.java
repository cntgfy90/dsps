package abstractFactory.bankProject;

import abstractFactory.Developer;
import abstractFactory.ProjectFactory;
import abstractFactory.ProjectManager;
import abstractFactory.Tester;

public class BankProjectFactory implements ProjectFactory {
    
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankProjectManager();
    }
    
}