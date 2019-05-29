public class UserController {
    User[] users = new User[100];

    public String create(User user){
        int nextUserNum =  getNextUserNum();
        users[nextUserNum] = user;
        return "OK";
    }

    public User[] getUsers(){
        return users;
    }

    public int getNextUserNum(){
        for(int i=0;i<users.length;i++){
            if(users[i]==null){
                 return i;
            }
        }
        return 10000;
    }
}
