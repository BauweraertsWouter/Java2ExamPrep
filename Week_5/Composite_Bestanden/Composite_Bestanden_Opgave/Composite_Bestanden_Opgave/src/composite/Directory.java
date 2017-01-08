package composite;

import java.util.ArrayList;
import java.util.List;

public final class Directory extends Component{
  private final String name;
  private final List<Component> children;
  private Directory parent;

  public Directory(String name){
    this.name = name;
    this.parent = null;
      children = new ArrayList<>();
  }

  // Vanaf hier zelf uitwerken:
  @Override
  public long getSize() {
      long size = 0;
      for (Component c : children) {
          size += c.getSize();
      }
      return size;
  }

    @Override
    public String getPath() {
        return ((parent != null) ? (parent.getPath() + "\\") : "") + this.name;
    }

    @Override
    public void setParent(Directory parent) {
        this.parent = parent;
    }

    @Override
    public void add(Component c) {
        children.add(c);
        c.setParent(this);
    }

    @Override
    public void remove(Component c) {
        c.setParent(null);
        children.remove(c);
    }

    @Override
    public String toString() {
        return String.format("%s (%dkb)", getPath(), getSize());
    }
}
