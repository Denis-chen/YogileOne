import java.util.Objects;
/**
 * @author 10542
 */
public class MyList {
    public static void main(String [] args) {
        int [] magicNumber = new int[]{3,4,20175221};
        //选用合适的构造方法，用你学号前后各两名同学的学号创建四个结点
        Node<Integer> []stud = new Node[4];
        for (int i=0,j=magicNumber[2]; i<magicNumber[1]; i++) {
            if (i==2) {
                j++;
            }
            stud[i] = new Node (j+i, new Node ());
        }

        //把上面四个节点连成一个没有头结点的单链表
        for (int i=0; i<magicNumber[0]; i++) {
            stud[i].next=stud[i+1];
        }

        //遍历单链表，打印每个结点的
        System.out.println ("遍历（添加前）：" );
        Node<Integer> temp = new Node ();
        temp=stud[0];
        for (;temp.next!=null;) {
            System.out.print (temp.data+"  ");
            temp=temp.next;
        }

        //把你自己插入到合适的位置（学号升序）
        Node<Integer> me = new Node(20175223,new Node ());
        for (int i=0;i<magicNumber[1]; i++) {
            if ((me.data > stud[i].data) && (me.data < stud[i + 1].data)) {
                stud[i].next=me;
                me.next=stud[i+1];
            }
        }

        //遍历单链表，打印每个结点的
        System.out.println ("\n遍历（添加后）：" );
        temp=stud[0];
        for (;temp.next!=null;) {
            System.out.print (temp.data+"  ");
            temp=temp.next;
        }

        //从链表中删除自己
        temp=stud[0];
        //
        for (;temp.next!=null;) {
            if (Objects.equals (temp.next.data, me.data)) {
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }

        //遍历单链表，打印每个结点的
        System.out.println ("\n遍历（删除后）：" );
        temp=stud[0];
        for (;temp.next!=null;) {
            System.out.print (temp.toString ()+"  ");
            temp=temp.next;
        }
    }
}
