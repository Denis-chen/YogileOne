public class vaar {
	public static void main(String args[]) {
		public int f(int... x) {
			int sum = 0;
			for(int i=0;i<x.length;i++) {
				sum=sum+x[i];
			}
			System.out.println(sum);
		}
	}
}
