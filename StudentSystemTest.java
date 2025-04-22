
import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystemTest {
    public static void main(String[] args) {
        ArrayList<StudentSystem> list = new ArrayList<>();
        int choose = 0;
        while (choose != 5) { 
        Scanner sc = new Scanner(System.in);
        System.err.println("---------学生管理系统---------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输您的选择:");
        choose = sc.nextInt();
        switch (choose) {
            case 1 :
            addStudent(list,sc);
                break;
            case 2 :
            deleteStudent(list,sc);
                break;
            case 3 :
            alterStudent(list,sc);
                break;
            case 4 :
            searchStudent(list, sc);
                break;
            default:
            System.out.println("无效输入");
                break;
        }


      
    }
    }
    public static boolean  addStudent(ArrayList<StudentSystem> list,Scanner sc){
        if(list.size() == 0){
        StudentSystem s = new StudentSystem();
        System.out.println("请输入ID");
        String id = sc.next();
        s.setId(id);
        System.out.println("请输入name");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入age");
        int age = sc.nextInt();
        s.setAge(age);
        System.err.println("请输入家庭地址");    
        String address = sc.next();
        s.setAddress(address);
        list.add(s);
        System.out.println("添加成功");
    }
    else{
        StudentSystem s = new StudentSystem();
        System.out.println("请输入ID");
        String id = sc.next();
            for(int i = 0 ; i < list.size() ; i++){
                if(id.equals(list.get(i).getId())){
                System.out.println("ID输入不合法");
                return false;}
            }
            s.setId(id);
            System.out.println("请输入name");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入age");
            int age = sc.nextInt();
            s.setAge(age);
            System.err.println("请输入家庭地址");    
            String address = sc.next();
            s.setAddress(address);
            list.add(s);
            System.out.println("添加成功");
        }
        return true;
    }

    public static boolean  deleteStudent(ArrayList<StudentSystem> list,Scanner sc){
        System.out.println("请输入要删除学生ID");
        String id = sc.next();
        for(int i = 0 ; i < list.size() ; i++){
        if(id.equals(list.get(i).getId())){
            list.remove(i);
            System.out.println("删除成功");
            return true;
        }

        }
        System.out.println("删除失败,ID不存在");
        return false;
    }

    public static boolean  alterStudent(ArrayList<StudentSystem> list,Scanner sc){
        if(list.size()==0){
            System.out.println("还未添加学生");
            return false;
        }
            System.out.println("请输入要修改的学生ID");
            String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                System.out.println("请输入修改后的name");
                list.get(i).setName(sc.next());
                System.out.println("请输入修改后的age");
                list.get(i).setAge(sc.nextInt());
                System.out.println("请输入修改后的address");
                list.get(i).setAddress(sc.next());
                System.out.println("修改成功");
                return true;
            }
        }
        System.out.println("ID不合法");
        return false;
    }
    public static boolean   searchStudent(ArrayList<StudentSystem> list,Scanner sc){
        if(list.size() == 0){
            System.out.println("还未添加学生");
            return false;
        }
        System.out.println("请输入要查询的ID");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                System.err.println("学生id " + list.get(i).getId());
                System.err.println("学生name " + list.get(i).getName());
                System.err.println("学生age " + list.get(i).getAge());
                System.err.println("学生adderss " + list.get(i).getAddress());
                return true; 
            }
        }
        System.out.println("ID不存在");
        return false;
   }
}
   

// // public
