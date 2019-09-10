public class Recursion {                //执行C(n,m)的递归公式
    int recursion(int n, int m) {
        int nChildren = n-1;
        int[] mChildren = new int[2];
        int result;
        mChildren[0] = m-1;
        mChildren[1] = m;
        if (nChildren < mChildren[1] || nChildren==0 || mChildren[1]==0) {
            return 1;
        }
        result = recursion(nChildren, mChildren[0])+recursion(nChildren, mChildren[1]);
        return result;
    }
}

