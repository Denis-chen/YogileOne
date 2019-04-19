import java.util.Scanner;

public class Complex {
    double RealPart;
    double ImagePart;

    public double getRealPart() {
        return RealPart;
    }
    public void setRealPart(double realPart) {
        RealPart = realPart;
    }
    public double getImagePart() {
        return ImagePart;
    }
    public void setImagePart(double imagePart) {
        ImagePart = imagePart;
    }

    public Complex() {
        this.RealPart=0;
        this.ImagePart=0;
    }
    public Complex(double R,double I) {
        this.RealPart=R;
        this.ImagePart=I;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Complex) {

            Complex another = (Complex) obj;

            if ((this.getImagePart()==(another.getImagePart()))
                    && (this.getRealPart() == another.getRealPart()))
                return true;
        } else {
            return false;
        }
        return false;
    }
    public String toString() {
        return this.RealPart+"+ "+this.ImagePart+"i";
    }

    public void complexAdd(Complex comOne, Complex comTwo) {
        this.RealPart = comOne.RealPart+comTwo.RealPart;
        this.ImagePart = comOne.ImagePart+comTwo.ImagePart;
    }

    public void complexSub(Complex comOne, Complex comTwo) {
        this.RealPart = comOne.RealPart-comTwo.RealPart;
        this.ImagePart = comOne.ImagePart-comTwo.ImagePart;
    }

    public void complexMulti(Complex comOne, Complex comTwo){
        this.RealPart = comOne.RealPart*comTwo.RealPart - comOne.ImagePart*comTwo.ImagePart;
        this.ImagePart = comOne.ImagePart*comTwo.RealPart + comOne.RealPart*comTwo.ImagePart;
    }

    public void complexDiv(Complex comOne, Complex comTwo) {
        this.RealPart = (comOne.RealPart*comTwo.RealPart+comOne.ImagePart*comTwo.ImagePart)/(comTwo.RealPart*comTwo.RealPart+comTwo.ImagePart*comTwo.ImagePart);
        this.ImagePart = (comOne.ImagePart*comTwo.RealPart-comOne.RealPart*comTwo.ImagePart)/(comTwo.RealPart*comTwo.RealPart+comTwo.ImagePart*comTwo.ImagePart);
    }
}


class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double ele[]= {0,0,0,0};
        for (int i=0,j=0; i<4; i++) {
            if (i%2==0) {
                j++;
                System.out.println("请输入第 "+j+" 个复数 x+yi 的实部 x 和虚部 y ：");
            }
            ele[i]=reader.nextDouble();
        }
        Complex fushu1 = new Complex(ele[0], ele[1]);
        Complex fushu2 = new Complex(ele[2], ele[3]);
        Complex result = new Complex();
        while (true) {
            System.out.println("请输入需要进行的运算： \n1.加法 \n2.减法 \n3.乘法 \n4.除法 \n0.退出");
            int choice = reader.nextInt();
            switch (choice) {
                case 1:
                    result.complexAdd(fushu1, fushu2);
                    System.out.println(result.toString());
                    break;
                case 2:
                    result.complexSub(fushu1, fushu2);
                    System.out.println(result.toString());
                    break;
                case 3:
                    result.complexMulti(fushu1, fushu2);
                    System.out.println(result.toString());
                    break;
                case 4:
                    result.complexDiv(fushu1, fushu2);
                    System.out.println(result.toString());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("错误");
            }
            System.out.println("\n");
        }
    }
}
