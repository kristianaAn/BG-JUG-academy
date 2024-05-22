package unit_testing;

import unit_testing_exam_9.CollectionUtils;

public class CollectionUtilsTest {


    @org.junit.jupiter.api.Test
    public void testWhenNumberNotInListReturnsFalse() {

        boolean searched = CollectionUtils.search(java.util.List.of(1, 2, 5, 9), 7);

        org.junit.jupiter.api.Assertions.assertFalse(searched);
    }

    @org.junit.jupiter.api.Test
    public void testWhenNumberIsInListReturnsTrue() {

        boolean searched = CollectionUtils.search(java.util.List.of(1, 2, 5, 9), 2);

        org.junit.jupiter.api.Assertions.assertTrue(searched);
    }

    @org.junit.jupiter.api.Test
    public void testWhenNumbersListIsNullThrows() {

        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, ()
                -> CollectionUtils.search(null, 2));
    }

    @org.junit.jupiter.api.Test
    public void testWhenNumberSearchedIsNullThrows() {

        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, ()
                -> CollectionUtils.search(java.util.List.of(1, 2, 5, 9), null));
    }
}
