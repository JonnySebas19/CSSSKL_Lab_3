/*
Class invariant:
1) No string will grow beyond 100 characters
 */

public class CharList {
    private char[] charArray;
    private int numChars;

    public CharList(){
        numChars = 0;
        charArray = new char[0];
    }
    public CharList(String startStr){

        if (startStr == null
                || startStr.length() == 0
                || startStr.length() > 100 )
        {
            System.out.println("Invalid string...");
            numChars = 0;
            charArray = new char[0];
        } else {
            numChars = startStr.length();
            charArray = new char[numChars];
            for (int i = 0; i < startStr.length(); i++) {
                charArray[i] = startStr.charAt(i);
            }
        }
    }
    public CharList(CharList otherCharList){
        if (otherCharList != null) {
            this.charArray = otherCharList.charArray;
            this.numChars = otherCharList.numChars;
        } else {
            this.numChars = 0;
            charArray = new char[0];
        }
    }
    public int size(){
        return this.numChars;
    }
    public void add(char next){
        char[] newCharArray = new char[++numChars];

        for (int i = 0; i < numChars - 1; i++){
            newCharArray[i] = charArray[i];
        }
        newCharArray[numChars - 1] = next;

        this.charArray = newCharArray;
    }
    public char get(int index){
        return charArray[index];
    }
    @Override
    public String toString(){
        String retVal = "";

        for (char c : charArray){
            retVal += c;
        }
        return retVal;
    }
    @Override
    public boolean equals(Object other){
        if ( other == null || !(other instanceof CharList )){
            return false;
        }
        CharList otherCharList = (CharList) other;

        return this.toString().equals(otherCharList.toString())
                && this.numChars == otherCharList.numChars;
    }
}
