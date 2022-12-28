import java.util.Scanner;

public class StarPattern{

    public static void main(String[] args) {
        int row; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = scan.nextInt();


        //---------------------first pattern---------------------------------



        // for(int i= 0; i<row; i++){

        //     for(int j=0; j<=i; j++){

        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }
       
        //---------------------Second pattern---------------------------------

        // for(int i= row; i>0; i--){

        //     for(int j=0; j<i; j++){

        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }

        //---------------------third pattern---------------------------------

        // for(i= 0; i<row; i++){

        //     for(j= row-i; j>1; j--){

        //         System.out.print(" ");
        //     }

        //     for( j=0; j<=i; j++){

        //         System.out.print("*");
        //     }


        //     System.out.println();
        // }

        //---------------------Fourth pattern---------------------------------

        // for(i= row; i>=0; i--){

        //     for(j= row-i; j>0; j--){

        //         System.out.print(" ");
        //     }

        //     for( j=0; j<i; j++){

        //         System.out.print("*");
        //     }


        //     System.out.println();
        // }

        //---------------------Fifth pattern---------------------------------

        // for(int i= 0; i<row; i++){

        //     for(int j= row-i; j>1; j--){

        //         System.out.print(" ");
        //     }

        //     for(int j=0; j<=i; j++){
    
        //         System.out.print("* ");
                    
        //     }

        //     System.out.println();
        // }
        
        //---------------------Sixth pattern---------------------------------

        // for(int i= row; i>=0; i--){

        //     for(int j= row-i; j>0; j--){

        //         System.out.print(" ");
        //     }

        //     for(int j=0; j<i; j++){

        //         System.out.print("* ");
        //     }


        //     System.out.println();
        // }

        //---------------------Seventh pattern---------------------------------

        // for(int i= 0; i<row-1; i++){

        //     for(int j= row-i; j>1; j--){

        //         System.out.print(" ");
        //     }

        //     for(int j=0; j<=i; j++){
    
        //         System.out.print("* ");
                    
        //     }

        //     System.out.println();
        // }

        // for(int i= row; i>=0; i--){

        //     for(int j= row-i; j>0; j--){

        //         System.out.print(" ");
        //     }

        //     for(int j=0; j<i; j++){

        //         System.out.print("* ");
        //     }


        //     System.out.println();
        // }
 
        //---------------------Eighth pattern---------------------------------

        // for(int i= -1; i<=row; i++){

        //     for(int j=0; j<=row-i; j++){
                
        //         if(j<row-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
               
        //     }

        //     if (i==row-1){

        //         for(int j=0; j<row; j++){

        //             System.out.print(" *");
        //         }
        //         System.out.println();
        //         break;
        //     }
    
        //     for(int j=0; j<=(2*i)+1; j++){
    
        //         if (j<(2*i)+1){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
                
                        
        //     }
            
        //     System.out.println();
        // }
    
        
        //---------------------Ninth pattern---------------------------------

        // for(int i= row; i>=-1; i--){

        //     for(int j=0; j<=row-i; j++){
                
        //         if(j<row-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
               
        //     }

            
        //     if (i==row){

        //         for(int j=0; j<row+1; j++){

        //             System.out.print(" *");
        //         }
        //         System.out.println();
        //         continue;
        //     }
            
        //     for(int j=0; j<=(2*i)+1; j++){
                
        //         if (j<(2*i)+1){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
                
                        
        //     }
            
        //     System.out.println();
        // }

//---------------------Tenth pattern---------------------------------

        for(int i= -1; i<=row; i++){

            for(int j=0; j<=row-i; j++){
                
                if(j<row-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
               
            }
    
            for(int j=0; j<=(2*i)+1; j++){
    
                if (j<(2*i)+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
                        
            }
            
            System.out.println();
        }
    
        for(int i= row; i>=-1; i--){

            for(int j=0; j<=row-i; j++){
                
                if(j<row-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
               
            }
            
            for(int j=0; j<=(2*i)+1; j++){
                
                if (j<(2*i)+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
                        
            }
            
            System.out.println();
        }

        scan.close();
    }
}