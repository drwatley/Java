package ca.bcit.comp2526.a1b;

/**
 * Person stores a name and phone number.
 * @author Armin T. - A00942927
 * @version v1.0 Jan 18, 2016
 */
public class Person {
    private final String name;
    private final String phone;

    /**
     * Constructor for objects of type Person.
     * @param name A String
     * @param phone A String
     */
    public Person(final String name, final String phone) {
        this.name = name;
        this.phone = phone;
    }

    /**
     * Returns name as a String.
     * @return WHAT DOES THIS RETURN? - a String, Person's name.
     */
    public String getName() {
        return (name);
    }

    /**
     * Returns phone number as a String.
     * @return WHAT DOES THIS RETURN? - a String, Person's phone.
     */
    public String getPhoneNumber() {
        return (phone);
    }
}
