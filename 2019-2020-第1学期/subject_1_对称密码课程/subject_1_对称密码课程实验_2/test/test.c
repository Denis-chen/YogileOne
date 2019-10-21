#include <stdio.h>
#include <stdlib.h>

int main()
{
    int input[3],y[3],out[8];
    int i,j,k;
    int n = 0,temp = 0;
    for(i = 0; i<= 1;i++)
    {
        input[0] = i;
        for(j = 0;j <= 1;j++)
        {
            input[1] = j;
            for(k = 0;k <= 1;k++)
            {
                input[2] = k;
                y[0] = 1 ^ input[1];
                y[1] = (input[1] * input[0]) ^ input[2] ^ 1;
                y[2] = input[0];
                out[n] = (input[0] * y[0]) ^ (input[1] * y[1]) ^ (input[2] * y[2]);
                n++;
            }
        }
    }
    printf("result: \n");
    for(i = 0;i < 8;i++)
    {
        printf("%3d",out[i]);
    }
    printf("\n");
    for(i = 0;i < 8;i++)
    {
        if(temp < out[i])
        {
            temp = out[i];
        }
    }
    printf("Algebraic number:%d",temp);
    return 0;
}
