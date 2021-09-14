package  espresso;


import java.util.*;

public class Coffee {

    public static void main(String[] args){
    //Creation d'un tableau
        int []cafeBu;// Cafe que j'ai bu

            cafeBu=new int [50]; // Je met une variable au tableau fraichement créé
            cafeBu[10]=3; //à l'index 10, j'assigne la valeur 3.
            System.out.println(cafeBu[10]); // Le résultat sera 3

        System.out.println("Cours sur les listes");
    //Creation d'une liste
    List<Integer> prout = new ArrayList<Integer>();
        prout.add(5); //[5]
        prout.add(8);//[5, 8]
        prout.add(1,3);//[5, 3, 8]
        prout.remove(1); //removed 3
        System.out.println(prout.size());  // ->2

    //un .add rajoute dans la list l'objet entre parenthèse TOUJOUTS endernier
    //sauf quand tu lui met un entier avant
    // ex : prout.add(1,3)
    //le 3 est à la position 1 ( dans la logique ou les positions sont 0,1,2,3...)



        //Pour pouvoir stocker dans une list, il faut écrire comme ça :
        //Interger / Double / Float / Boolean
        // Très important les majuscules


        System.out.println("Cours sur les tableaux");

        Set<String> ingredient = new HashSet<String>();
        ingredient.add("oeuf");
        ingredient.add("sucre");
        ingredient.add("beurre");
        ingredient.add("sel");
        System.out.println("beurk c'est déguelasse vire moi un ingredient");
        //ingredient.remove("oeuf");
        System.out.println(ingredient.size());  // Actuellement, la taille "d'ingredient" est de 4 (oeuf,sucre, beurre, sel).
                                                // Si tu mets la ligne 49, il n'y en aura que 3.

        System.out.println("Cours sur les map");


        Map<String,Integer> myMap = new HashMap<String, Integer>();
        //L'âges de mes amis
        myMap.put("Yanus",20);
        myMap.put("romain",22);
        myMap.put("Joris",20);
        System.out.println(myMap.get("Yanus")); // --> 20

        private static final String kYanus = "Yanus";
        private static final String kromain = "romain";
        private static final String kJoris = "Joris";

        myMap.put(kJoris, 20);
        myMap.put(kYanus, 20);
        myMap.put(kromain, 22);

        System.out.println(myMap.get(kJoris));
}

}
