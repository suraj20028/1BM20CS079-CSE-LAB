import java.util.*;
import java.lang.*;
class fatherAgexception extends Exception
{
    int aF;
    fatherAgexception(int a)
    {
        aF = a;
    }
    public String toString()
    {
        return("FATHER AGE IS INVALID " + aF);
    }
}
class sonAgexception extends Exception
{
    int aS;
    sonAgexception(int a)
    {
        aS = a;
    }
    public String toString()
    {
        return("SON AGE IS INVALID " + aS);
    }
}
class father
{
    Scanner sc = new Scanner(System.in);
    int ageF;
    father()
    {
        System.out.println("ENTER FATHER AGE : ");
        ageF = sc.nextInt();
    }
    void wrong_Age() throws fatherAgexception
    {
        if(ageF<0)
        {
            throw new fatherAgexception(ageF);
        }
    }
}
class son extends father
{
    int ageS;
    Scanner sc = new Scanner(System.in);
    son()
    {
        System.out.println("ENTER SON AGE : ");
        ageS = sc.nextInt();
    }
    void wrong() throws sonAgexception
    {
        if( ageS<0 || ageS >= ageF)
        {
            
            throw new sonAgexception(ageS);
        }
    }
}
class except
{
    public static void main(String args[]) {
    son s = new son();
    int c = 0;
    try {
        s.wrong_Age();
        s.wrong();
    } 
    catch(fatherAgexception e) {
        //TODO: handle exception
        System.out.println(e);
        c = 1;
    }
    catch(sonAgexception e) {
        //TODO: handle exception
        System.out.println(e);
        c = 1;
    }
    
    if(c == 0)
    {
        System.out.println("AGES ARE ENTERED CORRECTLY \n"+"FATHER AGE = "+ s.ageF+"\n"+"SON AGE = "+s.ageS);
    }
    
}
}