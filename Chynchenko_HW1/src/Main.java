public class Main
{
    public static void main(String[] args)
    {
        //Task 1

        System.out.println("Chynchenko Svitlana");

        //Task 2

for(int y=5, i=0;i<=10;i++,y+=2)
{
    System.out.println("Step "+ i + " value " + y);
}

//Task 3

for (int i=0;i<=10;i++)
            {
                System.out.println("Step "+ i);
                if (i == 3)
                {
                 continue;
                }
                if(i == 6)
                {
                  break;
                }
            }
    }
}