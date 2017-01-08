package composite;

/* Hier niets veranderen!
*/

public abstract class Component {

  public abstract long getSize();

  public abstract String getPath();

  public abstract void setParent(Directory parent);

  public void add(Component c) { /* empty */ }

  public void remove(Component c) { /* empty */ }

}