import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) {
        //使用第二种构造方法，包含三本本学期教材内容
        Book bookOld[] = new Book[3];
        bookOld[0] = new Book("Java2实用教程","耿祥义","清华大学出版社","2017");
        bookOld[1] = new Book("算法与数据结构","张乃孝","高等教育出版社","2011");
        bookOld[2] = new Book("密码学","郑秀林","金城出版社","2016");

        //实现添加书籍的功能
        System.out.println("Input the number of books:");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();      //吸收上个输入最后的回车字符
        Book book[] = new Book[num];        //Java在数组的定义中并不为数组元素分配内存，因此[]中不需指明数组长度
                                            // 而且对于如上定义的数组是不能引用的，必须经过初始化才可以引用。
        for (int i=0; i<num; i++) {         //为空指针分配内存
            book[i] = new Book();
        }

        String [] inputInform = new String[4];
        for (int i=0; i<num; i++) {
            for (int j=0; j<4; j++) {
                System.out.println("Input the book "+(i+1)+" information of "+bookOld[0].infor[j]);
                inputInform[j] = reader.nextLine();
            }
            book[i].setBookName(inputInform[0]);
            book[i].setBookWriter(inputInform[1]);
            book[i].setBookPress(inputInform[2]);
            book[i].setBookDate(inputInform[3]);
        }

        //实现功能列表、选择和列表循环
        for (int menuNum=0; menuNum!=-1; menuNum++) {
            System.out.println("Input the number of functions to complete:\n"+"1. Make a list of books.\n"
                    +"2. Determine the accuracy of information in a book.\n"+"0. Exit.");
            int choice = reader.nextInt();
            reader.nextLine();
            if (choice==0) {        //选择 0 ，推出程序
                menuNum=-2;
            }
            else if (choice==1) {       //选择 1 ，列出书籍列表
                System.out.println("书籍列表如下：");
                for (int i=0; i<3; i++) {
                    System.out.println(bookOld[i].toString());
                }
                for (int i=0; i<num; i++) {
                    System.out.println(book[i].toString());
                }
            }
            else if (choice==2) {       //选择 2 ， 验证书籍信息完整性
                System.out.println("Input the book's number that you wanna search:");
                int num2 = reader.nextInt();
                reader.nextLine();
                System.out.println("Input the book's information:");
                Book searchBook = new Book();

                for (int j=0; j<4; j++) {
                    System.out.println("Input the book information (which you wanna) of "+bookOld[0].infor[j]);
                    inputInform[j] = reader.nextLine();
                }
                searchBook.setBookName(inputInform[0]);
                searchBook.setBookWriter(inputInform[1]);
                searchBook.setBookPress(inputInform[2]);
                searchBook.setBookDate(inputInform[3]);

                if (num2<=3) {
                    if (bookOld[num2-1].toString().equals(searchBook.toString())) {
                        System.out.println("Perfect. The book information is completely consistent.");
                        System.out.println("The "+num2+" book's information: "+bookOld[num2-1].toString());
                    }
                    else {
                        System.out.println("The information you entered for the book does not match the list.");
                    }
                }
                else if (num2>3 && num2<=3+num) {
                    if (book[num2-4].toString().equals(searchBook.toString())) {
                        System.out.println("Perfect. The book information is completely consistent.");
                        System.out.println("The "+num2+" book's information: "+book[num2-4].toString());
                    }
                    else {
                        System.out.println("The information you entered for the book does not match the list.");
                    }
                }
                else {
                    System.out.println("Enter the number error.");
                }

            }
            else {      //选择出错，结束当前 if-else 语句
                System.out.println("Enter error.");
            }

            System.out.println();
        }
    }
}

