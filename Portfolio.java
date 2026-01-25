public class Portfolio {
    private String name;
    private String description;
    private String[] projects;
    
    /**
     * Constructor to initialize Portfolio with name and description
     * @param name - Portfolio owner's name
     * @param description - Portfolio description
     */
    public Portfolio(String name, String description) {
        this.name = name;
        this.description = description;
        this.projects = new String[0];
    }
    
    /**
     * Add a new project to the portfolio
     * @param project - Project name/description to add
     */
    public void addProject(String project) {
        if (project == null || project.trim().isEmpty()) {
            System.out.println("Error: Project cannot be empty");
            return;
        }
        
        String[] newProjects = new String[projects.length + 1];
        System.arraycopy(projects, 0, newProjects, 0, projects.length);
        newProjects[projects.length] = project;
        this.projects = newProjects;
    }
    
    /**
     * Remove a project from the portfolio
     * @param projectIndex - Index of project to remove
     */
    public void removeProject(int projectIndex) {
        if (projectIndex < 0 || projectIndex >= projects.length) {
            System.out.println("Error: Invalid project index");
            return;
        }
        
        String[] newProjects = new String[projects.length - 1];
        int newIndex = 0;
        for (int i = 0; i < projects.length; i++) {
            if (i != projectIndex) {
                newProjects[newIndex++] = projects[i];
            }
        }
        this.projects = newProjects;
    }
    
    /**
     * Get the portfolio name
     * @return Portfolio name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the portfolio name
     * @param name - New portfolio name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the portfolio description
     * @return Portfolio description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Set the portfolio description
     * @param description - New portfolio description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Get all projects in the portfolio
     * @return Array of projects
     */
    public String[] getProjects() {
        return projects;
    }
    
    /**
     * Get the total number of projects
     * @return Number of projects
     */
    public int getProjectCount() {
        return projects.length;
    }
    
    /**
     * Display the portfolio information
     */
    public void displayPortfolio() {
        System.out.println("\n========== PORTFOLIO ==========");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Total Projects: " + projects.length);
        
        if (projects.length == 0) {
            System.out.println("Projects: (none)");
        } else {
            System.out.println("\nProjects:");
            for (int i = 0; i < projects.length; i++) {
                System.out.println((i + 1) + ". " + projects[i]);
            }
        }
        System.out.println("==============================\n");
    }
    
    /**
     * Main method to test Portfolio functionality
     */
    public static void main(String[] args) {
        // Create a new portfolio
        Portfolio portfolio = new Portfolio("Deep Rudra Paul", "Video Editor Portfolio");
        
        // Add projects
        portfolio.addProject("YouTube Video Edit - Cinematic cuts with color grading");
        portfolio.addProject("Instagram Reels - Fast-paced edits with modern transitions");
        portfolio.addProject("Thumbnail Design - High-click thumbnails using Photoshop");
        portfolio.addProject("Promotional Video - Dynamic transitions and visual effects");
        
        // Display portfolio
        portfolio.displayPortfolio();
        
        // Test getters
        System.out.println("Portfolio Owner: " + portfolio.getName());
        System.out.println("Project Count: " + portfolio.getProjectCount());
        
        // Remove a project
        System.out.println("Removing project at index 1...");
        portfolio.removeProject(1);
        portfolio.displayPortfolio();
        
        // Update description
        portfolio.setDescription("Professional Video Editor specializing in cinematic content");
        portfolio.displayPortfolio();
    }
}

