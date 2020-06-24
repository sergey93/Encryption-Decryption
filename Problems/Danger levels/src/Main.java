enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private int level;
    DangerLevel(int value) {
        level = value;
    }
    public int getLevel(){
        return level;
    }
}