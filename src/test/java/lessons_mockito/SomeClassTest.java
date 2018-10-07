package lessons_mockito;

import lessons_mockito.Helper;
import lessons_mockito.SomeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SomeClassTest {

    private SomeClass someClass;
    private Helper helper = Mockito.mock(Helper.class);

    @BeforeEach
    void before() {
        someClass = new SomeClass(helper);
    }

    @Test
    void methodWithHelperTest() {
        when(helper.someHelperMethod(anyInt(), anyInt())).thenReturn(1);
        Integer res = someClass.methodWithHepler(1, 2);
        verify(helper).someHelperMethod(11, 7);
        assertEquals(new Integer(1), res);
    }
}
