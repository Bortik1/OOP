public class Main {
    public static void main(String[] args) {
        DatabaseAdministrator dba = new DatabaseAdministrator("Иванов", 30, 100000.0, 10, 5, "Linux", "PostgreSQL", 24, 500);
        
        dba.work();             
        dba.monitorServers();   
        dba.optimizeQueries();  
    }
}
