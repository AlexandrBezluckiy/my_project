public class HomeWork_Case_Year {
    public static void main(String[] args) {
        String NameOfMounth = "May";
        int operator = 0;
        if (NameOfMounth.equals("January") || NameOfMounth.equals("February") || NameOfMounth.equals("December")) {
            operator = 1;
        }
        else if (NameOfMounth.equals("March") || NameOfMounth.equals("April") || NameOfMounth.equals("May")) {
            operator = 2;
        }
        else if (NameOfMounth.equals("June") || NameOfMounth.equals("July") || NameOfMounth.equals("August")) {
            operator = 3;
        }
        else if (NameOfMounth.equals("September") || NameOfMounth.equals("October") || NameOfMounth.equals("November")) {
            operator = 4;
        }
        switch (operator) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Mounth not found!");
                break;
        }
    }
}
