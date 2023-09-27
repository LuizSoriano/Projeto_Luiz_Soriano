public class A {
    private int A1;
    private float A2;

    public A(){
        A1 = 10;
        A2 = 10.5f;
    }

    public int getA1(){
        System.out.println("getA1");
        return A1;
    }

    public float getA2(){
        System.out.println("getA2");
        return A2;
    }

    public void setA1(){
        System.out.println("setA1");
        A1 = 20;
    }

    public void setA2(){
        System.out.println("setA2");
        A2 = 20.5f;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteração da classe A do clone");
    }
}
