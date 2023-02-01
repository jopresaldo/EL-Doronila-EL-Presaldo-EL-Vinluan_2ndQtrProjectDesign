public class Subject {
  private String name;
  private int attackFx;
  private int defenseFx;

  //setter
 public Subject(String n, int a, int d) {
    this.name = n;
    this.attackFx = a;
    this.defenseFx = d;
  }

  //getter
  public String getName() {
    return this.name;
  }
  public int getAttackFx() {
    return this.attackFx;
  }
  public int getDefenseFx() {
    return this.defenseFx;
  }
}