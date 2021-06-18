import java.util.Arrays;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
//        String input = "this_is_variable_name";
        String input = "thisIsVariableName";
        StringBuilder output= new StringBuilder("");
        if(input.contains("_")){
            String[] in = input.split("_");
            output.append(in[0]);
            for(int i = 1; i < in.length; i++){

                output = output.append(String.valueOf(in[i].charAt(0)).toUpperCase().concat(in[i].substring(1)));
            }

        } else {
           for(int i = 0; i < input.length(); i++) {
               if(input.charAt(i)>= 65 && input.charAt(i) <= 90 ) {
                   output.append("_").append(String.valueOf(input.charAt(i)).toLowerCase());
               } else {
                   output.append(input.charAt(i));
               }
           }
        }
        System.out.println(output);
    }
}
