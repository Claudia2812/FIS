package tests;

import entities.Post;
import entities.User;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;

import static junit.framework.TestCase.*;

public class PostTests {
    private static Post testPost;

    @BeforeClass
    public static void setupClass(){
        testPost = new Post();
    }

    @Test
    public void testPostConstructor(){
        assertNull(testPost.getMessage());
        assertNull(testPost.getPosterName());
    }

    @Test
    public void testGettersSetters(){
        Date postDate = new Date(21312313);
        User poster = new User("123567");

        testPost.setPostID(123);
        testPost.setPoster(poster);
        testPost.setDate(postDate);

        assertEquals(testPost.getPostID(), 123);
        assertEquals(testPost.getPoster(), poster);
        assertEquals(testPost.getDate(), postDate);
    }
}
