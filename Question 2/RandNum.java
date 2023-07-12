//it21144462 - Ranasinghe .T.R
import java.util.ArrayList;

class RandNum {
  
  int minimum_num;
  int maximum_num;
  int summation;
  double  average;
  int column,row;

  int [][] array1 = new int [5][5];
  
  //implimenting Randnum function
  public RandNum(){

    int Range =(100-1)-1;
    
       for(row = 0 ; row < 5 ; row++ ) {
         
			    for( column = 0 ; column < 5 ; column++ ) {
            
				    array1[row][column] = (int) (Math.random()*Range )+ (2) ;
            //array1[row][column] = random.nextInt();
			      }  
		   }
    
  }
  public void Calc(){
      minimum_num = array1[0][0];//ASSIGNING MAX/MIN VALUES(INITIALISING)
      maximum_num = array1[0][0];//ASSIGNING MAX/MIN VALUES(INITIALISING)

    for(row =0; row < array1.length; row++){
      
      for(column =0; column < array1.length; column++){

          //min value
          if(array1[row][column]  <  minimum_num)
          {
            
            minimum_num =array1[row][column];
          }
          //max value
          if(array1[row][column]  >  maximum_num)
          {
            
            maximum_num =array1[row][column];
          }
          //sum of all 25 values
          summation = summation + array1[row][column];
      }
    } 
    //AVERAGE OF THE VALUES
    average = summation / 25.0;
      
  }
  
public void display(){

  for(row =0; row < array1.length; row++){ 
      
      for(column =0; column < array1.length; column++){

        System.out.print(array1[row][column] + "\t");
      }
      System.out.print("\n");
    } 
    
  
 
    
		System.out.println("\nMinimum Value:"+"\t"+minimum_num);
		System.out.println("Maximum Value:"+"\t"+maximum_num);
		System.out.println("Avarage of the all random numbers:"+average);

  }
    
}
/*
There are three methods to generate random numbers in Java.
...
random() , follow the steps below:
Declare the minimum value of the range.
Declare the maximum value of the range.
Use the formula Math. floor(Math. random()*(max-min+1)+min) to generate values with the min and the max value inclusive.
*/ 



/*
import java.util.Arrays;
import java.util.Random;

class Main {
   public static void main(String args[]) {
      int array[][] = new int[2][2];
      Random random = new Random();

      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            array[i][j] = random.nextInt();
         }
      }
      System.out.println("Array: " 
                  + Arrays.deepToString(array));
   }
}
*/



