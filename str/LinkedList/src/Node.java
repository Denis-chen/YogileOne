public class Node<T>                             //单链表结点类，T指定结点的元素类型
{
    /**
    * 数据域，存储数据元素
    */
    public T data;

    /**
     * 地址域，引用后继结点
     */
    public Node<T> next;

    /**
     * 构造结点，data指定数据元素，next指定后继结点
     */
    public Node(T data, Node<T> next)

    {
        this.data = data;
        //T对象引用赋值
        this.next = next;
        //Node<T>对象引用赋值
    }
    public Node()
    {
        this(null, null);
    }

    @Override
    public String toString()                     //返回结点数据域的描述字符串
    {
        return this.data.toString();
    }
}

