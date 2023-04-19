import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

    HashMap<String,String> countries = new HashMap<String,String>();

    // add a key and value

        countries.put("USA","Washington D.C.");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");


        for(String i : countries.keySet()) {

            System.out.print(i+"\t" + "= ");
            System.out.println(countries.get(i));
        }









    }
}

// Hashmap needs map import
// very similar to array lists, but with key-value pairs
// stores objects, need to use wrapper class ex: (name,email),(country,capitol) etc...

// within hashmap (key,value)
// for reference wrapper class turns a regular element into an object w/ capital letters
// Int, String, Boolean, etc...

// System.out.println(countries); - prints entire HM but its not pretty

// countries.remove("USA");  removes the USA

// System.out.println(countries.get("Russia")); returns capital of russia

// countries.clear(); clears entirety of hashmap

//  System.out.println(countries.size()); size of hashmap

//  countries.replace("USA","Detroit"); replaces the value of a key in hashmap

// System.out.println(countries.containsKey("England"));  // checks if a key is in hashmap, returns boolean
// .containsValue for other shit
