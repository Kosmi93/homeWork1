public class TaskEight {
    public static void main(String[] args) {
        int weekHours = 640;
        int hoursEmployee = 8;
        int totalEmployee =  weekHours /hoursEmployee;
        System.out.println("Всего работников в компании — "+ totalEmployee +" человек");
        totalEmployee += 94;
        System.out.println("Если в компании работает "+ totalEmployee +" человек, то всего "+
                totalEmployee * 8 +" часов работы может быть поделено между сотрудниками");
    }
}
