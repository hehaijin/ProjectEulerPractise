import java.util.ArrayList;
import java.util.HashSet;

public class CardMatch
{ 
  private Card[] cards=new Card[27];
  private class Card
  { int a,b,c;
    public Card(int a,int b,int c)
    {
      this.a=a;
      this.b=b;
      this.c=c;
    }
 
  }
  
  private class Match
  {
    HashSet<Card> match=new HashSet<>();
    public Match(Card i,Card j,Card k)
    {
     match.add(i);
     match.add(j);
     match.add(k);
    }

  }

  private HashSet<Match> all=new HashSet<>();
  
  
  public boolean isMatch(Card i,Card j,Card k)
  {
    
    return isMatchSingle(i.a,j.a,k.a) && isMatchSingle(i.b,j.b,k.b) && isMatchSingle(i.c,j.c,k.c);
    
    
  }
  
  
  public boolean isMatchSingle(int a,int b,int c)
  {
    return (a==b&&b==c) ||( a!=b && b!=c && a!=c);
    
  }
 
  public void display(Match m)
  { 
    for(Card c: m.match)
    {
    //  System.out.print(c.a+" "+c.b+" "+c.c+"          ");
      System.out.print(c.a+"          ");
      
    }
    System.out.println();
    
    
  }
  
  public CardMatch()
  {
    int t=0;
    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
        for(int k=0;k<3;k++)
        {
          
          cards[t]=new Card(i,j,k);
       //   System.out.println(i+" "+ j+" "+k+ " ");
          t++;
 
        }
    
    for(int i=0;i<27;i++)
      for(int j=i+1;j<27;j++)
        for(int k=j+1;k<27;k++)
        {
          if(isMatch(cards[i],cards[j],cards[k]))
          {
            Match m=new Match(cards[i],cards[j],cards[k]);
            all.add(m);
            
          }
          
        }
  }
  
  
  
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    CardMatch m=new CardMatch();
    System.out.println("the number of matches for 27 cards is "+m.all.size());
    for(Match ma:m.all)
    {
      m.display(ma);
    }

  }

}
