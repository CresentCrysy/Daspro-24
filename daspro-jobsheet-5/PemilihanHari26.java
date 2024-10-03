import java.util.Scanner;
public class PemilihanHari26 {
    public static void main(String[] args) {
        String dayName, dayType;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekdays";    
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "Invalid day name";
        }

        System.out.println(dayName+" is a"+dayType);
    }
}
