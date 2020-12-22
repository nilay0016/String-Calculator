public class StringCalculator {
    public int Add(String numbers) {
        if(numbers.length() == 0)
            return 0;
        if(numbers.length() == 1)
            return Integer.parseInt(numbers);
        if(numbers.length() > 1){
            int sum = 0;
            for(int i=0; i<numbers.length(); i++) {
                char ch = numbers.charAt(i);
                if(Character.isDigit(ch)) {
                    sum = sum+Character.getNumericValue(ch);
                }
            }
            System.out.println(sum);
            return sum;
        }
        return 1;

    }
}
