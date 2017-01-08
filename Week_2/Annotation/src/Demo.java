import annotations.MijnAnnotatie;
import annotations.Wat;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo {

    public void demoMethode(){
        MyClass mijnKlasse = new MyClass();

        try{
            //Show all annotations for mijnKlasse
            toonClassAnnotations(mijnKlasse);
            //Show the values of the Class-Annotations
            toonWaardenClassAnnotations(mijnKlasse);
            //Show all annotations for MyClass.demoMethod
            toonMethodeAnnotations(mijnKlasse);
            //Show the values for all the annotations for MyClass.demoMethod
            toonWaardenMethodAnnotations(mijnKlasse);
        }catch (Exception e){
            System.out.println("Method niet gevonden");
        }
    }

    private void toonWaardenMethodAnnotations(MyClass mijnKlasse) {
        for (Method m : mijnKlasse.getClass().getDeclaredMethods()){
            System.out.println("Alle parameters");
            for (Annotation a : m.getAnnotations()){
                printAnnotationParameters(a);
            }
        }
        System.out.println();
    }

    private void toonMethodeAnnotations(MyClass mijnKlasse) {
        for (Method m : mijnKlasse.getClass().getDeclaredMethods()){
            System.out.println("Alle annotaties voor " + m.getName());
            for (Annotation a : m.getAnnotations()){
                System.out.println(a);
            }
        }
        System.out.println();
    }

    private void toonWaardenClassAnnotations(MyClass mijnKlasse) {
        Class klasse = mijnKlasse.getClass();
        System.out.println("Alle parameters:");
        for (Annotation a : klasse.getAnnotations()){
            printAnnotationParameters(a);
        }
        System.out.println();
    }

    private void printAnnotationParameters(Annotation a) {
        if (a instanceof Wat){
            Wat wat = (Wat) a;
            System.out.println(wat.omschrijving());
        }else if (a instanceof MijnAnnotatie){
            MijnAnnotatie mijnAnnotatie = (MijnAnnotatie) a;
            System.out.println(mijnAnnotatie.string() + " " + mijnAnnotatie.waarde());
        }
    }

    private void toonClassAnnotations(MyClass mijnKlasse) {
        System.out.println("Alle annotaties voor mijnklasse");
        for (Annotation a : mijnKlasse.getClass().getAnnotations()){
            System.out.println(a);
        }
        System.out.println();
    }
}
