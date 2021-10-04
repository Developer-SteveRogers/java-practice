import  java.util.Scanner;
class Rev
{
  public static void main(String[] args){
    Reverse(123);
  } 
      
    static void Reverse(int x){
        //x=123
        //out=321
        int reverseNum = 0;
        int temp = x;
        while(x != 0){
         int remander = x%10; // 3
        reverseNum =  reverseNum * 10 + remander;// 3
        x = x/10;//12
        }
        System.out.print("resverse"+reverseNum);// 3
    }
    

}