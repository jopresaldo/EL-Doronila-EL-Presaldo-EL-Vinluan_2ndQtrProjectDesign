public class Main {
  public static void main(String[] args) {
    Subject english = new Subject("English", 50, 100);
    Subject physics = new Subject("Physics", 32, 125);
    Subject research = new Subject("Research", 90, 20);

    Item scical = new Item("Scientific Calculator", 50, 0.07, 15);
    
    Character joleo = new Character("Jo Leo Presaldo", 1000, 1000, 175, 0.15, physics, research, scical);
    Character vinluan = new Character("Miguel Vinluan", 1200, 1200, 120, 0.30, research, english, scical);
    Character sancho = new Character("Sancho Elias Doronila", 900, 900, 225, 0.20, english, physics, scical);
    
  }
}