class NamedCow extends Cow{
  private String CowName;
  public NamedCow(String name, String type, String sound){
    CowName = name;
  }
  public String getName(){
    return CowName;
  }
}
