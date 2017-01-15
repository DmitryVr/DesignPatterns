package behavioral.template;

/**
 * абстрактный метод, у которого различный функционал,
 * переопределяются в классах-наследниках
 * здесь он вызывается из нужного место в методе showPage()
 */
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
