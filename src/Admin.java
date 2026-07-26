import java.time.LocalDate;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin (String name, int year, int month, int date) {
        super (name, year, month, date);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | User type: admin" + "\n";
    }

    public String getInfo(boolean full) {
        if (full) {
            return getInfo() + LocalDate.now() + "\n";
        } else {
            return "Name: " + getName() + "\n";
        }
    }

    //To calculate the admin's exact age in years
    public int getAge() {
        return LocalDate.now().getYear() - this.dob.getYear();
    }

    @Override
    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return super.getBirthdayGreeting() +
                    " You are " + getAge() + " years old!";
        } else {
            return super.getBirthdayGreeting();
        }
    }
}
