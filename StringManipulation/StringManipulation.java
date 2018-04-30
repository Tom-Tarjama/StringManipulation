public class StringManipulation{
    public String trimAndConcat(String input1, String input2){
        
        String output = input1.trim().concat(input2.trim());
        return output;
    };

    public Integer getIndexOrNull(String input1, char input2){

        Integer output = input1.indexOf(input2);
        if(output ==-1){
            return null;
        }
        else{
            return output;
        }
    };

    public Integer getIndexOrNull(String input1, String input2){

        Integer output = input1.indexOf(input2);
        if(output ==-1){
            return null;
        }
        else{
            return output;
        }
    }

    public String concatSubstring(String string1, int int1, String string2, int int2){

        String output = string1.substring(int1, int2);
        return output.concat(string2);
    }
};
