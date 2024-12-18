import java.util.*;
class day
{
    void date()
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        switch(a)
        {
            case "monday":
            case "tuesday":
            System.out.print("weekday");
            break;
            case "sunday":
                System.out.print("weekend");
                break;
                default:
                    System.out.print("im");
        }

    }
}class main
{
    public static void main[String[]args]{
              day a=new day();
              a.date();

    }
}