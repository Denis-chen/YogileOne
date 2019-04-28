import java.io.*;

public class MyCP {
    public static void main(String args[]) {
        int choose=0;
        File readToFile = new File("temp.txt");
        File writeToFile = new File("temp.txt");
        if(args[0].equals("-tx")) {
            choose=1;
            readToFile = new File("/alive/string/str/MyCP/src/"+args[1]);
            writeToFile = new File("/alive/string/str/MyCP/src/"+args[2]);
        }
        else if(args[0].equals("-xt")) {
            choose=2;
            readToFile = new File("/alive/string/str/MyCP/src/"+args[1]);
            writeToFile = new File("/alive/string/str/MyCP/src/"+args[2]);
        }
        else {
            System.out.println("Choose Error!");
            System.exit(0);
        }

        char c[] =new char[100];
        try{
            String temp = null;
            Writer out = new FileWriter(writeToFile,true);
            Reader in  = new FileReader(readToFile);
            int n = -1;
            int number=0,mod=0;
            int element[]=new int[100];
            if (choose==1) {
                while((n=in.read(c,0,100))!=-1) {
                    temp=new String (c,0,n);
                    number=Integer.parseInt(temp);
                    int son=number,count=0,remain=0;
                    while (son>=1) {
                        son=son/2;
                        count++;
                    }
                    remain=count;
                    son=number;
                    while (son>=1) {
                        mod=son%2;
                        element[count]=mod;
                        son=son/2;
                        count--;
                    }
                    count++;
                    while (count<=remain) {
                        temp=String.valueOf(element[count]);
                        out.write(temp);
                        count++;
                    }
                }
                out.close();
            }
            else if (choose==2) {
                while((n=in.read(c,0,100))!=-1) {
                    temp=new String (c,0,n);
                    number=Integer.parseInt(temp);
                    int son=number,count=0,remain=0;
                    while (son>=1) {
                        son = son / 10;
                        count++;
                    }
                    remain=count;
                    son=number;
                    while (son>=1) {
                        mod=son%10;
                        element[count]=mod;
                        son=son/10;
                        count--;
                    }
                    count++;
                    mod=0;
                    while (count<=remain) {
                        mod=mod+element[count]*(int)Math.pow(2,(remain-count));
                        count++;
                    }
                    count=0;
                    while (number!=0) {
                        number=number/10;
                        count++;
                    }
                    temp=String.valueOf(mod);
                    out.write(temp);
                }
                out.close();
            }
            else {
                System.out.println("Choose Error!");
                System.exit(0);
            }
        }
        catch(IOException e) {
            System.out.println("Error "+e);
        }
    }
}
