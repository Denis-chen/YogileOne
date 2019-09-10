public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append('S');
        buffer.append("tringBuffer");
        System.out.println(buffer.charAt(1));
        System.out.println(buffer.capacity());
        System.out.println(buffer.indexOf("tring12345"));
        System.out.println("buffer = " + buffer.toString());
        System.out.println(buffer.length());
    }
}