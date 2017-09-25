package edu.cnm.deepdive.intro;

/**
 * This Class Implements FizzBuzz game, using an upper limit specified
 * on the command line
 *
 * @author Abdul Haseeb Gauba
 */

public class FizzBuzz {

  /** default value for the upper limit  of count*/
  private static final int DEFAULT_LIMIT = 100;

  /**
   * Counts from 1 to 100 then outpust the result form computeResponse
   * to result in a list of numbers and the word fizz for numbers divisible by 3
   * buzz for numbers divisible by 5 and fizzbuzz for numbers divisible by 3 & 5
   *
   * @param args
   */
  public static void main(String[] args){
     int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
     for(int i = 1; i<= limit ; i++){
       System.out.println(computeResponse(i));
     }
  }
  /**
   * computes and returns the appropriate fizz/buzz/fizzbuzz/number
   * value for a given input value
   *
   * @param value input value
   * @return fizz/buzz/fizzvuzz/numeric response
   */
  private static String computeResponse(int value ){
    String result = "" ;

      if (value % 3 == 0){
        result += "Fizz";
      }
      if (value % 5 == 0) {
        result += "buzz";
      }
      if( result.isEmpty()) {
        // result = Integer.toString(value);
        // result = String.format("%d", value);
        // result += value;
        result = value + " ";
      }
    return result ;
  }
}