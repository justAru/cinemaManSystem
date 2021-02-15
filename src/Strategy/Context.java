package Strategy;

public class Context {
    private UserBehaviour userBehaviour;

    public Context(){
        this.userBehaviour = new Visit();
    }

    public Context(UserBehaviour userBehaviour){
        this.userBehaviour = new Visit();
    }
    public void performOperation(){
        userBehaviour.execute();
    }

    public void setUserBehaviour(UserBehaviour userBehaviour){
        this.userBehaviour = userBehaviour;
    }
}
