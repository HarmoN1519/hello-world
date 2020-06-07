public class PersonValidator {
    boolean isPersonValid(Person person) {
        if (person == null) {
            return false;
        }
        if (person.getName().isBlank()) return false;
        if (person.getHeight() < 0.0 || person.getHeight() > 2.4) {
            return false;
        }
        if (person.getAge() < 0 || person.getAge() > 130) {
            return false;
        }
        return true;
    }
}