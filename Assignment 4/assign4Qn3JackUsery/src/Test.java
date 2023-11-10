import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

    Person person1 = new Person();

    person1.setName("Jack");
    person1.setAddress("1234 Main St.");
    person1.setPhoneNumber("123-456-7890");
    person1.setEmailAddress("jack@gmail.com");

    System.out.println(person1.toString());

    PartTimeEmployee parttimeEmployee1 = new PartTimeEmployee();

    parttimeEmployee1.setName("John");
    parttimeEmployee1.setAddress("1111 Main St.");
    parttimeEmployee1.setPhoneNumber("111-111-1111");
    parttimeEmployee1.setEmailAddress("john@gmail.com");
    parttimeEmployee1.setClassStatus(PartTimeEmployee.classStatusSeasonal);
    parttimeEmployee1.setPayRate(10.00);

    System.out.println(parttimeEmployee1.toString());

    FullTimeEmployee fulltimeEmployee1 = new FullTimeEmployee();

    fulltimeEmployee1.setName("Jane");
    fulltimeEmployee1.setAddress("2222 Main St.");
    fulltimeEmployee1.setPhoneNumber("222-222-2222");
    fulltimeEmployee1.setEmailAddress("jane@gmail.com");
    fulltimeEmployee1.setOffice("Office 1");
    fulltimeEmployee1.setSalary(50000.00);

    System.out.println(fulltimeEmployee1.toString());

    ArrayList<Junior> juniorTeam = new ArrayList<>();

    juniorTeam.add(new Junior("Junior 1", "3333 Main St.", "333-333-3333", "junior1@gmail.com", "Office 2", 40000.00, "01/01/2020", "Mentor 1", "Rank 1"));

    System.out.println(juniorTeam.toString());

    Senior senior1 = new Senior();

    senior1.setName("Senior 1");
    senior1.setAddress("4444 Main St.");
    senior1.setPhoneNumber("444-444-4444");
    senior1.setEmailAddress("Senior1@gmail.com");
    senior1.setOffice("Office 3");
    senior1.setSalary(60000.00);
    senior1.setDateHired("01/01/2020");
    senior1.setJuniorsTeam(juniorTeam);
    senior1.setCompanyStocks(10000.00);

    System.out.println(senior1.toString());























    }





}
