public final class ClassicFurnitureFactory implements FurnitureFactory {
    private double chairHeight;
    private double tableHeight;
    private int sofaPillow;

    public ClassicFurnitureFactory(double chairHeight, double tableHeight, int sofaPillow) {
        if (chairHeight > 0 && tableHeight > 0 && sofaPillow >= 0) {
            setChairHeight(chairHeight);
            setTableHeight(tableHeight);
            setSofaPillow(sofaPillow);
        } else {
            throw new IllegalArgumentException("Высоты должны быть положительными, количество подушек — неотрицательным.");
        }
    }

    public double getChairHeight() {
        return chairHeight;
    }

    public String setChairHeight(double chairHeight) {
        if (chairHeight > 0) {
            this.chairHeight = chairHeight;
            return "Высота стула изменена";
        }
        return "Высота стула должна быть положительной";
    }

    public double getTableHeight() {
        return tableHeight;
    }

    public String setTableHeight(double tableHeight) {
        if (tableHeight > 0) {
            this.tableHeight = tableHeight;
            return "Высота стола изменена";
        }
        return "Высота стола должна быть положительной";
    }

    public int getSofaPillow() {
        return sofaPillow;
    }

    public String setSofaPillow(int sofaPillow) {
        if (sofaPillow >= 0) {
            this.sofaPillow = sofaPillow;
            return "Количество подушек изменено";
        }
        return "Количество подушек не может быть отрицательным";
    }

    @Override
    public Chair createChair() {
        return new ClassicChair(chairHeight, 45, 45);
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa(sofaPillow, 90, 180);
    }

    @Override
    public Table createTable() {
        return new ClassicTable(tableHeight, 160, 90);
    }
}
