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

void truly_list() {
    int i,j;
    int num_shang=0, num_yu=0;
    int num_two_x[3]={0}, num_two_y[3]={0};
    int result_form_x[8][3]={{0},{0},{0}};
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
    
    for (i=0; i<8; i++) {
        for (j=0; j<3; j++) {
            printf("%d ", result_form_x[i][j]);
        }
        printf("\t");
        for (j=0; j<3; j++) {
            printf("%d ", result_form_y[i][j]);
        }
        printf("\n");
    }
}

/**
 代数次数和项数分布
  
void Formal_from(int x, int y) {
    int i;
    int num_shang=0, num_yu=0;
    int num_two_x[3]={0}, num_two_y[3]={0};
    int result_form[3]={0};
    
    num_shang = y;
    // num_two[0] 代表最低项00
    for (i=0; i< 3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_y[i] = num_yu;
    }
    
    num_shang=0;
    num_yu=0;
    num_shang = x;
    // num_two[0] 代表最低项00
    for (i=0; i< 3 && num_shang != 0; i++) {
        num_yu = num_shang%2;
        num_shang = num_shang/2;
        num_two_x[i] = num_yu;
    }
    
    if (num_two_y[0] == 1) {
        
        for (i=0; i< 3; i++) {
            if(num_two_x[i] == 0) {
                result_form[i] = 1;
            }
            else if (num_two_x[i] == 1) {
                result_form[i] = 1;
            }
        }
        
    }
}
*/
int main() {
    int i=0, j=0;
    int S_a_b[8][8]={0x0};
    
    
    
    printf("\n\n123123表\n");
    i = Fn_fm_y();
    
    
    printf("\n");
    printf("\n\n");
   
    
    printf("\n");
    
    return 0;
}
