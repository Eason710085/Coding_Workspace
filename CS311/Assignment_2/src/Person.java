public class Person {
  String personInfo;
  String name;
  String birthday;

  public String getPersonInfo() {
    return personInfo;
  }

  public void setPersonInfo(String personInfo) {
    this.personInfo = personInfo;
  }

  public Person(String personInfo, String name, String birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
}
