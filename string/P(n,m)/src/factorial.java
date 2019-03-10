public class factorial      //实现阶乘运算
{
    int supnum = 1, choice = 0;
    void mult(int num)
    {
        int innum=1, inchoice=0, max=0;
        if (num > 1)
        {
            for (int i=1; i<=num; i++, max++)
            {
                innum = innum * i;
            }
            if (max > 12)
            {
                //System.out.println("The count of supnum passes the capacity of 'int' !");
                inchoice = 1;
            }
        }
        else if (num == 1 || num ==0)
        {
            innum = 1;
        }
        else
        {
            innum = 0;
        }
        supnum = innum;
        choice = inchoice;

    }
}
/*
n!/((n-m)!*m!)
*/
