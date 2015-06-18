package projectEuler;

public class Problem49 {
	static int[] a=new int[3];
	public static void main(String[] args) {
		for(int i=1000;i<9999;i++){
			String s= Integer.toString(i);
			permute(s);
			System.out.print(a[0]+a[1]+a[2]);
		}
	}

	public static void permute(String input) {
		int inputLength = input.length();
		boolean[] used = new boolean[inputLength];
		StringBuffer outputString = new StringBuffer();
		char[] in = input.toCharArray();
		doPermute(in, outputString, used, inputLength, 0);

	}

	public static void doPermute(char[] in, StringBuffer outputString,
			boolean[] used, int inputLength, int level) {
		//int[] a=new int[3];
		int index=0;
		if (level == inputLength) {
			//System.out.println(outputString.toString());
			int i=Integer.parseInt(outputString.toString());
			System.out.println(i);
			if(PrimeNumber.PrimeNumber.test(i)==0){
				a[index]=i;
				index++;
			}
			if(a[2]-a[1]==a[1]-a[0]){
			//	System.out.println(a[0]+a[1]+a[2]);
				index=0;
				return;
			}
			
		}

		for (int i = 0; i < inputLength; ++i) {

			if (used[i])
				continue;

			outputString.append(in[i]);
			used[i] = true;

			doPermute(in, outputString, used, inputLength, level + 1);
			used[i] = false;
			outputString.setLength(outputString.length() - 1);
		}

	}

}
