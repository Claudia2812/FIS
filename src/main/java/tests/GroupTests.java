package tests;

import entities.Group;
import entities.User;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GroupTests {
    private static final String testGroupCode = "123";
    private static Group testGroup;

    @BeforeClass
    public static void setupClass(){
        testGroup = new Group(testGroupCode);
    }

    @Test
    public void testGroupConstructor(){
        User admin = new User("123");
        ArrayList<String> user_ids = new ArrayList<>();
        user_ids.add("123");
        user_ids.add("456");
        Group groupConstTest = new Group("567", "Group name", true, admin, user_ids);

        assertEquals(groupConstTest.getCode(), "567");
        assertEquals(groupConstTest.getName(), "Group name");
        assertTrue(groupConstTest.getIsPrivate());
        assertEquals(groupConstTest.getAdministrator(), admin);
        assertEquals(groupConstTest.getMembers(), user_ids);
    }
}
