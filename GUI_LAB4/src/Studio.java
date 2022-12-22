public enum Studio {

    XXS(32), XS(34), S(36), M(38), L(40);

    int euroSize;

    Studio(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(Studio obj){
        if (obj != S){
            return "Not kid size";
        };
        return "Kid size";

    }

    public String getDescription(){
        return "Adult size";
    }

}
