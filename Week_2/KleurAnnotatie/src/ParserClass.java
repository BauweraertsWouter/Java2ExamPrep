import annotations.Kleur;

import java.lang.reflect.Method;

/**
 * Created by Wouter on 8/01/2017.
 */
public class ParserClass {

    public static void execute(Class<?> aClass){
        try {
            Object anObject = aClass.newInstance();

            for (Method m : aClass.getDeclaredMethods()){
                Kleur kleur = m.getAnnotation(Kleur.class);
                if (kleur != null){
                    String color = kleur.kleurNaam();
                    for (Method method : aClass.getDeclaredMethods()){
                        if (method.getName().startsWith("set")){
                            method.invoke(anObject, color);
                        }
                    }
                    m.invoke(anObject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
