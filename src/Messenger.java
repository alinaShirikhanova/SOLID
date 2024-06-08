public class Messenger {
    String address;
    boolean logged;

    public Messenger(String address) {
        this.address = address;
        this.logged = false;
    }

    public void login() {
        this.logged = true;
        System.out.println("Вход успешно выполнен");
    }

    public void logout() {
        this.logged = false;
        System.out.println("Выход успешно выполнен");
    }

    public void send(String receiver, String message) {
        System.out.println("Отправляем сообщение пользователю " + receiver);
    }

    public void update() {
        System.out.println("Проверяем на наличие новых писем");
    }

    public void loadMedia() {
        System.out.println("Загружаем медиа-файл...");
    }

    public void sendMedia() {
        System.out.println("Отправляем ссылку на файл...");
    }

    public void getMessages() {
        System.out.println("Отображаем новые письма...");
    }
}