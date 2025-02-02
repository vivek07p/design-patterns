package builder;

public class User {
    private final String firstName; // Required
    private final String lastName;  // Required
    private final String email;     // Optional
    private final String phone;     // Optional
    private final String address;   // Optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Builder Class
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String email;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{firstName='" + firstName + "', lastName='" + lastName + "', email='" + email +
                "', phone='" + phone + "', address='" + address + "'}";
    }

    public static void main(String[] args) {
        User user = new User.UserBuilder("John", "Doe")
                .email("john.doe@example.com")
                .phone("1234567890")
                .address("123 Street, NY")
                .build();

        System.out.println(user);
    }
}
