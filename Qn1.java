import java.util.HashMap;

public class Qn1 {

//	static int min_swap_count(int a[]) {
//		boolean isVisited[]=new boolean[a.length+1];
//		HashMap<Integer, Integer> h=new HashMap<>();
//		
//		for (int i =1; i <isVisited.length; i++) {                                    /*bhaiya ye 1st wala code sirf 1to n ke liye hin chalega 
//		                                                                               matlab aap 1 to 5 tak ke number jis tarah ki order mai 
//		                                                                               do ye code minimum count show karega 
//		                                                                               
//		                                                                               agar aap {30,80,20,40} is tarah entry doge toh yeh error show karega
//		                                                                               kyunki main jo hashmap ke andar entry liya hai wo array size ko leke
//		                                                                               
//		                                                                               mai aise apko clearly bata nhi pa raha hoon sry.
//		                                                                               */
//			h.put(i,a[i-1]);
//		}                                                                             // 2nd wala code modified hai it works on any type of array
//		int swapcount=0;
//		
//		for (int i =1; i <=h.size(); i++) {
//			if (isVisited[i]==false) {
//				isVisited[i]=true;
//				
//				if (i==h.get(i)) {
//					continue;
//				}
//				else {
//					int c=h.get(i);
//					while(!isVisited[c]) {
//				     isVisited[c]=true;
//				     int next=h.get(c);
//				     c=next;
//				     swapcount++;
//				     
//					}
//				}
//			}
//		}
//		return swapcount;
//	}
	
	static int swapcount(int a[]) {
		int swap=0;
		for (int i = 0; i < a.length; i++) {
			int  min=a[i];
			int minindex=i;
			for (int j =i+1; j < a.length; j++) {
                 if (min>a[j]) {
                	
				min=a[j];
				minindex=j; 
				}
			}
			if (minindex!=i) {
				swap++;
				int temp=a[minindex];
				a[minindex]=a[i];
				a[i]=temp;
			}
		}
		return swap;
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {30,40,20,10};
//		System.out.println("the minimum number of swap require to sort the array is: "+min_swap_count(a));
		System.out.println("the minimum number of swap require to sort the array is: "+swapcount(a));

	}

}
