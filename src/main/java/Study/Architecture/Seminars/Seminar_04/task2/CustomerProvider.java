package Study.Architecture.Seminars.Seminar_04.task2;

public class CustomerProvider {

    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password) {

        if (login.isEmpty())
            throw new RuntimeException("Поле логин пустое!");

        if (password.isEmpty())
            throw new RuntimeException("Поле пароль пустое!");

        return new Customer(login, password);
    }


}
