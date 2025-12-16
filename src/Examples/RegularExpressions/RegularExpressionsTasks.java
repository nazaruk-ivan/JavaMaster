package Examples.RegularExpressions;

public class RegularExpressionsTasks {
    public static void main(String[] args) {
        // regular expressions
        String text = "abc123";

        boolean resultCheck =  text.matches("[a-z]+[1-9]+");
        System.out.println(resultCheck);

        //task 1
        String lowerCase = "abc";
        boolean lowerCaseCheck = lowerCase.matches("[a-z]+");
        System.out.println(lowerCaseCheck);

        //task 2
        String onlyDigits = "12345";
        boolean onlyDigitsCheck = onlyDigits.matches("[1-9]+");
        System.out.println(onlyDigitsCheck);

        //task 3
        String toCheck1 = "iVan2006";
        boolean lettersByDigits = toCheck1.matches("[A-Za-z]+[0-9]+");
        System.out.println(lettersByDigits);

        //task 4
        String fiveDigits = "12345";
        boolean fiveDigitsCheck = fiveDigits.matches("[0-9]{5}");
        System.out.println(fiveDigitsCheck);

        //task 5
        String random1 = "London";
        boolean startWithUpperCase = random1.matches("[A-Z][A-Za-z]+");
        System.out.println(startWithUpperCase);

        //task 6
        String randompas = "asd128123as";
        boolean check8Characters = randompas.matches("\\w{8,}");
        System.out.println(check8Characters);

        //task 7
        String oneDigit = "asdhas1asjdfsa";
        boolean doesContainDigit = oneDigit.matches(".*\\d.*");
        System.out.println(doesContainDigit);

        //task 7
        String email = "hello@gmail.com";
        boolean isCorrectEmail = email.matches("[A-Za-z0-9]+@[A-Za-z]+\\.com");

        System.out.println(isCorrectEmail);





    }
}
