public class swapnumbersdemo {
        public static void main(String[] args)
        {
            int a=10,b=20;
            System.out.println("before swappping values are.."+a+" "+b);
            //logic -1
            /*int c=a;
            a=b;
            b=c;*/
    
            //logic-2
            /*a=a+b;
            b=a-b;
            a=a-b;*/
    
            //logic-3
            /*a=a*b;
            b=a/b;
            a=a/b;*/
            
            //logic 4 biwise xor(^)
            /*a=a^b;
            b=a^b;
            a=a^b;*/
    
            //logic-5 
            b=a+b-(a=b);
    
            System.out.println("after swappping values are..."+a+" "+b);
        }
    }
    
    

