

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.length() == 0)
            return 0;
        if (numbers.length() == 1)
            return Integer.parseInt(numbers);
        if (numbers.length() > 1) {
            try {
                int sum = 0;
                String[] numArray = numbers.split("[\\,\n]");
                if (numArray.length <= 1) {
                    throw new Exception("Invlaid String");
                }
                for (String num : numArray) {
                    System.out.println(num);
                    sum += Integer.parseInt(num);
                }
                return sum;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return 1;

    }
}
