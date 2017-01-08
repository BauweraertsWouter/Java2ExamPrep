import annotations.MijnAnnotatie;
import annotations.Wat;

@Wat(omschrijving = "Een annotatie testklasse")
@MijnAnnotatie(string = "Demo", waarde = 99)
public class MyClass {
    @Wat(omschrijving = "Een annotatie testmethode")
    @MijnAnnotatie(string = "Test", waarde = 100)
    public void demoMethode(){
        //
    }
}
