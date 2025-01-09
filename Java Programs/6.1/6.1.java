public class AstronautBuilder {
    // Create your fields for name, age, address, and phone number.
    String name;
    int age;
    String address;
    String phone;
    // The setName method sets the person's name.

    public void setName(String newName) {
        this.name = newName;
    }
    
    // The setAge method sets the person's age.
    public void setAge (int newAge) {
        this.age = newAge;
    }

    // The setAddress method sets the person's address.
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    // The setPhone method sets the person's phone number.
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // The getName method returns the person's name.
    public String getName() {
        return name;
    }
    // The getAge method returns the person's age.
    public int getAge() {
        return age;
    }
    // The getAddress method returns the person's address.
    public String getAddress() {
        return address;
    } 
    // The getPhone method returns the person's phone number.
    public String getPhone() {
        return phone;
    } 
}
