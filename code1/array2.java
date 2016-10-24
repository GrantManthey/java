import java.util.Arrays;
class Array2 {
		public static void printArray(int[] iarray) {
			int length = iarray.length;
			int i;
				for (i = 0; i < length; i++){
					System.out.print(iarray[i]);
					System.out.print(" . ");
					}
				}
				
				public static void main (String a[]){
				int i;
				int[] ia ;ia = new int[20];
						ia[0] = -4;
						ia[1] = -8;
						ia[2] = -4;
						ia[3] = -8;
						ia[4] = -4;
						ia[5] = -8;
						ia[6] = -4;
						ia[7] = -8;
						ia[8] = -4;
						ia[9] = -8;
						ia[10] = -4;
						ia[11] = -8;
						//print array
					printArray(ia);
					Arrays.sort(ia);
					printArray(ia);
					System.out.println();
						}
				
				}
			
