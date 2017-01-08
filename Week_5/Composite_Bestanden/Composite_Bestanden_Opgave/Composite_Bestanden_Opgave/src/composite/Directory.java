package composite;

import java.util.*;

public final class Directory extends Component{
  private final String name;
  private final List<Component> children;
  private Directory parent;

  public Directory(String name){
    this.name = name;
    this.parent = null;
    children = new ArrayList<Component>();
  }

  // Vanaf hier zelf uitwerken:
}
