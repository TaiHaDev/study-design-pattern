/**
 * an Object behaves different based on its internal state
 */
public class State {

}
abstract class Session {
    public UserState userState;
    public Session() {
        this.userState = new UserState();
    }
    abstract boolean login();
    abstract boolean logout();

}
class UserSession extends Session {
    @Override
    boolean login() {
        System.out.println("already signed in");
        return false;
    }

    @Override
    boolean logout() {
        System.out.println("logging you out!");

    }
}
class NoUserSession extends Session {

    @Override
    boolean login() {
        System.out.println("checking....You are logged in !");
        return true;
    }

    @Override
    boolean logout() {
        System.out.println("you are not logged in yet!");
        return false;
    }
}
class UserState {
    Session session;
    public UserState() {
        session = new NoUserSession();
    }
    public void changeSession(Session session) {
        this.session = session;
    }
}
