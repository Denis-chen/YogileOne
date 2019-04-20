public class weekly {
    public static void main(String args[]){
        //定义一个数组，比如
        int arr[] = {1,2,3,4,5,6,7,8};

        //打印原始数组的值
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();

        // 添加代码删除上面数组中的5
        int delete = 9;
        for(int i=0; i<7; i++){
            if (arr[i]==5) {
                delete=i;
            }
        }
        for (int i=0; i<7; i++) {
            if (i>=delete && i<7) {
                arr[i]=arr[i+1];
            }
        }
        arr[7]=0;

        //打印出 1 2 3 4 6 7 8 0
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        // 添加代码再在4后面5
        for (int i=7; i<=7 && i>=5; i--) {
            arr[i]=arr[i-1];
        }
        arr[4]=5;

        //打印出 1 2 3 4 5 6 7 8
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
