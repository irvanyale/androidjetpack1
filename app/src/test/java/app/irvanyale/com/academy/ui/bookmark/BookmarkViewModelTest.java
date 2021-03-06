package app.irvanyale.com.academy.ui.bookmark;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import app.irvanyale.com.academy.data.CourseEntity;

import static org.junit.Assert.*;

public class BookmarkViewModelTest {

    private BookmarkViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new BookmarkViewModel();
    }

    @Test
    public void getBookmark() {
        List<CourseEntity> courseEntities = viewModel.getBookmarks();
        assertNotNull(courseEntities);
        assertEquals(5, courseEntities.size());
    }

}