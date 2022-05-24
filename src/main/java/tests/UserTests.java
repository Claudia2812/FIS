package tests;

import entities.User;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class UserTests{
    private static final String testUserCode = "123";
    private static User testUser;

    @BeforeClass
    public static void setupClass(){
        testUser = new User(testUserCode);
    }

    @Test
    public void testUserConstructor(){
        assertEquals(testUser.getCode(), testUserCode);

        User testUser2 = new User("123", "456");
        assertEquals(testUser2.getCode(), "123");
        assertEquals(testUser2.getPassword(), "456");
    }

    @Test
    public void testUserCompare(){
        User toCompare1 = new User(testUserCode);
        User toCompare2 = new User("randomString");

        assertTrue(testUser.equals(toCompare1));
        assertFalse(testUser.equals(toCompare2));
    }

    @Test
    public void testUsersGettersSetters(){
        testUser.setBio("Nice bio.");
        testUser.setGender(true);
        testUser.setFirstName("First");
        testUser.setLastName("Last");

        assertEquals(testUser.getBio(), "Nice bio.");
        assertTrue(testUser.getGender());
        assertEquals(testUser.getFirstName(), "First");
        assertEquals(testUser.getLastName(), "Last");
    }
}
