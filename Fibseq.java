
public class Fibseq{ //public class for generating nth term in fibonacci sequence 
	
    static int fibseq(int w){ // static method to deploy nth term
    if (w <= 1) {  //if statement as safety code so the entered below 1 will just be returned
       return w;}  //return statement as aforementioned above
    return fibseq(w-1) + fibseq(w-2); } // recursive return statement that creates seq
      
    public static void main (String args[]){ //main
    int n = 10;  //desired term for the seq
    System.out.println("The 10th term of the Fibonacci sequence is " + fibseq(n)); // out put statement and term
    }
} //end class and main
