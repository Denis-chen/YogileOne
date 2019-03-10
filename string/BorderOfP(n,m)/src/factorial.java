public class factorial
{
    int supnum = 1;
    void mult(int  num)
    {
        int max = 1;
        int tt = 1;
        if (num > 1)
        {
            for (int i = 1; i <= num; i++)
            {
                if (max <= 12)
                {
                    tt = tt * i;
                    max++;
                }
                else if (max > 12)
                {
                    System.out.println("The count of supnum passes the capacity of 'int' !");
                    return;
                }
            }
            supnum = tt;
            System.out.println("supnum="+supnum);
        }
        else if (num == 1 || num ==0)
        {
            supnum = 1;
        }
        else if (num<0)
        {
            System.out.println("Error: factorial_num<0.");
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
