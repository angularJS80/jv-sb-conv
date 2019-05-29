public class User {
    private String userName;
    private int age;
    private String passWrod;

    public User(String userName, int age, String passWrod){
        this.userName = userName;
        this.age = age;
        this.passWrod = passWrod;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassWrod() {
        return passWrod;
    }

    public void setPassWrod(String passWrod) {
        this.passWrod = passWrod;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", passWrod='" + passWrod + '\'' +
                '}';
    }
}
