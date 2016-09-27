package com.kmourad.hb_exemple;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        TextView textView3 = (TextView) findViewById(R.id.text3);
        TextView textView4 = (TextView) findViewById(R.id.text4);
        textView.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");

//        textView.setText("Bonjour Monde");

        // inverse (TERMINE)
//        String exemple = "Trouve Inverse";
//        textView2.setText("L'inverse est : " + inverse(exemple));

        // palindrom (TERMINE)
//        String exemple = "LibrerbiL";
//        textView2.setText("Votre mot :" + exemple);
//        textView3.setText("Son inverse :" + inverse(exemple));
//        if (ispalindrome(exemple)) {
//            textView.setText("Le mot :" + exemple + " est un palindrome");
//            textView.setText("Le mot :" + exemple + " n'est pas un palindrome");
//        }

        // Cleaning phrase (TERMINE)
//        String exemple = "    un exemple   phrase   a nettoyer fin  ";
//        textView2.setText("Phrase Net : "+ clean2(exemple));

        // checkBrackets; (TERMINE)
//        String exemple = ")(((())))";
//        textView2.setText( " Brackets : " + checkBrackets(exemple));

        // mot en desordre (NON FINI)
//        String exemple = " Trouve";
//        textView2.setText("Mot : " + desordreMot(exemple));

        // Suite Fibonnaci exemple de 5 chiffre. (TERMINE)
//        textView.setText("fib for 0 : " + recFibonacci(0));
//        textView2.setText("fib for 1 : " + recFibonacci(1));
//        textView3.setText("fib for 2 : " + recFibonacci(2));
//        textView4.setText("fib for 13: " + recFibonacci(13));

        // test List
//        textView.setText("test : " + testList());

        // test Map
//        textView.setText("test : " + testMap());

        // use class Intervalle;
//        Intervalle i = new Intervalle(2,8);
//        Intervalle j = new Intervalle(8,15);
//        textView.setText("Intervalle 1: "+i.toString());
//        textView2.setText("Intervalle 2: "+j.toString());
//        textView3.setText("contient :"+i.contient(j));
//        textView3.setText("disjoint :"+i.estDisjointDe(j));
//        textView3.setText("intersection :"+i.intersecte(j));
//        if (i.intersecte(j)){
//            textView3.setText("intersection :"+i.intersection(j).toString());
//        } else {
//            textView3.setText("intersection : null");
//        }
//        textView3.setText("union :"+i.union(j).toString());
//        textView3.setText("equals :"+i.equals(j));
        // Exercice - Tests
