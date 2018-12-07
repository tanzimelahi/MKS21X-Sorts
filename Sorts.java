import java.util.ArrayList;
import java.util.Arrays;
public class Sorts{
public static void selectionSort(int[]ary){
  ArrayList<Integer>result=new ArrayList<Integer>();
  int []answer=new int[ary.length];
  for(int i=0;i<ary.length;i++){
    result.add(ary[i]);
  }
  for(int i=0;i<answer.length;i++) {
	  answer[i]=min(result);
	  result.remove(new Integer(min(result)));

  }
  for(int i=0;i<answer.length;i++) {
	  ary[i]=answer[i];
  }





}


public static int min(ArrayList<Integer> ary){
  int min=ary.get(0);
  for(int i=0;i<ary.size();i++){
    if(ary.get(i)<min){
      min=ary.get(i);
    }
  }
  return min;
}
 public static void main(String[]args) {
	 int[]test= {9,0,8,7,6,2};
	 selectionSort(test);
	 System.out.println(Arrays.toString(test));
 }

}
