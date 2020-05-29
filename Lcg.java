import java.math.BigInteger;

/**
 *
 * @author swtoskon
 */
public class Lcg{
       final  static BigInteger a= new BigInteger("1664525");
       final static  BigInteger c= new BigInteger("1013904223");
       final static long  n= (long)Math.pow(2, 32); 
        final static BigInteger m= new BigInteger(""+ n + "");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int runs =0;
        int[] A = new int[1000000];
        int[] B = new int[10];
        String a1 = "";
        float sum1=0;
        float sum =0;
//System.err.println(m);
//  long seed = System.currentTimeMillis();
//System.err.println(seed);

         BigInteger seed = new BigInteger("178271");
           
           for(int i=0; i<100; i++){
           sum = sum + (float)Next(seed).longValue()/m.longValue();
        System.out.println((float)Next(seed).longValue()/m.longValue());
        seed=Next(seed);
        sum1 += Math.pow((double) seed.longValue()/m.longValue() -0.5, 2);
}
System.out.println("Average for 100 random numbers is: " + sum/100);
//System.out.println("Variance for 100 numbers is: "+sum1/100);
System.out.println("Standard Deviation for 100 numbers is: "+ Math.sqrt(sum1/100));
sum =0 ;
sum1=0;
for(int i=0; i<1000000; i++){

//System.out.println((float)z.longValue()/m.longValue());
    sum = sum + (float)Next(seed).longValue()/m.longValue();
    if((float)Next(seed).longValue()/m.longValue()<0.5 && !("down".equals(a1)) && runs<10 ){
                runs++;
                A[runs]++; 
                a1 = "down";
            }
            else if((float)Next(seed).longValue()/m.longValue()<0.5 && "down".equals(a1) && runs<10){
                A[runs]++;
                
            }
             else if(((float)Next(seed).longValue()/m.longValue())>0.5 && !("up".equals(a1))&& runs<10){
                a1="up";
                runs++;
                A[runs]++;
               
            }
            else if((float)Next(seed).longValue()/m.longValue()>0.5 && "up".equals(a1) && runs<10){
                A[runs]++;
            }
    
    
    if((float)Next(seed).longValue()/m.longValue()<0.1){
         B[0]++;
        }
    else if((float)Next(seed).longValue()/m.longValue()>0.1 && (float)Next(seed).longValue()/m.longValue()<0.2){
         B[1]++;
    }
   else if((float)Next(seed).longValue()/m.longValue()>0.2 && (float)Next(seed).longValue()/m.longValue()<0.3){
         B[2]++;
    }
    else if((float)Next(seed).longValue()/m.longValue()>0.3 && (float)Next(seed).longValue()/m.longValue()<0.4){
         B[3]++;
     }
    else if((float)Next(seed).longValue()/m.longValue()>0.4 && (float) Next(seed).longValue()/m.longValue()<0.5){
         B[4]++;
     }
    else if((float)Next(seed).longValue()/m.longValue()>0.5 && (float)Next(seed).longValue()/m.longValue()<0.6){
         B[5]++;
     }
    else if((float)Next(seed).longValue()/m.longValue()>0.6 && (float)Next(seed).longValue()/m.longValue()<0.7){
         B[6]++;
     }
    else if((float)Next(seed).longValue()/m.longValue()>0.7 && (float)Next(seed).longValue()/m.longValue()<0.8){
         B[7]++;
     }
    else if((float)Next(seed).longValue()/m.longValue()>0.8 && (float)Next(seed).longValue()/m.longValue()<0.9){
         B[8]++;
     }
    else if((float)Next(seed).longValue()/m.longValue()>0.9 && (float)Next(seed).longValue()/m.longValue()<1){
         B[9]++;
     }
 sum1 += Math.pow((double) Next(seed).longValue()/m.longValue() - 0.5,2);
 seed=Next(seed);
}

System.out.println("-Runs Test-");
for(int i=1; i<=10; i++){
        System.out.println("Run " + i + " has length "+A[i]);
}
System.out.println("-Area test-");
for(int i=0; i<10; i++){
        System.out.println((float)i/10+"-"+(float)(i+1)/10+":"+B[i] + " numbers in this area");
}
System.out.println("Average for 1000000 random numbers is: "+sum/1000000);
//System.out.println("Variance for 1000000 random numbers is: " + sum1/1000000);
System.out.println("Standard Deviation for 1000000 numbers is: "+ Math.sqrt(sum1/1000000));

    }
   public static BigInteger Next(BigInteger previus){
       return (previus.multiply(a).add(c).mod(m));
   }
    }
    

