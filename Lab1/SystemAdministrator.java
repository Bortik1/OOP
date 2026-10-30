public class SystemAdministrator extends Employee {
    private int serversCount;
    private int accessLevel;
    private String os;

    public SystemAdministrator(String fullName, int age, double salary, int serversCount, int accessLevel, String os) {
        super(fullName, age, salary);
        this.serversCount = serversCount;
        this.accessLevel = accessLevel;
        this.os = os;
    }

    public int getServersCount() { return serversCount; }
    public void setServersCount(int serversCount) { this.serversCount = serversCount; }
    public int getAccessLevel() { return accessLevel; }
    public void setAccessLevel(int accessLevel) { this.accessLevel = accessLevel; }
    public String getOs() { return os; }
    public void setOs(String os) { this.os = os; }

    public void monitorServers() {
        System.out.println("Мониторинг серверов");
    }
    public void grantAccess() {
        System.out.println("Выдача прав доступа");
    }
    public void installUpdates() {
        System.out.println("Установка обновлений");
    }
}
