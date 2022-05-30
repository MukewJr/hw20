public enum Days {
    MONDAY("Дуйшомбу куну джава сабагын окуймун."),
    TUESDAY("Шейшемби куну англис тили сабагын окуймун."),
    WEDNESDAY("Шаршемби куну джава сабагын окуймун."),
    THURSDAY("Бейшемби куну практикалык  сабак болот."),
    FRIDAY("Жума куну джава сабагын окуймун."),
    SATURDAY("Ишемби куну эс аламын."),
    SUNDAY("Базар куну оз алдынча иштеймин");
    String st;

    Days(String st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return st;
    }
}
