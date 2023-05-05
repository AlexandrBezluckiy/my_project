public class HomeWork_IF_Year {
    public static void main(String[] args) {
        String NameOfMounth = "May";
        if (NameOfMounth == "January" || NameOfMounth == "February" || NameOfMounth == "December"){
            System.out.println("Winter");
        }
        else if (NameOfMounth == "March" || NameOfMounth == "April" || NameOfMounth == "May") {
            System.out.println("Spring");
        }
        else if (NameOfMounth == "June" || NameOfMounth == "July" || NameOfMounth == "August") {
            System.out.println("Summer");
        }
        else if (NameOfMounth == "September" || NameOfMounth == "October" || NameOfMounth == "November") {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Mounth not found!");
        }
    }
}
