/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Sai
 */
public class Chess {

    
   public static void printChess(int n,int flag)
   {
       int count=0;
       String s[][]=new String[n+1][n+1];
       for(int i=1;i<=8;i++)
       {
           for(int j=1;j<=8;j++)
           {
            
                if(i==1)
               {
                   switch(j)
                   {
                       case 1:
                           s[i][j]="WR";
                        break;
                       case 8:
                           s[i][j]="Wr";
                           break;
                       case 2:
                           s[i][j]="Wn";
                           break;
                       case 7:
                           s[i][j]="Wn";
                           break;
                       case 3:
                           s[i][j]="Wb";
                           break;
                       case 6:
                           s[i][j]="WB";
                           break;
                       case 4:
                           s[i][j]="WK";
                           break;
                       case 5:
                           s[i][j]="WQ";
                           break;
                   }
                         
                   }
                   else if(i==2)
                           {
                            s[i][j]="WP";
                           }
                   else if(i>=3&&i<7)
                           {
                           s[i][j]=". ";
                           }
                   else if(i==7)
                   {
                       s[i][j]="BP";
                       
                   }
                   else if(i==8)
                   {
                        switch(j)
                   {
                       case 1:
                           s[i][j]="BR";
                        break;
                       case 8:
                           s[i][j]="Br";
                           break;
                       case 2:
                           s[i][j]="Bn";
                           break;
                       case 7:
                           s[i][j]="Bn";
                           break;
                       case 3:
                           s[i][j]="Bb";
                           break;
                       case 6:
                           s[i][j]="BB";
                           break;
                       case 4:
                           s[i][j]="BQ";
                           break;
                       case 5:
                           s[i][j]="BK";
                           break;
                   }
                   }
                   
               }
           }
       display(s,flag);
   }
    
    public static void display(String s[][],int flag)
    {
        char A='A';
       if(flag==0){
         for(int i=0;i<8;i++)
         {
             char c=(char)(A+i);
             System.out.print(c);
             System.out.print("  ");
         }
         System.out.println();
         for(int i=0;i<23;i++)
         {
             System.out.print("-");
         }
         System.out.println();
        for(int i=1;i<=8;i++)
       {
           for(int j=1;j<=8;j++)
           {
               System.out.print(s[i][j]);
               System.out.print(" ");
           }
           System.out.println();
       
   }
         for(int i=0;i<23;i++)
         {
             System.out.print("-");
         }
         System.out.println();
        
        for(int i=0;i<8;i++)
         {
             char c=(char)(A+i);
             System.out.print(c);
             System.out.print("  ");
         }
         System.out.println();
   }
       else
       {
           for(int i=0;i<8;i++)
         {
             char c=(char)(A+i);
             System.out.print(c);
             System.out.print("  ");
         }
         System.out.println();
          for(int i=0;i<23;i++)
         {
             System.out.print("-");
         }
         System.out.println();
            for(int i=8;i>0;i--)
       {
           for(int j=1;j<=8;j++)
           {
               System.out.print(s[i][j]);
               System.out.print(" ");
           }
           System.out.println();
       
   }
        for(int i=0;i<23;i++)
         {
             System.out.print("-");
         }
         System.out.println();
       for(int i=0;i<8;i++)
         {
             char c=(char)(A+i);
             System.out.print(c);
             System.out.print("  ");
         }
         System.out.println();
   }
    }

   
    
    
   
    public static void main(String[] args) {
        int flag=0;
        printChess(8,flag);
    }
    
}
