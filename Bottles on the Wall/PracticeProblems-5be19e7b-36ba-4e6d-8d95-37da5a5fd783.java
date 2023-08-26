//Name: 

public class PracticeProblems
{
    public static void main(String[] args)
    {
        int i=1;
        int o=1;
        while(i<=9)    
        {
            System.out.print(i);
            i++;
        }
        System.out.println("");
        while (o<=9)
        {
            //2
            System.out.print(o + " ");
            o++;
        }
        System.out.println("");
        int odd=1;
        int num = 20;
        while (odd<=num)
        {
            //3
            System.out.print(odd+ " ");
            odd += 2;
        }
        System.out.println("");
        int i5 = 5;
        while(i5 <= 50) 
        {
            //4
            System.out.print(i5+ " ");
            i5 += 5;
        }
        System.out.println("");
        int backwards = 11;
        while(backwards > 1) 
        {
            //5 
            backwards--;
            System.out.print(backwards+ " ");
        }
        //6 - The man LIVIN in the USA is still alive.
        System.out.println("");
        int backwardsneg = 4;
        int neg4 = 4;
        while(neg4 <= 40) 
        {
            //7
            System.out.print("-" + neg4 + " ");
            neg4 += 4;
        }
        System.out.println("");
        int starting = 1;
        while(starting <= 256)
        {
            //8
            System.out.print(starting + " ");
            starting *= 2;
        }
        System.out.println("");
        int thousand = 1000;
        while(thousand >= 3)
        {
            //9
            System.out.print(thousand + " ");
            thousand /= 2;
        }
        System.out.println("");
        int neg1 = 1; 
        while(neg1 < 8)
        {
            //10
            System.out.print(neg1++ + " " + "-" + neg1++);
        }
        
        System.out.println("");
        int nmd = 0;
        while(nmd<8)
        {
            nmd ++;
            System.out.print(nmd + " ");
            System.out.print("-" + nmd + " ");
        }
    }
}

