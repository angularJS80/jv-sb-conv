import java.util.Scanner;

public class Main {
    public static UserController userController;


    public static void main(String[] args) {
        userController = new UserController();
        boolean isProcess=true;

        while (isProcess){
            System.out.println("input command : ");
            Scanner scan = new Scanner(System.in);
            String doCommand = scan.next();

            if(doCommand.equals("end")){
                isProcess = false;
            }

            if(doCommand.equals("createuser")){
                createUser();
            }

            if(doCommand.equals("listuser")){
                listUser();
            }


        }
    }

    private static void listUser() {
        User[] users = userController.getUsers();

        for (int i=0 ;i<users.length;i++){
            if(users[i]!=null){
                System.out.println(users[i]);
            }
        }
    }

    private static void createUser() {
        User user = inputUser();
        userController.create(user);
    }


    public static User inputUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("사용자 이름 입력 :");
        String name = scan.next();
        System.out.println("사용자 나이 입력 :");
        int age =  scan.nextInt();
        System.out.println("사용자 비밀번호 입력 :");
        String passWord = scan.next();
        User user = new User(name,age,passWord);
        //System.out.println(user);
        return user;
    }
}
