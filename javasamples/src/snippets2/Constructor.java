package snippets2;

/**
 * Created by root on 11/3/16.
 */
public class Constructor {

    int height;
    int width;
    int depth;

    Constructor(){
        System.out.println("Constructor");
    }

    Constructor(int height,int width,int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    public int computeVolume(){
        return this.height*this.width*this.depth;
    }

    public static void main(String args[]){

    Constructor volume=new Constructor(5,5,5);
    System.out.println("volume: "+volume.computeVolume());

    }

}
