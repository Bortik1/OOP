public class DatabaseAdministrator extends SystemAdministrator {
    private String dbms;
    private int backupHours;
    private int maxConnections;

    public DatabaseAdministrator(String fullName, int age, double salary, int serversCount, int accessLevel, String os, String dbms, int backupHours, int maxConnections) {
        super(fullName, age, salary, serversCount, accessLevel, os);
        this.dbms = dbms;
        this.backupHours = backupHours;
        this.maxConnections = maxConnections;
    }

    public String getDbms() { return dbms; }
    public void setDbms(String dbms) { this.dbms = dbms; }
    public int getBackupHours() { return backupHours; }
    public void setBackupHours(int backupHours) { this.backupHours = backupHours; }
    public int getMaxConnections() { return maxConnections; }
    public void setMaxConnections(int maxConnections) { this.maxConnections = maxConnections; }

    public void optimizeQueries() {
        System.out.println("Оптимизация запросов");
    }
    public void performBackup() {
        System.out.println("Резервное копирование");
    }
    public void configureConnections() {
        System.out.println("Настройка соединений");
    }
}
