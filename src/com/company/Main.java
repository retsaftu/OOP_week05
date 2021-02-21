package com.company;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB("Employee");
        IEmployeesRepository employeesRepository = new EmployeesRepository(db);
        IProjectRepository projectRepository = new ProjectRepository(db);
        Application app = new Application(employeesRepository, projectRepository);
        app.start();
    }
}
