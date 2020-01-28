public class Switch2 {
  public static void main(String[] args) {
    MySwitch obj = new MySwitch();
    obj.box1 = 100;
    obj.box2 = 200;
    obj.swap();
    System.out.println(obj.box1 + "\t" + obj.box2);
  }
}

class MySwitch {
  int box1 = 0;
  int box2 = 0;
  public void swap() {
    int dummy = this.box1;
    this.box1 = this.box2;
    this.box2 = dummy;
  }
}
