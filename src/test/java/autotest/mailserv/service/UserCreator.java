package autotest.mailserv.service;

public class UserCreator {

    public static final String TESTDATA_USER_NAME = "testdata.user.name";

    public static Uzer withCredentialsFromProperty() {
        return new Uzer(TestDataReader.getTestData(TESTDATA_USER_NAME));
    }
}
