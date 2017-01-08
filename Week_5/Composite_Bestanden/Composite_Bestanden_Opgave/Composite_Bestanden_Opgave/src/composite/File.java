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
}