//        Intervalle i1 = new Intervalle(0,15);
//        Intervalle i2 = new Intervalle(5,25);
//        textView.setText ("i1: "+i1);
//        textView2.setText("i2: "+i2);
//        textView3.setText("i1.intersection(i2) = "+i1.intersection(i2));
//        textView4.setText("i1.union(i2) = "+i1.union(i2));

        // Exercice : Banque, Clients, Compte



        // Exemple Exception;
        try {
            Intervalle interval = new Intervalle(10,8);
            textView.setText("intervalles : " + interval.toString());

        } catch (IOExceptionIntervalle e){
            textView.setText("intervalles : Error ");
        } finally {
        }
    }

    public String testList(){
        List<String> list = new java.util.ArrayList<>();
        list.add("une chaine");
        //list.set(2,"abcde");
        return list.get((0));
    }

    public String testMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("noel", new Date("24 dec 2014"));
        //map.put("une collection", new ArrayList<Dog>());
        return map.get("noel").toString();
    }

    public  String testMap2(){
    // create hash map
    HashMap newmap = new HashMap();

    // populate hash map
    newmap.put(1, "tutorials");
    newmap.put(2, "point");
    newmap.put(3, "is best");

    // get keyset value from map
    Set keyset=newmap.keySet();

    // check key set values
    return "Key set values are: " + keyset;
}

    public String inverse(String mot) {
        mot = mot.toLowerCase();
        StringBuffer sb = new StringBuffer(mot);
        StringBuffer sv = new StringBuffer(mot);
        int len = mot.length();
        for (int i = 1; i < len; i++) { sb.setCharAt(i, sv.charAt(len - i)); }
        return (sb.toString());
    }

    public Boolean isPalindrome(String mot) {
        int i = 1;
        boolean suite = true;
        while (suite) {
            suite = suite && (mot.charAt(i) == mot.charAt(mot.length() - i));
            if (i > mot.length() / 2 || !suite) { break; }
        }
        return (suite);
    }

    public String clean(String phrase) {
        if (phrase.length() == 0) { return ""; }
        StringBuffer sb = new StringBuffer(phrase);
        int i = 0;
        while (sb.charAt(i) == ' ') { sb.deleteCharAt(i); }
        i = sb.length() - 1;
        while (sb.charAt(i) == ' ') { sb.deleteCharAt(i); i--; }
        boolean unSpace = false;
        for (i = 1; i < sb.length(); i++) {
            if (unSpace) {
                unSpace = sb.charAt(i) == ' ';
                if (unSpace) { sb.deleteCharAt(i); i--; }
                continue;
            }
            unSpace = sb.charAt(i) == ' ';
        }
        return (sb.toString());
    }

    public String clean2(String phrase) {
        String recupere;
        recupere = phrase.trim();
        boolean espace = true;
        while (espace) {
            recupere = phrase.replaceAll("  "," ");
            espace = recupere.length() != phrase.length();
            phrase = recupere;
        }
        return(phrase);
    }

    // "les lapins bleus ont mange toutes les carottes";

    //note a single Random object is reused here

    public String desordreMot(String mot) {
        int min = 0;
        int max = mot.length() - 1;
        int randomNb = 0;
        String motInv = "";
        for (int i = 1; i < mot.length(); i++) {
            randomNb = min + (int)(Math.random() * ((max - min) + 1));
            motInv = motInv + randomNb + " ";
        }


        int idx = 0;
        //java.util.Random randomNb= new java.util.Random();
        StringBuffer sb = new StringBuffer(mot);
//        while (sb.length() > 1) {
//           idx = randomNb.nextInt(mot.length());
//           motInv = motInv + sb.charAt(idx);
//            sb.deleteCharAt(idx);
//        }
        return motInv;
    }
    public String desordrePhrase(String phrase) {

        return " ";
    }

    // checkBrackets
    public String checkBrackets(String mot){
        int bracket = 0;
        boolean isStartOk = true;
        StringBuffer sb = new StringBuffer(mot);
        for (int i=0; i < mot.length(); i++) {
            if (isStartOk && (bracket == 0) && (sb.charAt(i) == ')')) {
               isStartOk = false;
                break;
            }
            if (sb.charAt(i) == '(') { bracket = bracket + 1; }
            if (sb.charAt(i) == ')') { bracket = bracket - 1; }

        }
        if (!isStartOk) { return "mut start with ("; }
        if (bracket > 0) { return "( en trop"; }
        if (bracket < 0) { return ") en trop"; }
        return " Ok";
    }


    // java.lang.Math
    // Suite Fibonacci => (n>=2), f(n) = f(n-1) + f(n-2); f(1)=; f(0)=0;
    // methode sequentielle
    public String seqFibonacci(int count){
        int fib_n_2 =1;
        int fib_n_1 =1;
        int fib_n   =0;
        if (count <= 0) { return "0";}
        if (count == 1) { return "1";}
        String show = "1 1 ";
        for (int i=2; i<count; i++){
            fib_n = fib_n_1 + fib_n_2;
            show = show + fib_n + " ";
            fib_n_2 = fib_n_1;
            fib_n_1 = fib_n;
        }
        return show;
    }
    // methode recursive
    String appendCal = "";
    private int prcFibonacci(int count){
        int sum = 0;
        if (count<=0){ appendCal = "0"; return 0; }
        if (count==1){ appendCal = "1"; return 1; }
        sum = prcFibonacci(count-2) + prcFibonacci(count-1);
        appendCal = appendCal + sum + " ";
        return sum;
    }
    public String recFibonacci(int count){
        appendCal = "";
        prcFibonacci(count);
        return appendCal;
    }




}

