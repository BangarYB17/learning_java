enum day{
            monday,
            tuesday,
            wednesday,
            thursday,
            friday,
            saturday,
            sonday
        };
public class week {
    public static void main(String[] args) {
        day today=day.monday;
        switch(today){
        case monday:
            System.out.println("Monday");
            break;
        case tuesday:
            System.out.println("Tuesday");
            break;
        case wednesday:
            System.out.println("Wednesday");
            break;
        case thursday:
            System.out.println("Thursday");
            break;
        case friday:
            System.out.println("Friday");
            break;
        case saturday:
            System.out.println("Saturday");
            break;
        case sonday:
            System.out.println("sonday");
            break;
        default:
            System.out.println("Wrong input ,try again");
        }
    }
}
