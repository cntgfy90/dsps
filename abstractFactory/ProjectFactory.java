package abstractFactory;

public interface ProjectFactory {
    
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
    
}