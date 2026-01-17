public class Portfolio {
    private String name;
    private String description;
    private String[] projects;
    
    public Portfolio(String name, String description) {
        this.name = name;
        this.description = description;
        this.projects = new String[0];
    }
    
    public void addProject(String project) {
        String[] newProjects = new String[projects.length + 1];
        System.arraycopy(projects, 0, newProjects, 0, projects.length);
        newProjects[projects.length] = project;
        this.projects = newProjects;
    }
    
    public void displayPortfolio() {
        System.out.println("Portfolio: " + name);
        System.out.println("Description: " + description);
    }
}