import java.util.Comparator;

public class Customers  {

    private int id;
    private String fullName;
    private int creditCardNumber;
    private int bankAccountNumber;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }



    public Customers(int id, String fullName, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.fullName = fullName;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }


  public static class NameComparator implements Comparator<Customers>{
        @Override
        public int compare (Customers o1, Customers o2){return o1.getFullName().compareTo(o2.getFullName());}
  }
}
