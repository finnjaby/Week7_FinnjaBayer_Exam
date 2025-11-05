package ie.atu;

public class Customer {
    int customerId;
    String name;
    String email;
    int phoneNumber;

    Customer(){
        customerId = 0;
        name = "not set";
        email = "not set";
        phoneNumber =0;
    }

    void setCostumerId(int costumerId){
        this.customerId = costumerId;
    }
    void setName(String name){
        this.name = name;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    int getCostumerId(){
        return customerId;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    int getPhoneNumber(){
        return phoneNumber;
    }
}
