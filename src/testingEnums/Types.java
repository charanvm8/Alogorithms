package testingEnums;

public enum Types {
    SAVED("saved","user_saved"),
    FAV("favorite","user_favorite");

    private String type;
    private String value;

    Types(String s,String z){
        this.type = s;
        this.value = z;
    }

    public String getType(){return this.type;}

    public String getValue(){return this.value;}

    public void getValues(){
        for (Types t:Types.values()){
            System.out.print(t);
        }
    }

    public static Types getType(String s){
        Types type = null;
        for (Types t:Types.values()){
            if(t.getType().equalsIgnoreCase(s)){
                type = t;
                break;
            }
        }

        return type;
    }
}
