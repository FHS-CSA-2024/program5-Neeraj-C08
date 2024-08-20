//import stuff here?


//Your code here

public class program5{
    
    public static void main(String[] args){
        
        int royale = 286;
        
        int koopaKing = 412;
        
        int pipeFrame = 361;
        
        int badwagon = 161;
        
        int rGal = 9;
        
        int kGal = 40;
        
        int pGal = 18;
        
        int bGal = 11;
        
        double rMpg = (double) royale/ rGal;
        
        double kMpg = (double) koopaKing/ kGal;
        
        double pMpg = (double) pipeFrame/ pGal;
        
        double bMpg = (double) badwagon/ bGal;
        
         rMpg = ((int)(rMpg* 10))/10.0;
         
         kMpg = ((int)(kMpg* 10))/10.0;
         
         pMpg = ((int)(pMpg* 10))/10.0;
         
         bMpg = ((int)(bMpg* 10))/10.0;
        
        
        System.out.println("The miles per gallon for royale: " + rMpg);
        
        System.out.println("The miles per gallon for Koopa King: " + kMpg);
        
        System.out.println("The miles per gallon for Pipe Frame: " + pMpg);
        
        System.out.println("The miles per gallon for Badwagon: " + bMpg);
    }
       
    
}

//Paste console output below:
/*
The miles per gallon for royale: 31.7
The miles per gallon for Koopa King: 10.3
The miles per gallon for Pipe Frame: 20.0
The miles per gallon for Badwagon: 14.6
1
*/

