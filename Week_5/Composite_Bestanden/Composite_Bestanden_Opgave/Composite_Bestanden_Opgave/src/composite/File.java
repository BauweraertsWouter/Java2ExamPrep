package composite;

public class File extends Component{
  private final String name;
  private final long size;
  private Directory parent;

  public File(String name, long size){
    this.name = name;
    this.size = size;
    this.parent = null;
  }

  // Vanaf hier zelf uitwerken:
  @Override
  public long getSize() {
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
    public String toString() {
        return String.format("%s (%dkb)", getPath(), getSize());
    }
}
