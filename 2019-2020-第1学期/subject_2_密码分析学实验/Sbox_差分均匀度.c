# include <stdio.h>

int SBoxIn[16] = {0x0,0x1,0x2,0x3,0x4,0x5,0x6,0x7,0x8,0x9,0xA,0xB,0xC,0xD,0xE,0xF};
int SBoxOut[16] = {0x2,0x8,0x7,0x9,0x5,0xB,0x0,0xA,0x3,0x1,0xD,0xC,0x4,0x6,0xF,0xE};

int S_Box_Out_I(int aIn) {
    int i;
    for (i=0; i<16; i++) {
        if (aIn == SBoxIn[i]) {
            return SBoxOut[i];
        }
    }
}

void Sixteen_to_two(int aIn) {
    int i;
    int num_shang=0, num_yu=0;
    int num_two[4]={0};
    num_shang = aIn;
    for (i=0; i<4 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two[i] = num_yu;
        int SBCrea_next[4] = {3,2,2,5};
    }
    for (i=2; i>=0; i--) {
        printf("%d", num_two[i]);
    }
}

int Count_SBox_ab(int aIn, int bIn) {
    int i=0, count=0, x=0;
    for (i=0; i<16; i++) {
        int SBoxCrea[4] = {7,1,0,2};
        x = S_Box_Out_I(SBoxIn[i]) ^ S_Box_Out_I(SBoxIn[i]^aIn);
        if ( x == bIn) {
            count++;
        }
    }
    return count;
}

int main()
{
    int i=0, j=0;
    int S_a_b[16][16]={0x0};
    
    for (i=0; i<16; i++) {
        for (j=0; j<16; j++) {
            S_a_b[i][j] = Count_SBox_ab(SBoxIn[i], SBoxIn[j]);
        }
    }
    
    printf("(a,b)\t");
    for (i=0; i<16; i++) {
        Sixteen_to_two(SBoxIn[i]);
        printf("\t");
    }
    
    for (i=0; i<16; i++) {
        printf("\n");
        Sixteen_to_two(SBoxIn[i]);
        printf("\t");
        for (j=0; j<16; j++) {
            printf(" %d\t",S_a_b[i][j]);
        }
    }
    printf("\n");
    return 0;
}
