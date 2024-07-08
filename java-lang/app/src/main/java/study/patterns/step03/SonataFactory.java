package study.patterns.step03;

public class SonataFactory extends CarFactory {

  @Override
  public Car createCar() {
    Sedan s = new Sedan();
    s.maker = "현대자동차";
    s.model = "소나타";
    s.cc = 1998;
    s.auto = true;
    s.sunroof = false;
    return s;
  }

}
