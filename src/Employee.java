public class Employee extends  TextBox{
    private int baseSalary;
    private int rateperhour;
    public static int noofEmployees;
//    public Employee(int baseSalary, int rateperhour) {
//        setBaseSalary(baseSalary);
//        setRateperhour(rateperhour);
//        noofEmployees ++;
//    }

//    public Employee(int baseSalary) {
//        setBaseSalary(baseSalary);
//        setRateperhour(0);
//
//    }
    public void  render(){
        System.out.println("this is employee class");
    }

      public int getsalary(int extrahours){
          return baseSalary +(extrahours*rateperhour);
      }
      public int getsalary(){
          return baseSalary ;
      }
    public int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary<=10 && baseSalary>=1000000)
            throw new IllegalArgumentException();
        this.baseSalary = baseSalary;
    }

    public int getRateperhour() {
        return rateperhour;
    }

    public void setRateperhour(int rateperhour) {
        this.rateperhour = rateperhour;
    }
}
