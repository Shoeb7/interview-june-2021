package exam;

public class ConvertToBinary{
static void binary(int[] bin,int id)
{
  for(int i=id-1;i>=0;i--)
 System.out.print(bin[i] + " ");
  
  }
  public static void decimal(int num)
  {
    int[] binary = new int[35];
    int id = 0;
    while(num>0)
    {
      binary[id++] = num % 2;
      num = num / 2;
    }
    binary(bin,id);
  }
  public static void main(String[] args)
  {
    int num = 35;
    decimal(num);
  }
}


