package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class Entity {
    int data;
    boolean isLocked=false;
    Entity(){
        data=0;
    }
    public synchronized void setx(int data){
        if(isLocked){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("setData = " + data);
        this.data=data;
        isLocked=true;
        notify();
    }

    public synchronized int getx(){
        if(!isLocked){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
/*        System.out.println("getx = " + this.data);*/
        System.out.println("getData = " + this.data);
        isLocked=false;
        notify();
        return this.data;
    }
}
