package lesson02.part01;

/**
 * Создать 5 зергов, 3 протосса и 4 террана.
 * Дать им всем уникальные имена.
 * <p>
 * <p>
 * Требования:
 * 1.	Нельзя изменять классы Zerg, Protoss и Terran.
 * 2.	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
 * 3.	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
 * 4.	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
 */

public class Task07 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "A";
        zerg2.name = "B";
        zerg3.name = "C";
        zerg4.name = "D";
        zerg5.name = "E";
        Protoss protoss1=new Protoss();
        Protoss protoss2=new Protoss();
        Protoss protoss3=new Protoss();
        protoss1.name="z";
        protoss2.name="x";
        protoss3.name="c";
        Terran terran1=new Terran();
        Terran terran2=new Terran();
        Terran terran3=new Terran();
        Terran terran4=new Terran();
        terran1.name="t";
        terran2.name="o";
        terran3.name="p";
        terran4.name="h";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
