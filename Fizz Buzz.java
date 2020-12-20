Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.


class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> list = new LinkedList<String>();
        for(int i=1;i<=n;i++){
            list.add((i%3 == 0 && i%5 == 0) ? "FizzBuzz" :
                (i%3 == 0) ? "Fizz" : (i%5 == 0) ? "Buzz" : String.valueOf(i));
        }
        return list; 
    }
}
