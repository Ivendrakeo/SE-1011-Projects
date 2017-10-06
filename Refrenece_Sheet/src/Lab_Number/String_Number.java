package Lab_Number;

public class String_Number {

    public static  void main(String args[]){
        String var = "113aa333331";
        boolean flag = true;
        char c;
        int var_len = var.length();
        while(var_len>0){
            c = (var.charAt(var_len-1));
            if(!Character.isDigit(c))
                flag = false;
        var_len--;
        }
        if(flag)
            System.out.println("It's a number!");
        else
            System.out.println("it's not a number : (");
    }
}
