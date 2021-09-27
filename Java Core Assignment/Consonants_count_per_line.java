import java.util.Scanner;
public class Consonants_count_per_line
{
	public static void main(String[] args)
	{
	    int c=-1,i=-1;
	    String Line="";
	    int cb,cc,cd,cf,cg,ch,cj,ck,cl,cm,cn,cp,cq,cr,cs,ct,cv,cw,cx,cy,cz;
	    cb=cc=cd=cf=cg=ch=cj=ck=cl=cm=cn=cp=cq=cr=cs=ct=cv=cw=cx=cy=cz=0;
	    Scanner input = new Scanner(System.in);
	    Line=input.nextLine();
	    while(c!=0)
	    {
	        cb=cc=cd=cf=cg=ch=cj=ck=cl=cm=cn=cp=cq=cr=cs=ct=cv=cw=cx=cy=cz=0;
	        c=Line.length();
	        for(i=0;i<c;i++)
	        {
	            if(Line.charAt(i)=='B' || Line.charAt(i)=='b')
	            {
	                cb++;
	            }
	            if(Line.charAt(i)=='C' || Line.charAt(i)=='c')
	            {
	                cc++;
	            }
	            if(Line.charAt(i)=='D' || Line.charAt(i)=='d')
	            {
	                cd++;
	            }
	            if(Line.charAt(i)=='F' || Line.charAt(i)=='f')
	            {
	                cf++;
	            }
	            if(Line.charAt(i)=='G' || Line.charAt(i)=='g')
	            {
	                cg++;
	            }
	            if(Line.charAt(i)=='H' || Line.charAt(i)=='h')
	            {
	                ch++;
	            }
	            if(Line.charAt(i)=='J' || Line.charAt(i)=='j')
	            {
	                cj++;
	            }
	            if(Line.charAt(i)=='K' || Line.charAt(i)=='k')
	            {
	                ck++;
	            }
	            if(Line.charAt(i)=='L' || Line.charAt(i)=='l')
	            {
	                cl++;
	            }
	            if(Line.charAt(i)=='M' || Line.charAt(i)=='m')
	            {
	                cm++;
	            }
	            if(Line.charAt(i)=='N' || Line.charAt(i)=='n')
	            {
	                cn++;
	            }
	            if(Line.charAt(i)=='P' || Line.charAt(i)=='p')
	            {
	                cp++;
	            }
	            if(Line.charAt(i)=='Q' || Line.charAt(i)=='q')
	            {
	                cq++;
	            }
	            if(Line.charAt(i)=='R' || Line.charAt(i)=='r')
	            {
	                cr++;
	            }
	            if(Line.charAt(i)=='S' || Line.charAt(i)=='s')
	            {
	                cs++;
	            }
	            if(Line.charAt(i)=='T' || Line.charAt(i)=='t')
	            {
	                ct++;
	            }
	            if(Line.charAt(i)=='V' || Line.charAt(i)=='v')
	            {
	                cv++;
	            }
	            if(Line.charAt(i)=='W' || Line.charAt(i)=='w')
	            {
	                cw++;
	            }
	            if(Line.charAt(i)=='X' || Line.charAt(i)=='x')
	            {
	                cx++;
	            }
	            if(Line.charAt(i)=='Y' || Line.charAt(i)=='y')
	            {
	                cy++;
	            }
	            if(Line.charAt(i)=='Z' || Line.charAt(i)=='z')
	            {
	                cz++;
	            }
	        }
	        
	        
	        if(c>0)
	        {
	            if(cb>0 || cc>0 || cd>0 || cf>0 || cg>0 || ch>0 || 
	            cj>0 || ck>0 || cl>0 || cm>0 || cn>0 || cp>0 || cq>0 || cr>0 || cs>0 || ct>0 || cv>0 || cw>0 || cx>0 || cy>0 || cz>0)
	            {
	               System.out.print("Consonants count : ");
	            }
	            else
	            {
	               System.out.print("No Consonants in this line ");
	            }
	        }
	        
	        
	        if(c>0)
	        {
                if(cb>0)
                {
                    System.out.print("B - "+cb+" ");
                }
                if(cc>0)
                {
                    System.out.print("C - "+cc+" ");
                }
                if(cd>0)
                {
                    System.out.print("D - "+cd+" ");
                }
                if(cf>0)
                {
                    System.out.print("F - "+cf+" ");
                }
                if(cg>0)
                {
                    System.out.print("G - "+cg+" ");
                }
                if(ch>0)
                {
                    System.out.print("H - "+ch+" ");
                }
                if(cj>0)
                {
                    System.out.print("J - "+cj+" ");
                }
                if(ck>0)
                {
                    System.out.print("K - "+ck+" ");
                }
                if(cl>0)
                {
                    System.out.print("L - "+cl+" ");
                }
                if(cm>0)
                {
                    System.out.print("M - "+cm+" ");
                }
                if(cn>0)
                {
                    System.out.print("N - "+cn+" ");
                }
                if(cp>0)
                {
                    System.out.print("P - "+cp+" ");
                }
                if(cq>0)
                {
                    System.out.print("Q - "+cq+" ");
                }
                if(cr>0)
                {
                    System.out.print("R - "+cr+" ");
                }
                if(cs>0)
                {
                    System.out.print("S - "+cs+" ");
                }
                if(ct>0)
                {
                    System.out.print("T - "+ct+" ");
                }
                if(cv>0)
                {
                    System.out.print("V - "+cv+" ");
                }
                if(cw>0)
                {
                    System.out.print("W - "+cw+" ");
                }
                if(cx>0)
                {
                    System.out.print("X - "+cx+" ");
                }
                if(cy>0)
                {
                    System.out.print("Y - "+cy+" ");
                }
                if(cz>0)
                {
                    System.out.print("Z - "+cz+" ");
                }
    	        System.out.print("\n");
	        }
	        Line=input.nextLine();
	    }
	}
}
