import java.time.LocalDate;

public class User {

    protected String name;
    protected LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob (int year, int month, int date) {
        LocalDate newDob = LocalDate.of(year, month, date);
        if(newDob.isAfter(LocalDate.now())) {
            this.dob = LocalDate.now();
        } else {
            this.dob = newDob;
        }
    }

    public User() {
        setName("Unknown");
        setDob (LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
    }

    public User (String name, int year, int month, int date) {
        this.setName(name);
        this.setDob(year, month, date);
    }

    public String getInfo() {
        return "Name: " + this.name + "\nDOB: " + this.dob;
    }

    //Checks if today is the user's birthday
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return this.dob.getMonthValue() == today.getMonthValue() &&
                this.dob.getDayOfMonth() == today.getDayOfMonth();
    }

    //Add getBirthday Greeting
    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return "Happy birthday " + this.name + "!";
        } else {
            return "It is not " + this.name + "'s birthday today.";
        }
    }
}
