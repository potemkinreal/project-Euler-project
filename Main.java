public class Main
{
  public static int goober(){
    int total = 0;
    for(int i = 1; i<334; i++){
      total += i*3;
    }
    for(int i =1; i<200; i++){
      if((i*5)%3 != 0){
        total += i*5; 
      }
    }
    return total;
  }
  public static void main(String [] args){
    System.out.print("multiples of 3 and 5 add up to:" + goober());
  }
}
  
