
import java.util.Arrays;
public class Sorts {

	public static void selectionSort(int[]data) {

		for(int i=0;i<data.length;i++) {
			int miny=i;
			for(int j=i;j<data.length;j++) {
				if (data[j]<data[i]) {
					miny=j;

				}
			}
			int dummy=data[i];
			data[i]=data[miny];
			data[miny]=dummy;
			//System.out.println(Arrays.toString(data));
		}
	}
  public static void bubbleSort(int[]data) {

  for(int i=0; i<data.length-1;i++) {
    int swap=0;
    for(int j=0;j<data.length-1;j++) {
    if (data[j]>data[j+1]) {
      swap++;
      int dummy=data[j];
      data[j]=data[j+1];
      data[j+1]=dummy;
      //System.out.println(Arrays.toString(data));
    }

  }
    if(swap==0) {
      //System.out.println("hukka");
      break;
  }
 }
}
public static void insertionSort(int[]data) {
  for(int i=1;i<data.length;i++) {
    //System.out.println(Arrays.toString(data));
    int smallest=i;
    for(int j=i;j>0;j--) {

      if(data[i]<data[j]) {
        smallest=j;
      }
    }
      //int dummy=data[smallest];
      //data[smallest]=data[i];
      for(int k=smallest;k<i-1;k++ ) {
        data[k+1]=data[k];
      }
      //System.out.println(Arrays.toString(data));

  }
}
	public static void main(String[]args) {
		int[]data= {7,5,4,2};
		selectionSort(data);
    bubbleSort(data);
    insertionSort(data);
	}
}
