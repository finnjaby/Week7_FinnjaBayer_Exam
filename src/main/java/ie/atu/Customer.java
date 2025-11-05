package ie.atu;

public class Customer {
    int costumerId;
    String name;
    String email;
    int phoneNumber;

    Customer(){
        costumerId = 0;
        name = "not set";
        email = "not set";
        phoneNumber =0;
    }

    void setCostumerId(int costumerId){
        this.costumerId = costumerId;
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
        return costumerId;
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
