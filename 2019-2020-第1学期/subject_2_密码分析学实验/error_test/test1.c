# include <stdio.h>

int main() {
    int SBoxIn[8] = {0x0,0x1,0x2,0x3,0x4,0x5,0x6,0x7};
    int i,j;
    for (i=0; i<8; i++) {
        for (j=0; j<8; j++) {
            printf("%d\t", SBoxIn[i]^SBoxIn[j]);
        }
        printf("\n");
    }
    
}
