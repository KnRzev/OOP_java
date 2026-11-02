public final class Main {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Main(FurnitureFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("Фабрика не должна быть null.");
        }
        Chair createdChair = factory.createChair();
        Sofa createdSofa = factory.createSofa();
        Table createdTable = factory.createTable();
        if (createdChair == null || createdSofa == null || createdTable == null) {
            throw new IllegalArgumentException("Фабрика должна создавать стул, диван и стол.");
        }
        setChair(createdChair);
        setSofa(createdSofa);
        setTable(createdTable);
    }

    public Chair getChair() {
        return chair;
    }

    public String setChair(Chair chair) {
        if (chair == null) {
            return "Стул не должен быть null.";
        }
        this.chair = chair;
        return "Стул заменён.";
    }

    public Sofa getSofa() {
        return sofa;
    }

    public String setSofa(Sofa sofa) {
        if (sofa == null) {
            return "Диван не должен быть null.";
        }
        this.sofa = sofa;
        return "Диван заменён.";
    }

    public Table getTable() {
        return table;
    }

    public String setTable(Table table) {
        if (table == null) {
            return "Стол не должен быть null.";
        }
        this.table = table;
        return "Стол заменён.";
    }

    public String describeFurniture() {
        return chair.describe() + "\n\n" + sofa.describe() + "\n\n" + table.describe();
    }

    public boolean isChairCompatibleWithTable() {
        return chair.isWithTable(table.getHeight());
    }

    public boolean canSeatGuests(int countPeople) {
        return countPeople >= 0 && (countPeople == 0 || sofa.canSeatPeoples(countPeople - 1));
    }

    public static void main(String[] args) {
        FurnitureFactory[] factories = {
            new ClassicFurnitureFactory(45, 75, 3),
            new ModernFurnitureFactory(45, 75, 2)
        };

        for (FurnitureFactory factory : factories) {
            Main demonstration = new Main(factory);
            System.out.println("\n" + demonstration.describeFurniture());
            System.out.println("Площадь сиденья: " + demonstration.getChair().calculateSeatArea() + " см²");
            System.out.println("Площадь столешницы: " + demonstration.getTable().calculateTableArea() + " см²");
            System.out.println("Мест за столом: " + demonstration.getTable().calculateMaxPeoples());
            System.out.println("Мест на диване: " + demonstration.getSofa().maxSeatPeople());
            System.out.println("Стул подходит к столу: " + demonstration.isChairCompatibleWithTable());
            System.out.println("Стул и диван вместят 4 гостей: " + demonstration.canSeatGuests(4));

            Chair chair = demonstration.getChair();
            System.out.println("\nПример работы геттера и сеттера");
            System.out.println("Высота стула до изменения: " + chair.getHeight());
            System.out.println(chair.setHeight(60));
            System.out.println("Высота стула после изменения: " + chair.getHeight());
            System.out.println("Стул подходит к столу после изменения: "
                    + demonstration.isChairCompatibleWithTable());
        }
    }
}
