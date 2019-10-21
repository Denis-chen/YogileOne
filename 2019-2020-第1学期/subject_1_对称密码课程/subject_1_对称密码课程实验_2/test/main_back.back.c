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

int Fn_fm_y(int x, int y) {
    int y2=0,y1=0,y0=0, x2=0,x1=0,x0=0;
    
    int i,j;
    int num_shang=0, num_yu=0;
    int num_two_x[3]={0}, num_two_y[3]={0};
    int result_form_x[8][3]={{0},{0},{0}}
    int result_form_y[8][3]={{0},{0},{0}};
    
    // 列真值表左x
    for (i=0; i<8; i++) {
        num_shang = SBoxIn[i];
        // num_two[0] 代表最低项00
        for (j=0; j<3 && num_shang != 0; j++) {
            num_yu = num_shang%2;
            num_shang = num_shang/2;
            result_form_x[i][j] = num_yu;
        }
    }
    
    // 列真值表右y
    num_shang=0;
    num_yu=0;
    for (i=0; i<8; i++) {
        num_shang = SBoxOut[i];
        // num_two[0] 代表最低项00
        for (j=0; j<3 && num_shang != 0; j++) {
            num_yu = num_shang%2;
            num_shang = num_shang/2;
            result_form_y[i][j] = num_yu;
        }
    }
    
    // 得到y0~y1异或项式的元素
    int count_y[3]={0};
    int ele_xor[4][3]={{0},{0},{0}};
    for (i=0; i<8; i++) {
        if (result_form_y[i][0] == 1) {
            
            for (j=0; j<3; j++) {
                ele_xor[count_y[0]][j] = result_form_x[i][j];
            }
            count_y[0]++;
        }
        /*
        if (result_form_y[i][1] == 1) {
            count_y[1]++;
            for (j=0; j<3; j++) {
                ele_xor[1][j] = result_form_x[i][j];
            }
        }
        if (result_form_y[i][2] == 1) {
            count_y[2]++;
            for (j=0; j<3; j++) {
                ele_xor[2][j] = result_form_x[i][j];
            }
        }
        */
    }
    
    
    // 求得异或结果
    int xor_next[count_y[0]/2][3]={{2},{2},{2}};
    for (i=0; i<count_y[0]; i=i+2) {
        if (ele_xor[i][j] == ele_xor[i+1][j]) {
            if (ele_xor[i][j+1] == ele_xor[i+1][j+1]) {
                if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                    // 不会发生
                }
                else {
                    //(2) -2-1-0 ^ -2-10 = -2-1
                    xor_next[i] = {{ele_xor[i][j]},{ele_xor[i][j+1]},{2}}
                }
            }
            else {
                if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                    //(2) -2-1-0 ^ -21-0 = -2-0
                }
                else {
                    //(3) -2-1-0 ^ -210 = -2-1-0 ^ -210
                }
            }
        }
        else {
            if (ele_xor[i][j+1] == ele_xor[i+1][j+1]) {
                if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                    //(2) -2-1-0 ^ 2-1-0 = -1-0
                }
                else {
                    //(3) -2-1-0 ^ 2-10 = -2-1-0 ^ 2-10
                }
            }
            else {
                if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                    //(3) -2-1-0 ^ 21-0 = -2-1-0 ^ 21-0
                }
                else {
                    //(3) -2-1-0 ^ 210 = -2-1-0 ^ 210
                }
            }
        }
    }
    count_y[0] = count_y[0]/2;
    /*
    if (ele_xor[i][j] == ele_xor[i+1][j]) {
        if (ele_xor[i][j+1] == ele_xor[i+1][j+1]) {
            if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                // 不会发生
            }
            else {
                //(2) -2-1-0 ^ -2-10 = -2-1
            }
        }
        else {
            if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                //(2) -2-1-0 ^ -21-0 = -2-0
            }
            else {
                //(3) -2-1-0 ^ -210 = -2-1-0 ^ -210
            }
        }
    }
    else {
        if (ele_xor[i][j+1] == ele_xor[i+1][j+1]) {
            if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                //(2) -2-1-0 ^ 2-1-0 = -1-0
            }
            else {
                //(3) -2-1-0 ^ 2-10 = -2-1-0 ^ 2-10
            }
        }
        else {
            if (ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
                //(3) -2-1-0 ^ 21-0 = -2-1-0 ^ 21-0
            }
            else {
                //(3) -2-1-0 ^ 210 = -2-1-0 ^ 210
            }
        }
    }
    */
    
    /*
    if (ele_xor[i][j] != ele_xor[i+1][j] 
        && ele_xor[i][j+1] == ele_xor[i+1][j+1] 
        && ele_xor[i][j+2] == ele_xor[i+1][j+2]) {
        
    }
    */
    
    /*
    if (ele_xor[i][j] ^ ele_xor[i+1][j] == 1
        && ele_xor[i][j+1] ^ ele_xor[i+1][j+1] == 0
        && ele_xor[i][j+2] ^ ele_xor[i+1][j+2] == 0)
    */
    
    
}

/**
  * 代数次数和项数分布
  */
void Formal_from(int x, int y) {
    int i;
    int num_shang=0, num_yu=0;
    int num_two_x[3]={0}, num_two_y[3]={0};
    int result_form[3]={0};
    
    num_shang = y;
    // num_two[0] 代表最低项00
    for (i=0; i<3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_y[i] = num_yu;
    }
    
    num_shang=0;
    num_yu=0;
    num_shang = x;
    // num_two[0] 代表最低项00
    for (i=0; i<3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_x[i] = num_yu;
    }
    
    if (num_two_y[0] == 1) {
        
        for (i=0; i<3; i++) {
            if(num_two_x[i] == 0) {
                result_form[i] = 1;
            }
            else if (num_two_x[i] == 1) {
                result_form[i] = 1;
            }
        }
        
    }
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
