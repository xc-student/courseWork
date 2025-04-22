
import java.util.ArrayList;
import java.util.Scanner;



public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        System.out.println("学生管理系统");
        System.out.println("1.登录 2.注册 3.忘记密码");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        while(true){
        switch (choose) {
            case 1:
                login(list ,sc);
                break;
            case 2:
                register(list,sc);
                break;
            case 3:
            forgetPassword(list,sc);
                break;
            case 4:
                System.out.println("谢谢使用");
                System.exit(0);
            default:
                System.out.println("没有这个选项");
        }
    }
    }
    private static void login(ArrayList<User> list,Scanner sc){

    }
    private  static boolean  register(ArrayList<User> list,Scanner sc){
        User user = new User();
        System.out.println("请输入用户名");
        String username = sc.next();
        if(username.length() < 3 || username.length() > 15){
        System.out.println("用户名长度不合法");
        return false;}
        int ifnumber = 0;
        for(int i = 0; i < username.length() ; i++){
            char c = username.charAt(i);
            if( !((c >= 'a' && c < 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9')) ){
                System.out.println("用户名不合规");
                return false;
            }
            else if(c >= '0' && c <= '9'){
                ifnumber = 1;
            }
        }
        if(ifnumber == 0){
            System.out.println("用户名不合规");
            return  false;
        }
        for(int i = 0 ; i < list.size() ; i++){
            if(username.equals(list.get(i).getUserName())){
            System.out.println("用户名重复");
            return false;}
        }
        user.setUserName(username);
        while(true){
        System.out.println("请输入密码");
        String firstpassword = sc.next();
        System.out.println("请确认密码");
        String secondpaasword = sc.next();
        if(!firstpassword.equals(secondpaasword)){
                System.out.println("密码不一致");
            continue;
        }  
        user.setPassword(firstpassword);
        break;
        }
        return  true;

    }
    private static void forgetPassword(ArrayList<User> list,Scanner sc){

    }
}

