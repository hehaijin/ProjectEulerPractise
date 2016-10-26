/**
 * 
 * @author Haijin He
 *
 */


public class Multiple35
{

  /**
   * sums all integers from 1 to input a that can be divided by 3 or 5.
   * @param a
   * @return
   */
  public static int sum(int a)
  {
    int sum = 0;
    for (int i = 1; i < a; i++)
      if (check35(i))
        sum = sum + i;

    return sum;
  }

  /**
   * check if a int can be divided by 3 or 5
   * @param a
   * @return
   */
  public static boolean check35(int a)
  {
    return a % 5 == 0 || a % 3 == 0;

  }

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

    System.out.println(sum(1000));

  }

}
