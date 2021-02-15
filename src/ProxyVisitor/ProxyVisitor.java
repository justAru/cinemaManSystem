package ProxyVisitor;

public class ProxyVisitor implements CinemaVisitor {
    Adult adult;
    Child child;
    Retiree retiree;
    Student student;
    Manager manager;
    String visitor;
    String result = " ";

    public ProxyVisitor(String visitor) {
        this.visitor = visitor;
    }

    @Override
    public String visit(Red red) {
        if (visitor.matches("adult")){
            Adult adult = new Adult();
            result = adult.visit(red);
        } else if (visitor.matches("child")){
            Child child = new Child();
            result = "Access limited!";
        }else if (visitor.matches("student")){
            Student student = new Student();
            result = student.visit(red);
        }else if (visitor.matches("retiree")){
            Retiree retiree = new Retiree();
            result = retiree.visit(red);
        }else if (visitor.matches("manager")) {
            Manager manager = new Manager();
            result = manager.visit(red);
        }return result;
    }

    @Override
    public String visit(Blue blue) {
        if (visitor.matches("adult")){
            Adult adult = new Adult();
            result = adult.visit(blue);
        } else if (visitor.matches("child")){
            Child child = new Child();
            result = child.visit(blue);
        }else if (visitor.matches("student")){
            Student student = new Student();
            result = student.visit(blue);
        }else if (visitor.matches("retiree")){
            Retiree retiree = new Retiree();
            result = retiree.visit(blue);
        }else if (visitor.matches("manager")) {
            Manager manager = new Manager();
            result = manager.visit(blue);
        }return result;
    }

    @Override
    public String visit(Green green) {
        if (visitor.matches("adult")){
            Adult adult = new Adult();
            result = adult.visit(green);
        } else if (visitor.matches("child")){
            Child child = new Child();
            result = child.visit(green);
        }else if (visitor.matches("student")){
            Student student = new Student();
            result = student.visit(green);
        }else if (visitor.matches("retiree")){
            Retiree retiree = new Retiree();
            result = retiree.visit(green);
        }else if (visitor.matches("manager")) {
            Manager manager = new Manager();
            result = manager.visit(green);
        }return result;
    }

    @Override
    public String visit(White white) {

        if (visitor.matches("adult")){
            Adult adult = new Adult();
            result = adult.visit(white);
        } else if (visitor.matches("child")){
            Child child = new Child();
            result = "Access limited!";
        }else if (visitor.matches("student")){
            Student student = new Student();
            result = student.visit(white);
        }else if (visitor.matches("retiree")){
            Retiree retiree = new Retiree();
            result = retiree.visit(white);
        }else if (visitor.matches("manager")) {
            Manager manager = new Manager();
            result = manager.visit(white);
        }return result;
    }

    @Override
    public String visit(Orange orange) {

        if (visitor.matches("adult")){
            Adult adult = new Adult();
            result = adult.visit(orange);
        } else if (visitor.matches("child")){
            Child child = new Child();
            result = child.visit(orange);
        }else if (visitor.matches("student")){
            Student student = new Student();
            result = student.visit(orange);
        }else if (visitor.matches("retiree")){
            Retiree retiree = new Retiree();
            result = retiree.visit(orange);
        }else if (visitor.matches("manager")) {
            Manager manager = new Manager();
            result = manager.visit(orange);
        }return result;
    }

    @Override
    public String visit(Yellow yellow) {
        if (visitor.matches("adult")){
            Adult adult = new Adult();
            result = adult.visit(yellow);
        } else if (visitor.matches("child")){
            Child child = new Child();
            result = "Access limited!";
        }else if (visitor.matches("student")){
            Student student = new Student();
            result = student.visit(yellow);
        }else if (visitor.matches("retiree")){
            Retiree retiree = new Retiree();
            result = retiree.visit(yellow);
        }else if (visitor.matches("manager")) {
            Manager manager = new Manager();
            result = manager.visit(yellow);
        }
        return result;
    }
}
