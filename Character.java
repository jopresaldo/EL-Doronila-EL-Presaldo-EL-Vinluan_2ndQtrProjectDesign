public class Character extends Abilities {
  private String name;
  private int maxHP;
  protected int hp;
  protected int atk;
  protected double def;
  private Subject specialization;
  private Subject weakness;
  protected Item item;

  public Character(String n, int m, int h, int a, double d, Subject s, Subject w, Item i) {
    this.name = n;
    this.maxHP = m;
    this.hp = h;
    this.atk = a;
    this.def = d;
    this.specialization = s;
    this.weakness = w;
    this.item = i;
  }

  void checkSubject(Subject s) {
    if(s.equals(specialization)) {
      atk += s.getAttackFx();
      def += s.getDefenseFx();
    }
    else if(s.equals(weakness)) {
      atk -= s.getAttackFx();
      def -= s.getDefenseFx();
    }
  }
}