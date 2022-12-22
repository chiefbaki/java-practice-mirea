public enum Season {

    WINTER, SPRING, SUMMER, AUTUMN;

    private static int[] tempr = {10, 18, 35, 10};

    private int avgTemp;

    Season(int avgTemp){
        this.avgTemp = avgTemp;
    }

    Season() {

    }

    public void getDescription(){
        System.out.println("Холодное время года");

    }

    public void getDescription(Season obj){
        if(obj == SUMMER){
            System.out.println("Теплое время года");
        }
    }

    public String getSeason(Season obj){
        switch(obj){
            case WINTER:
                return "I LOVE WINTER";
            case SPRING:
                return "I LOVE SPRING";
            case SUMMER:
                return "I LOVE SUMMER";
            case AUTUMN:
                return "I LOVE AUTUMN";
        }
        return null;
    }
}
