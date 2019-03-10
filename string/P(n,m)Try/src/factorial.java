public class factorial
{
    double supnum = 1;
    void mult(double num)
    {
        int max = 1;
        if (num > 1)
        {
            for (int i = 1; i <= num; i++)
            {
                if (max <= 12)
                {
                    supnum = supnum * i;
                    max++;
                }
                else if (max > 12)
                {
                    System.out.println("The count of supnum passes the capacity of 'int' !");
                }
            }
        }
        else if (num == 1 || num ==0)
        {
            supnum = 1;
        }
        else if (num<0)
        {
            //System.out.println("Error!");
            supnum = 0;
        }
        else
        {
            System.out.println("0000000000");
        }
    }
}
/*
n!/((n-m)!*m!)
*/
