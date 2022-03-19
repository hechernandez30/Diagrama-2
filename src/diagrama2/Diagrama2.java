package diagrama2;
public class Diagrama2 {

    public static void main(String[] args) {
        Programmer programmer_1 = new Programmer();
        programmer_1.name = "Juan";
        programmer_1.age = 30;
        programmer_1.language = "Java";
        programmer_1.salary = 5500;
        programmer_1.printData();
        programmer_1.getLanguage();
        
        DatabasePro databasepro_1 = new DatabasePro();
        databasepro_1.name = "Pedro";
        databasepro_1.age = 35;
        databasepro_1.databaseTool = "Netbeans";
        databasepro_1.salary = 10000;
        databasepro_1.printData();
        databasepro_1.getDatabaseTool();
    }
    
}
