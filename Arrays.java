public class Arrays{
	public static double[] powArray(double[] a, int n){
		double[] b = new double[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = Math.pow(a[i],n);
		}
		return b;
	}
	public static int[] histogram(int[] a, int counters){
		double counterwidth = 100.0/(double)counters;
		int[] b = new int[counters];
		for(double x : a) {
			b[(int)(x / counterwidth)]++;
		}
		return b;
	}
	public static void arrayPrintDouble(double[] a){
		for (double x : a){
			System.out.print(x + ",");
		}
		System.out.print("\n");
	}
	public static void arrayPrintInt(int[] a){
		for (int x : a){
			System.out.print(x + ",");
		}
		System.out.print("\n");
	}
	public static int indexOfMax(int[] a){ // This cannot be done using an enhanced for loop (at least not without introducing a counter anyways) as we need the indexOfMax
		int max = 0;
		int maxindex = 0;
		for (int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
				maxindex = i;
			}
		}
		return maxindex;
	}
	public static boolean[] sieve(int n){
		boolean[] output = new boolean[n];
		boolean[] marked = new boolean[n];
		int p = 2;
		int i;
		for (i = 2; i < n; i++) {
			output[i] = true;
		}
		while((p * p) < n){
			output[p] = true;
			for(i = (p * p); i < n; i += p){
				output[i] = false;
				marked[i] = true;
			}
			i = (p + 1);
			while(true){
				if (marked[i] == false){
					p = i;
					break;
				}
				if (i >= n){
					return output;
				}
				i++;
			}
		}
		return output;
	}
	public static void arrayPrintBool(boolean[] a){ // prints indexes of true values
		for(int i = 0; i < a.length; i++){
			if(a[i]){
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args){
		double[] a = new double[]{1.5,3,4,5,6};
		arrayPrintDouble(powArray(a,3));
		int[] b = new int[]{24,24,24,24,24,51,71,76,99};
		arrayPrintInt(histogram(b,4));
		int[] c = new int[]{4,5,1,9,1,2,4};
		System.out.println(indexOfMax(c));
		arrayPrintBool(sieve(100));
		return;
	}
}