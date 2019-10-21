# include <stdio.h>

int SBoxIn[16] = {0x0,0x1,0x2,0x3,0x4,0x5,0x6,0x7};
int SBoxOut[16] = {0x3,0x7,0x2,0x4,0x1,0x5,0x0,0x6};
// 37241506
/**
  * 对aIn输出S(aIn)
  */
int S_Box_Out_I(int aIn) {
    int i;
    for (i=0; i<8; i++) {
        if (aIn == SBoxIn[i]) {
            return SBoxOut[i];
        }
    }
}

/**
  * 将aIn十六进制转二进制输出
  */
void Sixteen_to_two(int aIn) {
    int i;
    int num_shang=0, num_yu=0;
    int num_two[3]={0};
    num_shang = aIn;
    for (i=0; i<3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two[i] = num_yu;
        int SBCrea_next[4] = {3,2,2,5};
    }
    for (i=2; i>=0; i--) {
        printf("%d", num_two[i]);
    }
}



/**
  * 实现点乘
  */
int point_mul(int x, int y) {
    int i=0, result_pm=0;
    
    int num_shang=0, num_yu=0;
    int num_two_a[3]={0}, num_two_b[3]={0};
    int point_mul[3]={0};
    
    num_shang = x;
    // num_two[0]为最低位，num_two[3]最高位
    for (i=0; i<3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_a[i] = num_yu;
    }
    
    num_shang=0;
    num_yu=0;
    num_shang = y;
    // num_two[0]为最低位，num_two[3]最高位
    for (i=0; i<3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_b[i] = num_yu;
    }
    
    int j=0;
    for (j=0; j<3; j++) {
        point_mul[j] = num_two_a[j] * num_two_b[j];
    }
    result_pm=point_mul[0];
    for (j=1; j<3; j++) {
        result_pm=result_pm ^ point_mul[j];
    }
    // printf("[a:%d, b:%d]", x,y);
    return result_pm;
}

/**
  * 实现，计算非线性度
  */
int Count_ab_noline(int aIn, int bIn) {
    int i=0, count=0, x=0, y=0;
    
    for (i=0; i<8; i++) {
        x = point_mul(aIn, SBoxIn[i]);
        y = point_mul(bIn, SBoxOut[i]);
        // printf("(x:%d, y:%d) ",x,y);
        if ( x == y) {
            count++;
        }
    }
    return count;
}

int main() {
    int i=0, j=0;
    int S_a_b[8][8]={0x0};
    
    for (i=0; i<8; i++) {
        for (j=0; j<8; j++) {
            S_a_b[i][j] = Count_ab_noline(SBoxIn[i], SBoxIn[j]);
        }
    }
    
    printf("S盒：\n");
    for (i=0; i<8; i++) {
        printf("0x%d\t",SBoxIn[i]);
    }
    printf("\n");
    for (i=0; i<8; i++) {
        printf("0x%d\t",SBoxOut[i]);
    }
    
    printf("\n\n非线性度表\n(a,b)\t");
    for (i=0; i<8; i++) {
        Sixteen_to_two(SBoxIn[i]);
        printf("\t");
    }
    
    for (i=0; i<8; i++) {
        printf("\n");
        Sixteen_to_two(SBoxIn[i]);
        printf("\t");
        for (j=0; j<8; j++) {
            printf(" %d\t",S_a_b[i][j]);
        }
    }
    printf("\n");
    printf("\n\n");
    printf("%d", Count_ab_noline(SBoxIn[0], SBoxIn[0]));
    
    printf("\n");
    
    return 0;
}
