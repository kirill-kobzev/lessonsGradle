package lessons_mockito;

public class SomeClass {
    Helper helper;

    public SomeClass(Helper helper) {
        this.helper = helper;
    }

    public Integer methodWithHepler(Integer a, Integer b) {
        int res = helper.someHelperMethod(a + 10, b + 5);
        return res;
    }
}
