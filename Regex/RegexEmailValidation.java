public class RegexEmailValidation {
    public static void main(String[] args) {
        String email="test123@gmail.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if(email.matches(regex)){
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
    }
}
