package mei.mei.mei;
/*
员工线程类
 */
public class Employee extends Thread {
    private int workTimes;//员工工作的份额
    private Copier copier;//复印件
    //构造方法，name是线程的名字，也是员工的名字
    public Employee(String name,int workTimes,Copier copier){
        super(name);//调用父类构造方法
        this.workTimes= workTimes;
        this.copier = copier;

    }
    public void run(){
        //覆盖Thread类的run方法
        System.out.println(this.getName()+":开始工作");
        for (int i= 0 ;i<workTimes;i++){
            int pagesAmount = (int )(5*Math.random())+1;
            copier.copyPages(pagesAmount);//调用方法进行复印


        }
        System.out.println(this.getName()+"：完成了工作，下班回家");
    }
}
