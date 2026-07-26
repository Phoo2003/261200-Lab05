void main() {
    User user1 = new User("Sylvester", 2946, 7, 6);
    System.out.println(user1.dob);
    System.out.println(user1.getInfo());

    Admin admin1 = new Admin("Nicolas", 1964, 1, 7);
    System.out.println(admin1.dob);
    System.out.println(admin1.getInfo());

    System.out.println(admin1.getInfo(true));
    System.out.println(admin1.getInfo(false));

    LocalDate today = LocalDate.now();

    User user2 = new User( "Alice", today.getYear() - 20, today.getMonthValue(), today.getDayOfMonth());
    System.out.println(user2.getBirthdayGreeting());

    Admin admin2 = new Admin("John", today.getYear() - 72, today.getMonthValue(), today.getDayOfMonth());
    System.out.println(admin2.getBirthdayGreeting());
}