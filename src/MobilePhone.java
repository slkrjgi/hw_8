public abstract class MobilePhone {

    public void start() {
        System.out.println("Started!");
    }

    public abstract String getModelName();

    public abstract void setModelName(String name);

    public void launchGame() {
        System.out.println("The game is launched!");
    }

}
