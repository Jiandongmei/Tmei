package mei.mei.mei;

public class Copier {
    private String name;//复印件的名字
    public Copier(String name){
        //构造方法
        this.name= name;

    }
    public String getName(){
        return name;//得到复印件名字

    }
    public void copyPages(int pages){
        //复印机
        Thread employee = Thread.currentThread();//得到当前员工线程
        System.out.println(employee.getName()+"\t正在使用复印机\t"+name);//向控制台输出哪个员工正在使用复印件机
        long time = pages*10000;//假设一张纸复印需要是10miao
        try {
            Thread.sleep(time);
        }catch (InterruptedException e ){
            System.out.println("程序出现错误，错误信息如下："+e.getMessage());

        }
        System.out.println(employee.getName()+"\t用完了复印机,下班！\t"+name);
    }
}
