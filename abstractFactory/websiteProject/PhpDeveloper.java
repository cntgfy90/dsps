package abstractFactory.websiteProject;

import abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    
    @Override
    public void writeCode() {
        System.out.println("PHP Developer writes code...");
    }
    
}