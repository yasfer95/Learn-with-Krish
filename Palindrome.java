import java.util.*;

public class Palindrome 
{

    public static boolean isEqual(LinkedList linkedList1,LinkedList linkedList2,int num)
    {
        boolean x = true;

            for(int i=0; i<num; i++)
            {
                if(linkedList1.get(i) != linkedList2.get(i))
                    {
                        x = false;
                        break;
                    }
            }
            return x;
    }


    public static void main(String args[])
    {
        LinkedList<String> linkedList1 = new LinkedList<String>();
        LinkedList<String> linkedList2 = new LinkedList<String>();

        linkedList1.add("P");
        linkedList1.add("O");
        linkedList1.add("P");
        
        linkedList2 = (LinkedList) linkedList1.clone(); 

            for(int i=0; i<linkedList2.size()-1; i++)
            {
                for(int j=0; j<linkedList2.size()-i-1; j++)
                    {
                        String a = linkedList2.get(j);
                        String b = linkedList2.get(j+1);
                        linkedList2.set(j,b);
                        linkedList2.set(j+1,a);
                    }
            }
     

            if(isEqual(linkedList1,linkedList2,linkedList2.size())==true)
                { 
                    System.out.println("Palindrome");
                }
            else
                {
                    System.out.println("Not a Palindrome");
                }
    }

}