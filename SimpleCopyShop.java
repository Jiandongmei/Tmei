package mei.mei.mei;

public class SimpleCopyShop {
    public static void main(String []args){
        //main方法
        Copier jn = new Copier("佳能");
        Copier xp = new Copier("夏普");
        Employee 梅建东 = new Employee("梅建东",233443,jn);
        Employee 姚冬晴 = new Employee("姚冬晴",12442,xp);
        Employee 习近平 = new Employee("习近平",122222,xp);
        习近平.start();
        梅建东.start();
        姚冬晴.start();

    }
}
