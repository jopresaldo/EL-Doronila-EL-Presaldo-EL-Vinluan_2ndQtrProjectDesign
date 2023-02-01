public class Item {
  private String name;
  private int attackBonus;
  private double defenseBonus;
  private int use;

  //setter
  public Item(String n, int a, double d, int u) {
    this.name = n;
    this.attackBonus = a;
    this.defenseBonus = d;
    this.use = u;
  }

  //getter
  public String getName() {
    return this.name;
  }
  public int getAtkBonus() {
    return this.attackBonus;
  }
  public double getDefBonus() {
    return this.defenseBonus;
  }
  public int getUse() {
    return this.use;
  }
}