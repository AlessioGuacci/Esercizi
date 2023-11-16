package Exercise11;

public class CharacterExtractor {

    private String inputString;
    private int index;

    public CharacterExtractor(String inputString, int index){
    this.index= index;
    this.inputString= inputString;
    }


    public String characterExtractor(){
     StringBuilder extractor = new StringBuilder();
     if(index >= 0 && index < inputString.length()){
         char character= inputString.charAt(index);
         extractor.append("the unicode result in index ")
         .append(index)
                 .append(" in the string, ")
                 .append(inputString)
                 .append(", is, ")
                 .append(Integer.toHexString(character));
     } else {
         extractor.append("error");
     }
        return extractor.toString();
    }
}
