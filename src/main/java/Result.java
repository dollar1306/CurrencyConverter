public class Result {
    private double value;
    private String convertType;

    public Result(double value, String convertType){
        this.value = value;
        switch (convertType){
            case ("1"):
                this.convertType="Dollar to Shekel";
                break;
            case ("2"):
                this.convertType="Shekel to Dollar";
                break;
            case ("3"):
                this.convertType="Euro to Shekel";
                break;
            default:
                this.convertType="null";
                break;
        }
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value=value;
    }

    public String getConvertType(){
        return convertType;
    }

    public void setConvertType(String convertType){
        this.convertType=convertType;
    }
}
