package study.uml;

public class Car {

  Engine engine;
  Insurance insurance;
  Navigation navigation;

  public Car(Engine engine) {

  }

  public Insurance getInsurance() {
    return insurance;
  }

  public void setInsurance(Insurance insurance) {
    this.insurance = insurance;
  }

  public Navigation getNavigation() {
    return navigation;
  }

  public void setNavigation(Navigation navigation) {
    this.navigation = navigation;
  }

  public Engine getEngine() {
    return engine;
  }

  public void fuelIp(GasStation gasStation) {

  }

}
