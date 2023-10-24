package Class29;

public class Entry {

    private int key;
    private String value;

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;
    }
    public String getValue(){
        return value;
    }

    // If we get the Ouput in Console Not readable... something like this: Entry@1239987
    //type "to" and press arrow down and selection the 3rd option which is toString() method
    //it will Override and shows the exact desired output what we want on Console ...
    @Override
    public String toString() {
        return "Entry{" + "key=" + key + ", value='" + value + '\'' + '}';
    }

}
