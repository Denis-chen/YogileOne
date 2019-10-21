# include <stdio.h>

int SBoxIn[16] = {0x0,0x1,0x2,0x3,0x4,0x5,0x6,0x7,0x8,0x9,0xA,0xB,0xC,0xD,0xE,0xF};
int SBoxOut[16] = {0xC,0x5,0x6,0xB,0x9,0x0,0xA,0xD,0x3,0xE,0xF,0x8,0x4,0x7,0x1,0x2};

// C 5 6 B 9 0 A D 3 E F 8 4 7 1 2

/**
  * 对aIn输出S(aIn)
  */
int S_Box_Out_I(int aIn) {
    int i;
    for (i=0; i<16; i++) {
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
    int num_two[4]={0};
    num_shang = aIn;
    for (i=0; i<4 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two[i] = num_yu;
        int SBCrea_next[4] = {3,2,2,5};
    }
    for (i=3; i>=0; i--) {
        printf("%d", num_two[i]);
    }
}

/**
  * 实现S(x)^S(x^a)=b，（“^”表示抑或），计算差分分析度
  */
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


/**
  * 实现点乘
  */
int point_mul(int x, int y) {
    int i=0, result_pm=0;
    
    int num_shang=0, num_yu=0;
    int num_two_a[4]={0}, num_two_b[4]={0};
    int point_mul[4]={0};
    
    num_shang = x;
    // num_two[0]为最低位，num_two[3]最高位
    for (i=0; i<4 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_a[i] = num_yu;
    }
    
    num_shang=0;
    num_yu=0;
    num_shang = y;
    // num_two[0]为最低位，num_two[3]最高位
    for (i=0; i<4 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_b[i] = num_yu;
    }
    
    int j=0;
    for (j=0; j<4; j++) {
        point_mul[j] = num_two_a[j] * num_two_b[j];
    }
    result_pm=point_mul[0];
    for (j=1; j<4; j++) {
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
    
    for (i=0; i<16; i++) {
        x = point_mul(aIn, SBoxIn[i]);
        y = point_mul(bIn, SBoxOut[i]);
        // printf("(x:%d, y:%d) ",x,y);
        if ( x == y) {
            count++;
        }
    }
    return count;
}




/**
  * 调用函数，将统计信息和二进制信息制表输出显示
  */
int main()
{
    int i=0, j=0;
    int S_a_b[16][16]={0x0}, S_ab_noline[16][16]={0x0};
    
    for (i=0; i<16; i++) {
        for (j=0; j<16; j++) {
            S_a_b[i][j] = Count_SBox_ab(SBoxIn[i], SBoxIn[j]);
        }
    }
    for (i=0; i<16; i++) {
        for (j=0; j<16; j++) {
            S_ab_noline[i][j] = Count_ab_noline(SBoxIn[i], SBoxIn[j]);
        }
    }
    
    printf("S盒：\n");
    for (i=0; i<16; i++) {
        printf("0x%d\t",SBoxIn[i]);
    }
    printf("\n");
    for (i=0; i<16; i++) {
        printf("0x%d\t",SBoxOut[i]);
    }
    
    printf("\n\n差分分析表\n(a,b)\t");
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
    
    printf("\n\n非线性度表\n(a,b)\t");
    for (i=0; i<16; i++) {
        Sixteen_to_two(SBoxIn[i]);
        printf("\t");
    }
    
    for (i=0; i<16; i++) {
        printf("\n");
        Sixteen_to_two(SBoxIn[i]);
        printf("\t");
        for (j=0; j<16; j++) {
            printf(" %d\t",S_ab_noline[i][j]);
        }
    }
    printf("\n");
    return 0;
}
