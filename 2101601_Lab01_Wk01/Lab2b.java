public class Lab2b 
{
    public static void main(String[] args) 
    {   
        //Reference to Example3
        String modcode = "CSC1009";
        switch (modcode)
        {
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
            break;
            case "CSC1006":
                System.out.println("Mathematics 2");
            break;
            case "CSC1007":
                System.out.println("Operating Systems");
            break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
            break;
            case "CSC1010":
                System.out.println("Computer Networks");
            break;
            default:
                System.out.println("Module Code does not exist");
            break;
        }
        System.out.println();
    }    
}
