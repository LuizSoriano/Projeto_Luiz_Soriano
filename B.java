public class B {
    private int B1;
    private float B2;

    public B(){
        B1 = 20;
        B2 = 20.5f;
    }

    public int getB1(){
        System.out.println("getB1");
        return B1;
    }

    public float getB2(){
        System.out.println("getB2");
        return B2;
    }

    public void setB1(){
        System.out.println("setB1");
        B1 = 30;
    }

    public void setB2(){
        System.out.println("setB2");
        B2 = 30.5f;
    }

    public void MB1(){
        System.out.println("MB1");
    }

    public void MB2(){
        System.out.println("MB2");
    }
}
