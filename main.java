public class Main
{
  public static void main(String [] args){
    int total = 0;
    for(int i = 1; i<334; i++){
      total += i*3;
    }
    for(int i =1; i<201; i++){
      if((i*5)%3 != 0){
        total += i*5; 
      }
    }
    System.out.print(total);
  }
}
  
