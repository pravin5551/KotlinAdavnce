public class SingleTonObj {

    private static SingleTonObj INSTANCE;

    public static synchronized  SingleTonObj getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }
        return new SingleTonObj();
    }

    public void doSomething(){
        System.out.println("Inside doSomething");
    }
}

