package Strategy;

public abstract class CinemaAppUser {
    UserBehaviour userBehaviour;

    public CinemaAppUser(){}

    public void setUserBehaviour(UserBehaviour u_b){
        userBehaviour = u_b;
    }

    public void performOperation(){
        userBehaviour.execute();
    }
}
