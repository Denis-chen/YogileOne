public class Book {
    String bookName;
    String bookWriter;
    String bookPress;
    String bookDate;

    //定义getter和setter方法
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    String infor[] = {"bookName","bookWriter","bookPress","bookDate"};
    String tostr;

    //覆盖（Override）toString方法，返回良好的含有多行的书的描述信息
    public String toString(){
        tostr = "书名："+this.bookName+" 作者："+this.bookWriter+" 出版社："+this.bookPress+" 出版日期："+this.bookDate;
        return tostr;
    }

    //覆盖equals方法，验证书名，作者，出版社和出版日期完全一致
    public boolean equals(Object o){
        if (this == o)
            return true;

        //再判断是不是Book类,提高代码的健壮性
        if (o instanceof Book) {

            //向下转型,父类无法调用子类的成员和方法
            Book another = (Book) o;

            //最后判断类的所有属性是否相等，其中String类型和Object类型可以用相应的equals()来判断
            if ((this.getBookName().equals(another.getBookName())) && (this.getBookWriter() == another.getBookWriter())
                    && (this.getBookPress().equals(another.getBookPress())) && (this.getBookDate().equals(another.getBookDate())))
                return true;
        } else {
            return false;
        }
        return false;
    }

    //定义三个构造方法，接收并初始化这些数据
    Book(){     //设为空
        bookName = null;
        bookWriter = null;
        bookPress = null;
        bookDate = null;
    }

    Book(String bookName, String bookWriter, String bookPress, String bookDate) {       //使用分别赋值
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookPress = bookPress;
        this.bookDate = bookDate;
    }

    Book(String bookInfor[]) {       //使用数组赋值
        this.bookName = bookInfor[0];
        this.bookWriter = bookInfor[1];
        this.bookPress = bookInfor[2];
        this.bookDate = bookInfor[3];
    }
}
